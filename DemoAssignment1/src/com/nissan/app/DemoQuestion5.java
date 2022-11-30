package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion5 {
	/*
	 * 5. The temperature of a city in Fahrenheit is given. Write a program to convert it into Celsius.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Temperature(in Fahrenheit): ");
		double tempFarenheit=sc.nextDouble();
		System.out.print("Temperature(in DegreeCelcius): "+conInDegreeCelcius(tempFarenheit));
	}

	private static double conInDegreeCelcius(double tempFarenheit) {
		
		return ((tempFarenheit-32)*5)/9;
	}

}
