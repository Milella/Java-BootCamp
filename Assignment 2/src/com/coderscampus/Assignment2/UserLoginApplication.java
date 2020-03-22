package com.coderscampus.Assignment2;

//import com.coderscampus.assignment2.*; 
//import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User[] users = new User[13];
		for (int i=0; i < 13; i++) {
		
		users[i] = userService.createUser("user" + (i + 1), "password" + (i + 1), "name" + (i + 1));
		
		
		//users[0] = userService.createUser("user1", "password1", "name1");
		
		}
		//scottUser = userService.createUser("Wizzy", "Password1", "Scott Milella");
		System.out.println(users);
				
	}

}
