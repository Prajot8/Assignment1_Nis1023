package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion8 {
	/*
	 * Implement a logic to swap two numbers without using a temporary variable.
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		System.out.println("Numbers you entered First("+number1+") Second("+number2+")");
		interchangeNumbers(number1,number2);
	}

	private static void interchangeNumbers(int number1, int number2) {
		number1=(number1+number2);
		number2=(number1)-number2;
		number1=(number1)-number2;
		System.out.print("Numbers After interchanged First("+number1+") Second("+number2+")");
		
	}

}
