package com.nissan.app;

import java.util.Scanner;

public class DemoQuestion2 {
	/*
	 * 2. Ramu visited the bookstore to buy books for his kid. 
	 * He bought notebooks for Rs.100 and magic pot for Rs.50. 
	 * How much money did Ramu spend in the bookstore?
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter price of notebook & magic pot you bought: ");
		int priceNotebook=sc.nextInt();
		int priceMagicPot=sc.nextInt();
		System.out.println("Total Money Spend in bookStore: "+calTotalMoneySpend(priceNotebook,priceMagicPot));

	}

	private static int calTotalMoneySpend(int priceNotebook, int priceMagicPot) {
		
		return priceNotebook+priceMagicPot;
	}

}
