package com.coderscampus.assignment3;

import java.io.FileNotFoundException;
import java.io.IOException;


public class LauncherAPP {

		
	public static void main(String[] args) throws FileNotFoundException, IOException {
				
		User user = null;
		
		UserLogin userLogin = new UserLogin();
						
		DataService.loadData();
				
		user = userLogin.authenticate();
						
		CoreAPP.mainMenu(user);
		
		System.exit(0);
		
	}

}
