package com.coderscampus.assignment3;

import java.io.FileNotFoundException;
import java.io.IOException;


public class LauncherAPP {

		
	public static void main(String[] args) throws FileNotFoundException, IOException {
				
		LauncherAPP launcherapp = new LauncherAPP();
		User user = null; 
		DataLoad dataLoad = new DataLoad();
		UserLogin userLogin = new UserLogin();
		CoreAPP coreapp = new CoreAPP();
				
		dataLoad.loadData();
		//System.out.println("------------------");
		//System.out.println(user);
		//System.out.println("------------------");
		
		userLogin.authenticate(user);
		
		System.out.println("--- User returned from userLogin Class ---");
		System.out.println(user);
		System.out.println("------------------------------------------");
		
		CoreAPP.mainMenu(user);
		
		
	}

}
