package me.eguzman.learn._02_operators;

public class Exercise05 {

	/**
	 * Write a Java program to print out the values of the following expressions:
	 * 
	 * a.) (101 + 0) / 3
	 * b.) 3.0e-6 * 10000000.1
	 * c.) true && true
	 * d.) false && true
	 * e.) (false && false) || (true && true)
	 * f.) (false || false) && (true && true)
	 */
	public static void main(String[] args) {
		double a = (double) (101 + 0) / 3;
		System.out.println("The value of a is: " + a);
		
		double b = 3.0e-6 * 10_000_000.1; // Use underscore to separate the number to make it more readable, used since Java SE 7
		System.out.println("The value of b is: " + b);
		
		boolean c = true && true;
		System.out.println("The value of c is: " + c);
		
		boolean d = false && true;
		System.out.println("The value of d is: " + d);
		
		boolean e = (false && false) || (true && true);
		System.out.println("The value of e is: " + e);
		
		boolean f = (false || false) && (true && true);
		System.out.println("The value of f is: " + f);

	}

}
