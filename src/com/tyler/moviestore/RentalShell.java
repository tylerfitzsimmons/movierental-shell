package com.tyler.moviestore;

import java.util.Scanner;

public class RentalShell {

	public void RentalMenu() {
		System.out.println("Welcome to a movie store rental test.");
		System.out.println("Please select an option from the list");
		System.out.println("1. Order a new rental.");
		System.out.println("2. Return rental.");
		System.out.println("3. Pay late fees.");
		System.out.println("4. Subscribe to rewards program");
		System.out.println("5. Exit.");
		Scanner menuSelect = new Scanner(System.in);
		int menuSelection = menuSelect.nextInt();
		
		switch(menuSelection) {
		case 1: 
			System.out.println("it works!");
			break;
		case 2: 
			System.out.println("it works!");
			break;
		case 3: 
			System.out.println("it works!");
			break;
		case 4: 
			System.out.println("it works!");
			break;
		case 5: 
			System.out.println("Thank you for your business!");
			System.exit(0);
			break;
		}
		
		
	}

}