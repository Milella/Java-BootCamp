package com.coderscampus.Assignment2;

import java.io.FileNotFoundException;
import java.io.IOException;

//import java.util.Scanner;

public class UserLoginApplication {

		
	public static void main(String[] args) throws FileNotFoundException, IOException {
		UserService userService = new UserService();
		userService.dataLoad();
		userService.userLogon();
		UserService.scl();
				
		}
			
}
