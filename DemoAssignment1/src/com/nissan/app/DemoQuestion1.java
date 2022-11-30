package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion1 {
	/*
	 * 1. For 10 oranges we have to pay Rs.45 what will be the price of 1 orange.
		You can set the status of your assignment here.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rate and no of fruits you bought: ");
		double rate=sc.nextDouble();
		int qty=sc.nextInt();
		System.out.println("Price of 1 Fruitis : "+calUnitPrice(rate, qty)+" Rs");
		
	}
	
	static double calUnitPrice(double rate, int qty) {
		return rate/qty;
	}

}
