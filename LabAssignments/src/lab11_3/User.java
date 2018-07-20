package lab11_3;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args) {

		UserInterface lm = (userName, password) -> {
			if (userName.equalsIgnoreCase("ADMIN") && password.equals("Admin@123"))
				return true;
			else
				return false;
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Custom username is ADMIN and password is Admin@123");
		System.out.println("enter the username");
		String uName = sc.next();
		System.out.println("enter the password");
		String pass = sc.next();

		System.out.println(lm.validation(uName, pass));

	}
}
