package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion7 {
	/*
	 * 7. Raju’s basic salary is given. 
	 * His dearness allowance is 40% of the basic salary and house rent allowance is 20%. 
	 * Calculate his total salary.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Raju's basic salary: ");
		double basicSal=sc.nextDouble();
		System.out.println("Raju's Total Salary will be: "+calTotalSal(basicSal)+" Rs");
	}

	private static double calTotalSal(double basicSal) {
		
		return basicSal+0.4*basicSal+0.2*basicSal;
	}

}
