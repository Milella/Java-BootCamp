package com.coderscampus.learning_java_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainAPP {

	public static void main(String[] args) {
	
	Map<Integer, String> cars = new HashMap<>();
	
	cars.put(350, "Nissan 350Z");
	cars.put(370, "Nissan 370Z");
	cars.put(240, "Nissan 240Z");	
	cars.put(260, "Nissan 260Z");
	cars.put(280, "Nissan 280Z");
	cars.put(281, "Nissan 280ZX");
	
	System.out.println("---------------------------------");
	//for ( Map<Integer, String> car : cars ) {
	//	System.out.println(car);
	
	 cars.forEach((k,v) -> System.out.println(k + v)); 
	
	
	
	
	
	
	
	//extracted4();	
	//extracted();
	
	List<String> elementsBackup;
	List<String> elements = extracted3();
	
	elementsBackup = elements;
	
	System.out.println("---------------------------------");
	for (String elementBackup : elementsBackup) {
		System.out.println(elementBackup);
	}
	
	
	extracted2();
	
	}

	private static void extracted4() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<Integer>();
		
		System.out.println(uniqueNumbers.add(87));
		System.out.println(uniqueNumbers.add(76));
		System.out.println(uniqueNumbers.add(66));	
		System.out.println(uniqueNumbers.add(88));	
		System.out.println(uniqueNumbers.add(100));
		
		
				
		System.out.println("---------------------------------");
		for (Integer uniqueNumber : uniqueNumbers) {
				System.out.println(uniqueNumber);
		}
	}

	private static List<String> extracted3() {
		List<String> elements = new ArrayList<>();
		List<String> elementsBackup = new ArrayList<>();
		
		elements.add("Trevor Page");
		elements.add("Scott Milella");
		elements.add("Laura Ellis");
		elements.add("Amber Milella");
		elements.add("Paige Milella");
		elements.add("SiphonIfe");
		
		System.out.println("List Example:");
		System.out.println("--------------------------------");
		
		for (String element : elements) {
			System.out.println(element);
		}
		return elements;
	}

	private static void extracted2() {
		List<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(11);
		numbers.add(1000);
		numbers.add(10000);
		numbers.add(20);
		numbers.add(30);
		numbers.add(48);
		
		System.out.println("---------------------------------");
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

	private static void extracted() {
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
