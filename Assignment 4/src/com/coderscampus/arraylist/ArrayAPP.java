package com.coderscampus.arraylist;

//import java.util.ArrayList;
//import java.util.List;

public class ArrayAPP {

	public static void main(String[] args) {
		CustomList<Integer> digits = new CustomArrayList<>();
		for (int i=1; i<=923021; i++) {
			digits.add(i);
		}
			
		for (int i=0; i<digits.getSize(); i++) {
			System.out.println(digits.get(i));
		}
		
	}
}
