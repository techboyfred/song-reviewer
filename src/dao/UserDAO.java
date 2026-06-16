package dao;
import model.User;
import util.DatabaseConnection;
import util.PasswordUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class UserDAO {
	public boolean register(User user) {
		
		if (emailAlreadyExists(user.getEmail()))
			return false; //stop user from registering or reprompt them to enter a different email
		
		//sql query to insert(register) new user
		String sql = "INSERT INTO AppUser (Username, Email, PasswordHash) VALUES (?, ?, ?)";
		
		try (Connection connection = DatabaseConnection.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql))
		{
			String hashedPassword = PasswordUtil.hashPassword(user.getPassword());
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getEmail());
			statement.setString(3, hashedPassword);
			
			if (statement.executeUpdate() == 1) //verify if inserted one row(user)
				return true;
			else
				return false;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean emailAlreadyExists(String email) {
		//sql query to count number of users with specified email address
		String sql = "SELECT COUNT(*) FROM AppUser WHERE Email = ?";
		
		try (Connection connection = DatabaseConnection.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql))
		{
			ResultSet result = statement.executeQuery();
			if (result.next()) {
	            int numUsers = result.getInt(1); //the number in the column into actual java int
	            return numUsers > 0; //returns true when the email already exists
	        }
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	public User login(String email, String plainPassword) {
		User foundUser = null;
		//sql query to get the user with specified email
		String sql = "SELECT * FROM AppUser WHERE Email = ?";
		
		try (Connection connection = DatabaseConnection.getConnection();
			 PreparedStatement statement = connection.prepareStatement(sql))
		{
			statement.setString(1, email); //use the email to identify user
			ResultSet result = statement.executeQuery(); //result is the actual user
			
			if (result.next()) {
				String hashFromDatabase = result.getString("PasswordHash");
				if (PasswordUtil.checkPassword(plainPassword, hashFromDatabase)) {
					//continue if the provided password matches
					int userID = result.getInt("UserID");
					String username = result.getString("Username");
					LocalDateTime createdAt = result.getTimestamp("CreatedAt").toLocalDateTime();
					foundUser = new User(userID, username, email, hashFromDatabase, createdAt);
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return foundUser;
	}
}

