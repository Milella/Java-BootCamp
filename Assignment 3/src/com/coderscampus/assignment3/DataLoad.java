package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DataLoad {

	public static User[] users = new User[20];

	
	public void loadData() throws IOException, FileNotFoundException {
		String line;
		int i = 0;
		BufferedReader fileReader;

		fileReader = new BufferedReader(new FileReader("users.txt"));

		while ((line = fileReader.readLine()) != null) {
			users[i] = new User(line.split(", "));
			i++;
		}
		for (User user: users) {
			System.out.println(user);
		}
		
		fileReader.close();
	
	}
	
}
