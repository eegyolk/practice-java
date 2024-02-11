package me.eguzman.learn._02_operators;

public class Exercise06 {

	/**
	 * Write a Java program to print the results of the following operations.
	 * 
	 * a.) -5 + 8 * 6
	 * b.) (55+9) % 9
	 * c.) 20 + -3*5 / 8
	 * d.) 5 + 15 / 3 * 2 - 8 % 3
	 */
	public static void main(String[] args) {
		int a = -5 + (8 * 6);
		System.out.println("The value of a is: " + a); // Expected result is 43
		
		int b = (55 + 9) % 9;
		System.out.println("The value of b is: " + b); // Expected result is 1
		
		int c = 20 + ((-3 * 5) / 8);
		System.out.println("The value of c is: " + c); // Expected result is 19
		
		int d = 5 + ((15 / 3) * 2) - (8 % 3);
		System.out.println("The value of d is: " + d); // Expected result is 13
		
		/**
		 * Multiplication and division operations have higher priority than addition and subtraction.
		 * Operations with equal priority are performed from left to right.
		 * parenthesis are used to control the order of operation execution.
		 * 
		 * Let's break down this expression "5 + 15 / 3 * 2 - 8 % 3"
		 * 
		 * 15 / 3 = 5
		 * 5 * 2 = 10
		 * 8 % 3 = 2
		 * 5 + 10 - 2 = 13
		 */
	}

}
