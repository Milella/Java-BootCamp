package com.coderscampus.assignment3;

import java.io.FileNotFoundException;
import java.io.IOException;


public class LauncherAPP {

	
	//public static Scanner scanner = null;
		
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//LauncherAPP launcherapp = new LauncherAPP();
		DataLoad dataLoad = new DataLoad();
		dataLoad.loadData();
		
		UserLogin userLogin = new UserLogin();
		userLogin.authenticate();
		
		CoreAPP coreapp = new CoreAPP();
		coreapp.mainMenu(DataLoad.user);
				
		
	}

}
