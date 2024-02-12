package me.eguzman.learn._05_scanner;

import java.util.Scanner;

public class Exercise02 {

	/**
	 * Write a program in Java that converts from Canadian dollars to US dollars. 
	 * You will get a decimal number corresponding to the amount in CAD from the keyboard and print out an answer with the corresponding amount 
	 * in US dollars. Use today’s exchange rate. Note: Use the scanner class to get the User input.
	 */
	public static void main(String[] args) {
		/**
		 * Exchange rate:
		 * 
		 * 1 CAD = 0.74 USD
		 */
		
		double rate = 0.74;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter amount of CAD to convert in USD:");
			
			double cad = scan.nextDouble();
		
			double exchange = cad * rate;
			
			System.out.printf("The exchange rate is %.2f USD %n", exchange);
		}

	}

}
