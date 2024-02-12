package me.eguzman.learn._04_arrays_and_strings;

public class Exercise01 {

	/**
	 * Write a Java program to sum the values of the array. Print out the sum.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int sum = 0;
		
		for (int item: array) {
			sum += item;
		}
		
		System.out.println("The sum is: " + sum);

	}

}
