package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion4 {
	/*
	 * 4. The distance between two cities (KM) is input through the keyboard. 
	 * Write a program to convert and print this distance in meters, feet, inches and centimeters.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Distance between two cities(in Km): ");
		int distanceKm=sc.nextInt();
		System.out.println("Distance in meters : "+conInMeters(distanceKm)+
				"\nEquivallent in feet: "+conInFeet(distanceKm)+
				"\nEquivallent in inches: "+conInInch(distanceKm)+
				"\nEquivallent in Centimeter: "+conInCentimeters(distanceKm));

	}

	private static double conInCentimeters(int distanceKm) {
		
		return distanceKm*100000;
	}

	private static double conInInch(int distanceKm) {
		
		return distanceKm*39370.1;
	}

	private static double conInFeet(int distanceKm) {
		
		return distanceKm*3280.84;
	}

	private static double conInMeters(int distanceKm) {
		
		return distanceKm*1000;
	}

}
