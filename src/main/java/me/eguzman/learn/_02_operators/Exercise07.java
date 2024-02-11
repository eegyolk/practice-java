package me.eguzman.learn._02_operators;

public class Exercise07 {

	/**
	 * Write a Java program that, given the following variable, prints out the sum of its digits.
	 * int a = 123; // Print out: 6
	 */
	public static void main(String[] args) {		
		int a = 123;
		
		int sum = a % 10; // Result is 3
		
		a /= 10; // Result is 12
		
		sum += a % 10; // Result is 2
		
		a /= 10; // Result is 1
		
		sum += a % 10;  // Result is 6
		
		a /= 10; // At this point the value is 0 so we should get the expected output
		
		System.out.println("The value of sum is: " + sum); // Expected is 6
		
		/**
		 * The digit sum of a number is the sum of all its individual digits. For example, the digit sum of 123 is 1 + 2 + 3 = 6.
		 * 
		 * Here's how you can calculate the digit sum of a number programmatically:
		 * 
		 * 1. Extract each digit, use modulo by 10 then divide by 10 because we're using the base-10 number system
		 * 2. Add each digit to the sum
		 * 3. Until no more digits left
		 */

	}

}
