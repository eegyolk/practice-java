package me.eguzman.learn._04_arrays_and_strings;

public class Exercise05 {

	/**
	 * Write a Java program to find the maximum and minimum values in the array.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		
		int max = array[0];
		int min = array[0];
		
		for (int item: array) {
			if (item >= max) {
				max = item;
			}
			
			if (item <= min) {
				min = item;
			}
		}
		
		System.out.println("The maximum value is: " + max);
		System.out.println("The manimum value is: " + min);

	}

}
