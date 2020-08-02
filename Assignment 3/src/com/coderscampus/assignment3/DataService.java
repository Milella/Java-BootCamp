package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataService {

	public static User[] users = new User[20];

	public static void loadData() throws IOException, FileNotFoundException {
		String line;
		Integer i = 0;
		BufferedReader fileReader;

		fileReader = new BufferedReader(new FileReader("users.txt"));

		while ((line = fileReader.readLine()) != null) {
			users[i] = new User(line.split(", "));
			i++;
		}

		fileReader.close();
	}

	public static void saveData() throws IOException {
		BufferedWriter fileWriter = null;
		System.out.println("You are exiting out of the system... \n");
		System.out.println("Saving Array Data \n");

		fileWriter = new BufferedWriter(new FileWriter("users.txt"));

		for (User user : users) {
			fileWriter.write(user.getUsername() + ", " + user.getPassword() + ", " + user.getName() + ", "
					+ user.getRole() + "\n");
		}

		System.out.println("Array Has Been Written \n");

		try {

		} finally {
			if (fileWriter != null)
				fileWriter.close();

			System.exit(0);

		}

		return;

	}

}
