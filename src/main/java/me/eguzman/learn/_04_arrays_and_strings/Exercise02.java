package me.eguzman.learn._04_arrays_and_strings;

public class Exercise02 {

	/**
	 * Write a Java program to calculate the average value of the array elements. Print out the average value.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int sum = 0;
		
		for (int item: array) {
			sum += item;
		}
		
		double average = (double) sum / array.length;
		
		System.out.println("The average is : " + average);
		
	}

}
