package com.tyler.moviestore;
import java.util.Arrays;
import java.util.Scanner;

public class MovieInventory {
	Scanner movieSelect = new Scanner(System.in);
	String movieTitle;
	double moviePrice;
	int movRentPeriod;

	
	public void Inventory() {
		String[] movieOptions = {"MovieOne", "MovieTwo", "MovieThree", "MovieFour", "MovieFive"};
		System.out.println(Arrays.toString(movieOptions));
		String selection = movieSelect.nextLine();
		
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
	}
	
	private void MovieTwo() {
		movieTitle = "MovieTwo";
		moviePrice = 5.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
	}
	
	private void MovieThree() {
		movieTitle = "MovieThree";
		moviePrice = 9.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
	}
	
	private void MovieFour() {
		movieTitle = "MovieFour";
		moviePrice = 7.00;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
	}
	
	private void MovieFive() {
		movieTitle = "MovieFive";
		moviePrice = 2.50;
		movRentPeriod = 7;
		System.out.println("Title: " + movieTitle + " Price: " + moviePrice + " Rental Duration: " + movRentPeriod);
	}

}
