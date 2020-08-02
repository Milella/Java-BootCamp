package com.coderscampus.assignment3;

import java.io.IOException;
import java.util.Scanner;

public class CoreAPP {

	public static String 	prompt;
	public static String 	arrayUser;
	public static Boolean 	foundOtherUser 	= false;
	public static Scanner 	scanner 		= new Scanner(System.in);
	public static String 	anyKey;

	public static void mainMenu(User user) throws IOException {
		System.out.println(
				"\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n");
		System.out
				.println("Welcome " + user.getName() + "; you are Logged in with the Username: " + user.getUsername());
		System.out.println("");
		System.out.println("MAIN MENU");
		System.out.println("----------------------------------------------------------------");

		if (UserLogin.superUserLoggedIn) {
			System.out.println("(0) - Log in as another user");
		}

		System.out.println("(1) - Update UserName");
		System.out.println("(2) - Update Password");
		System.out.println("(3) - Update Name");
		System.out.println("(4) - Exit");
		System.out.println("\n");
		prompt = scanner.nextLine();

		if (CoreAPP.prompt.equals("0")) {
			CoreAPP.zeroMenu(user);
		}

		if (CoreAPP.prompt.equals("1")) {
			System.out.println("You Pressed 1");
			System.out.println("");
			System.out.println("Your Current Username IS: " + user.getUsername());
			System.out.println("");
			System.out.println("Change Your Username TO:");
			prompt = scanner.nextLine();
			user.setUsername(prompt);
			System.out.println("");
			System.out.println("Your Username Is NOW: " + user.getUsername());
			System.out.println("");
		}

		if (CoreAPP.prompt.equals("2")) {
			System.out.println("You Pressed 2");
			System.out.println("");
			System.out.println("Your Current Password IS: " + user.getPassword());
			System.out.println("");
			System.out.println("Change Your Password TO:");
			prompt = scanner.nextLine();
			user.setPassword(prompt);
			System.out.println("");
			System.out.println("Your Password Is NOW: " + user.getPassword());
			System.out.println("");
		}

		if (CoreAPP.prompt.equals("3")) {
			System.out.println("You Pressed 3");
			System.out.println("");
			System.out.println("Your Current Name is: " + user.getName());
			System.out.println("");
			System.out.println("Change Your Name TO:");
			prompt = scanner.nextLine();
			user.setName(prompt);
			System.out.println("");
			System.out.println("Your Name is now: " + user.getName());
			System.out.println("");
		}

		if (CoreAPP.prompt.equals("4")) {
			System.out.println("You Pressed 4");
			System.out.println("");
			scannerClose();
			DataService.saveData();
		}

		CoreAPP.mainMenu(user);

	}

	private static User zeroMenu(User user) throws IOException {

		if (UserLogin.superUserLoggedIn) {
			foundOtherUser = false;
			System.out.println("You Pressed 0");
			System.out.println("");
			System.out.println("Which User would you like to Login AS:");
			System.out.println("");
			System.out.println("Or type in your current Username OF: " + user.getUsername() + " to EXIT this Prompt");
			prompt = scanner.nextLine();

			while (!foundOtherUser) {
				for (User arrayUser : DataService.users) {

					if (arrayUser.getUsername().equalsIgnoreCase(prompt)) {
						System.out.println("");
						System.out.println("Your Username Is NOW: " + user.getUsername());
						user = arrayUser;
						foundOtherUser = true;
					}
				}

				if (foundOtherUser) {
					CoreAPP.mainMenu(user);
				}

				System.out.println("\n" + prompt + " does not match our records" + "\nPlease Try Again!");
				System.out.println("\n" + "Press Enter to Continue: ");
				anyKey = scanner.nextLine();
				CoreAPP.zeroMenu(user);

			}
		}

		return user;

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