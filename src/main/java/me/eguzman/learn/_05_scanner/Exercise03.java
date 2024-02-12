package me.eguzman.learn._05_scanner;

import java.util.Scanner;

public class Exercise03 {

	/**
	 * Write a program in Java that reads two numbers from the keyboard and says which is the largest and which is the smallest.
	 */
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the first integer: ");
			int num1 = scan.nextInt();
			
			System.out.println("Enter the second integer: ");
			int num2 = scan.nextInt();
			
			if (num1 > num2) {
				System.out.printf("%d is greather than %d", num1, num2);
				
			} else if (num1 < num2) {
				System.out.printf("%d is less than %d %n", num1, num2);
				
			} else {
				System.out.printf("%d is equal with %d %n", num1, num2);
			}
		}

	}

}
