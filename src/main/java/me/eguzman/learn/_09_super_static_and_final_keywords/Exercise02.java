package me.eguzman.learn._09_super_static_and_final_keywords;

/**
 * Write a Java program to create a class Calculator with a method called add() that takes two integers and returns their sum and 
 * another method called multiply() that takes two integers and returns their multiplication. 
 * Create another class that calls the methods add() and multiply() of the Calculator class without creating an instance of Calculator. 
 * Hint: make the methods static.
 */

class Calculator {
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int multiply(int num1, int num2) {
		return num1 * num2;
	}
}

public class Exercise02 {

	public static void main(String[] args) {
		int sum = Calculator.add(1, 2);
		int product = Calculator.multiply(1, 2);
		
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " +  product);

	}

}
