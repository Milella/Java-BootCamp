package com.coderscampus.Assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserService {
	public static User[] users = new User[4];
	public static Scanner scanner = null;
	public static boolean userIsAuthenticated = false;

	public void dataLoad() throws IOException, FileNotFoundException {
		String line;
		int i = 0;
		BufferedReader fileReader;

		fileReader = new BufferedReader(new FileReader("data.txt"));

		while ((line = fileReader.readLine()) != null) {
			users[i] = new User(line.split(","));
			i++;
		}
		fileReader.close();
	}

	public void userLogon() {
		Scanner scanner = new Scanner(System.in);
		int atlogins = 0;
		String username = null;
		String password = null;

		while (atlogins < 5) {

			System.out.println("Enter your email: ");
			username = scanner.nextLine();

			System.out.println("Enter your Password: ");
			password = scanner.nextLine();

			for (User user : users) {

				if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
					userIsAuthenticated = true;
					System.out.println("Welcome " + user.getName());
					System.out.println("");
					scl();
					return;
				}
			}

			System.out.println("Invalid Login, please try again.");
			System.out.println("");
			atlogins++;
		}

		System.out.println("Too many failed login attempts, you are now locked out.");
		System.out.println("");

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
