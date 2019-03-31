package com.java.programming.masterclass.software.developers;

public class SpeedConverter {
	/*
	 * Speed Converter 1. Write a method called toMilesPerHour that has 1 parameter
	 * of type double with the name kilometersPerHour This method needs to return
	 * the rounded value of the calculation of type long if the parameter
	 * kilometersPerHour is less than o, the method toMilesPerHour needs to return
	 * -1 to indicate an invalid value.
	 * 
	 * Otherwise, if it is positive, calculate the value of miles per hour, round it
	 * and return it
	 * 
	 * For conversion and rounding check the notes in the text bellow
	 * 
	 */

	public static long toMilesPerHour(double kilmotersPerHour) {

		if (kilmotersPerHour < 0) {
			return -1;
		}

		return Math.round(kilmotersPerHour / 1.609);
	}

	public static void printConversion(double kilmotersPerHour) {

		if (kilmotersPerHour < 0) {

			System.out.println("Invalid value");
		} else {
			long milesPerHour = toMilesPerHour(kilmotersPerHour);
			System.out.println(kilmotersPerHour + "km/h = " + milesPerHour + "mi/h");
		}
	}

}
