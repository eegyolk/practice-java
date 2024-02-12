package me.eguzman.learn._05_scanner;

import java.util.Scanner;

public class Exercise01 {

	/**
	 * Write a program in Java that reads an integer from the keyboard and sums all the following 100 numbers, including the number given, 
	 * showing the result on the screen.
	 */
	public static void main(String[] args) {
		// The try will free up the memory used by Scanner object
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter an integer:");
			
			int num = scan.nextInt();
			
			int sum = 0;
			
			for (int i = 1; i <= 100; i++) {
				sum += num + i;
			}
						
			System.out.println("The sum of the input and 100 numbers is: " + sum);
		}
	}

}
