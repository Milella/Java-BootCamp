package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLogin {

	public static Scanner scanner = new Scanner(System.in);
	public static Boolean userIsAuthenticated = false;
	public static Boolean superUserLoggedIn = false;
	String line;
	Integer i = 0;

	public User authenticate() {
		
		Integer atlogins = 0;
		String username = null;
		String password = null;

		while (atlogins < 5) {

			System.out.println("Please Enter in your Username and Password to Login to the SYSTEM: \n");

			System.out.println("Enter your Username: ");
			username = scanner.nextLine();

			System.out.println("Enter your Password: ");
			password = scanner.nextLine();

			for (User user : DataService.users) {

				if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
					userIsAuthenticated = true;
					System.out.println("");
					System.out.println("Welcome " + user.getName());
					System.out.println("");
					System.out.println("You are a :" + user.getRole());

					if (user.getRole().equals("super_user")) {
						superUserLoggedIn = true;
					}

					System.out.println("----------------");

					return user;

				}
			}

			System.out.println("Invalid Login, please try again.");
			System.out.println("");
			atlogins++;
		}

		System.out.println("Too many failed login attempts, you are now locked out.");
		System.out.println("");
		scannerClose();
		System.exit(0);
		return null;

	}

	private static void scannerClose() {
		
		try {

		} finally {
			if (scanner != null)
				scanner.close();
		}
	return;	
	
	}

}