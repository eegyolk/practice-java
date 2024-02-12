package me.eguzman.learn._05_scanner;

import java.util.Scanner;

public class Exercise05 {

	/**
	 * Write a Java program that generates a random number from 1 to 20, giving the user three chances to guess the number.
	 * Display a message indicating if the user guessed the number. 
	 * Hint: You can use the Math library to generate the random number.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {			
			int random = (int) ((Math.random() * 20) + 1);
			
			for (int i = 0; i < 3; i++) {
				System.out.println("Enter your a number: ");
				int num = scan.nextInt();
				
				if (num == random) {
					System.out.println("User guessed the number");
					break;
				}
			}		
			
		}

	}

}
