package me.eguzman.learn._05_scanner;

import java.util.Scanner;

public class Exercise04 {

	/**
	 * Write a Java program that reads 10 integer numbers from the keyboard to print the average.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int sum = 0;
			
			for (int i = 0; i < 10; i++) {
				System.out.printf("Enter integer %d : %n", i + 1);
				sum += scan.nextInt();
			}
			
			double avg = (double) sum / 10;
			
			System.out.println("The average of the 10 integers is: " + avg);
		}

	}

}
