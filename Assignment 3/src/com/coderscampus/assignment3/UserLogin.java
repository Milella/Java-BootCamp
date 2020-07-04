package com.coderscampus.assignment3;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {
	
	public static Scanner scanner = null;
	public static boolean userIsAuthenticated = false;
	String line;
	int i = 0;
		
	public User authenticate() throws FileNotFoundException   {
			
				
		Scanner scanner = new Scanner(System.in);
		int atlogins = 0;
		String username = null;
		String password = null;

		while (atlogins < 5) {

			System.out.println("Enter your email: ");
			username = scanner.nextLine();

			System.out.println("Enter your Password: ");
			password = scanner.nextLine();

			for (User user : DataLoad.users) {

				if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
					userIsAuthenticated = true;
					System.out.println("Welcome " + user.getName());
					System.out.println("");
					System.out.println("You are a :" + user.getRole());
					//scl();
					return user;
				}
			}

			System.out.println("Invalid Login, please try again.");
			System.out.println("");
			atlogins++;
		}

		System.out.println("Too many failed login attempts, you are now locked out.");
		System.out.println("");
		return null;
		
	}

	public static void scl() {
		//scl stands for ScannerCLose, 
		try {

		} finally {
			if (scanner != null)
				scanner.close();
		}
	}

}	