package com.coderscampus.Assignment1;

import java.util.Scanner;
import java.util.Random;

public class FiveGuesses {

	public static void main (String[] args) {
		
		//GAME PREP:
		int theRandomNumber, userGuesses = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		theRandomNumber = random.nextInt(100)+1;
										
		//GAME STARTS:
		while (userGuesses <=4) {
			System.out.println("");
			System.out.print("Pick a number between 1 and 100 ");
			int guess = scanner.nextInt();
			
			
		//ENGINE TO CHECK NUMBER	
			if (guess <= 0 | guess >= 101) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				System.out.println("");
			}
						
 			if (guess < theRandomNumber) {
 				userGuesses ++;
 				System.out.println("");
 				System.out.println("Please pick a higher number");
 			}
			
 			if (guess > theRandomNumber) {
 				userGuesses ++;
 				System.out.println("");
 				System.out.println("Please pick a lower number");
 			}
		 		
 			if (guess == theRandomNumber) {
 				userGuesses ++;
 				System.out.println("");
 				System.out.println("You WIN!");
 				scanner.close();
 				System.exit(0);
 			}
	 	 			
		}
		
		System.out.println("");
		System.out.println("You lose.");
		System.out.println("");
	 	System.out.println("The number to guess was: " + theRandomNumber);	
	 	scanner.close();	 	
		
	}	
}
