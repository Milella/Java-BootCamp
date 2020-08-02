package com.coderscampus.assignment3;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {
	
	public static Scanner scanner = null;
	public static boolean userIsAuthenticated = false;
	String line;
	int i = 0;
		
	public User authenticate(User user) throws FileNotFoundException   {
			
				
		Scanner scanner = new Scanner(System.in);
		int atlogins = 0;
		String username = null;
		String password = null;

		while (atlogins < 5) {

			System.out.println("Enter your email: ");
			username = scanner.nextLine();

			System.out.println("Enter your Password: ");
			password = scanner.nextLine();

			for (User authuser : DataLoad.users) {

				if (authuser.getUsername().equalsIgnoreCase(username) && authuser.getPassword().equals(password)) {
					userIsAuthenticated = true;
					System.out.println("Welcome " + authuser.getName());
					System.out.println("");
					System.out.println("You are a :" + authuser.getRole());
					//scl();
					
					user=authuser;						
					System.out.println(user);
					System.out.println("----------------");
					System.out.println(user);
						
					
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