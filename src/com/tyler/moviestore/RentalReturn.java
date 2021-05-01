package com.tyler.moviestore;

import java.util.Scanner;

public class RentalReturn {
	
	
	private String rentalTitled;
	private int rentalDuration;
	private double amountPaid;
	Scanner scan = new Scanner(System.in);

	public void setRentalTitled(String rentalTitled) {
		this.rentalTitled = rentalTitled;
	}
	
	public String getRentalTitled() {
		return rentalTitled;
	}
	
	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	public int getRentalDuration() {
		return rentalDuration;
	}
	
	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	public double getAmountPaid() {
		return amountPaid;
	}
	
	public void viewRentals() {
		System.out.println("Movie Title: " + getRentalTitled()); 
		System.out.println("Rental Duration: " +getRentalDuration());
		System.out.println("Amount Paid: " + getAmountPaid());
		System.out.println("Press 1 to return rental");
		int choiceMade = scan.nextInt();
		if(choiceMade == 1) {
			setRentalTitled(null);
			setRentalDuration(0);
			setAmountPaid(0.0);
			System.out.println("Movie returned. Returning to storefront.");
			RentalShell rs = new RentalShell();
			rs.RentalMenu();
		}
		else {
			System.out.println("Invalid input");
		}
		
	}

}
