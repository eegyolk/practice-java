package me.eguzman.learn._02_operators;

public class Exercise04 {

	// Write a program in Java that prints the division of 1234 between 532 in the console.
	public static void main(String[] args) {
		int num1 = 1234;
		int num2 = 532;
		
		double quotient = num1/ (double)num2;
		
		System.out.println("The quotient is: " + quotient);
		
		/**
		 * The expected result is 2.319548872180451
		 * Instead of declaring the "quotient" as int type, use double type and also convert the int type dividend or divisor to double
		 * to get the decimal values.
		 */
	}

}
