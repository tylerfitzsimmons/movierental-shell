package com.tyler.moviestore;

import java.util.Scanner;

public class RentalShell {

	public void RentalMenu() {
		System.out.println("Welcome to a movie store rental test.");
		System.out.println("Please select an option from the list");
		System.out.println("1. View movies available for rent.");
		System.out.println("2. Return rental.");
		System.out.println("3. Pay late fees.");
		System.out.println("4. Subscribe to rewards program");
		System.out.println("5. Exit.");
		Scanner menuSelect = new Scanner(System.in);
		int menuSelection = menuSelect.nextInt();
		
		switch(menuSelection) {
		case 1: 
			MovieInventory mi = new MovieInventory();
			mi.Inventory();
			break;
		case 2: 
			RentalReturn rr = new RentalReturn();
			rr.setAmountPaid(0);
			rr.setAmountPaid(0.0);
			rr.setRentalTitled("");
			System.out.println("If you had an outstanding rental, it has been returned.");
			RentalMenu();
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
