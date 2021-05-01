package com.tyler.moviestore;
import java.util.Arrays;
import java.util.Scanner;

public class MovieInventory {
	Scanner scan = new Scanner(System.in);
	RentalReturn rr = new RentalReturn();
	String movieTitle;
	double moviePrice;
	int movRentPeriod;
	boolean rentalPossible = false;


	public void Inventory() {
		System.out.println("Please select a movie to view. You can decide whether to rent it or not later.");
		String[] movieOptions = {"MovieOne", "MovieTwo", "MovieThree", "MovieFour", "MovieFive"};
		System.out.println(Arrays.toString(movieOptions));
		String selection = scan.nextLine();

		if(selection.equalsIgnoreCase("MovieOne")) {
			MovieOne();
		}
		else if(selection.equalsIgnoreCase("MovieTwo")) {
			MovieTwo();
		}
		else if(selection.equalsIgnoreCase("MovieThree")) {
			MovieThree();
		}
		else if(selection.equalsIgnoreCase("MovieFour")) {
			MovieFour();
		}
		else if(selection.equalsIgnoreCase("MovieFive")) {
			MovieFive();
		}
		else {
			System.out.println("Invalid option. Please input a movie title from the inventory list.");
			Inventory();
		}

	}

	private void MovieOne() {
		movieTitle = "MovieOne";
		moviePrice = 3.99;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
		RentalQueue();
	}

	private void MovieTwo() {
		movieTitle = "MovieTwo";
		moviePrice = 5.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
		RentalQueue();
	}

	private void MovieThree() {
		movieTitle = "MovieThree";
		moviePrice = 9.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
		RentalQueue();
	}

	private void MovieFour() {
		movieTitle = "MovieFour";
		moviePrice = 7.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
		RentalQueue();
	}

	private void MovieFive() {
		movieTitle = "MovieFive";
		moviePrice = 2.50;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
		RentalQueue();
	}
	
	public void RentalQueue() {
		System.out.println("Do you want to rent this movie? y/n");
		String selection = scan.nextLine();
		if(selection.equalsIgnoreCase("y")) {
		RentMovie();
		} 
		else {
			System.out.println("Returning to movie selection");
			Inventory();
		}
		
	}
	
	public void RentMovie() {
		rentalPossible = true;
		rr.setRentalTitled(movieTitle);
		rr.setRentalDuration(movRentPeriod);
		rr.setAmountPaid(moviePrice);
		rr.viewRentals();
	}

}