package util;


public class ValidateUtil {
	public static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		return email.matches(emailRegex);
	}
}
