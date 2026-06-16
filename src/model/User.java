package model;
import java.time.LocalDateTime;

public class User {
	private String Username;
	private String Password;
	private String Email;
	private int UserID;
	private LocalDateTime createdAt;
	
	/**
	 * @param username
	 * @param passwordHash
	 * @param email
	 * @param userID
	 * @param createdAt date created
	 */
	public User(int userID, String username, String email, String password, LocalDateTime createdAt) {
		super();
		Username = username;
		Password = password;
		Email = email;
		UserID = userID;
		this.createdAt = createdAt;
	}

	/**
	 * @return the createdAt
	 */
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return Username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		Username = username;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return UserID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		UserID = userID;
	}
	
}
