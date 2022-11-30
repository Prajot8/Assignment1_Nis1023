package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion3 {
	/*
	 * 3. Read two numbers, divide the first number by the second and print the quotient and remainder.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		System.out.println("By Performing "+number1+"/"+number2);
		System.out.println("Quotient : "+calQuotient(number1,number2)+
				" Remainder: "+calRemainder(number1,number2));

	}

	private static int calRemainder(int number1, int number2) {
				return number1%number2;
	}

	private static int calQuotient(int number1, int number2) {
		return number1/number2;
	}

}
