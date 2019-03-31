package com.java.programming.masterclass.software.developers;

public class CodingExercise_1 {

	/*
	 * Positive, Negative or Zero Write a method called checkNumber with an int
	 * parameter number. The method should not return any value, and it needs to
	 * print out.
	 * 
	 * "positive" if the parameter number is > 0 "negative" if the parameter number
	 * is < 0 "zero" if the parameter number is equal to 0
	 * 
	 * 
	 * Note : The checkNumber method needs to be defined as public static like was
	 * have been doing so far in the course.
	 * 
	 * Note : Do note add a main method to your solution code!
	 * 
	 * 
	 */

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("positive");
		}

		else if (number < 0) {
			System.out.println("negative");
		}
		
		else if (number == 0) {
			System.out.println("zeor");
		}

	}
}
