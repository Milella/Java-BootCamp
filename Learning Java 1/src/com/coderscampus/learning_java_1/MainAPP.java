package com.coderscampus.learning_java_1;

import java.util.Arrays;

public class MainAPP {

	public static void main(String[] args) {
	
		
	Person[] people = new Person[9];
	
	people[0] = new Person("Scott Milella", 48);
	people[1] = new Person("Amber Milella", 28);
	people[2] = new Person("Julie Milella", 49);
	people[3] = new Person("Laura Milella", 45);
	people[4] = new Person("Angelo Milella", 73);
	people[5] = new Person("Anthony Milella", 65);
	people[6] = new Person("Laura Ellis", 45);
	people[7] = new Person("Cody Kyle", 20);
	people[8] = new Person("Brad Kyle", 50);
		
	for (Person person: people) System.out.println(person);
	
	System.out.println("---------------");
	
	Arrays.sort(people);
	
	for (Person person: people) System.out.println(person);
	
		
		
	}

}
