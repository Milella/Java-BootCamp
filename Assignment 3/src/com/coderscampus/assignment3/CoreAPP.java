package com.coderscampus.assignment3;

public class CoreAPP {

	public static void mainMenu(User user) {	
	System.out.println("MAIN MENU");
	System.out.println("Logged in user = " + user );
	System.out.println("------------------------------");
	
	System.out.println(user.getRole());
	
	if (user.getRole().equals("super_user")) {
		System.out.println("(0) - Log in as another user");
	}
	
	System.out.println("(1) - Update UserName");
	System.out.println("(2) - Update Password");
	System.out.println("(3) - Update Name");
	System.out.println("(4) - Exit");
	System.out.println("MAIN MENU");
	System.out.println("MAIN MENU");
	System.out.println("MAIN MENU");
	
	
	
	}
	
}