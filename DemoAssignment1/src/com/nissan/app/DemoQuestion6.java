package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion6 {
	/*
	 *  6. Two numbers are stored in locations i and j. Write a program to interchange the numbers.
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
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.print("Numbers After interchanged First("+number1+") Second("+number2+")");
		
	}
	

}
