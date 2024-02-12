package me.eguzman.learn._04_arrays_and_strings;

public class Exercise03 {

	/**
	 * Write a Java program to test if the array contains the value 5. Print out a message indicating if the value was found.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		boolean found = false;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 5) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.printf("The array contains the value 5");
		} else {
			System.out.printf("The array does not contains the value 5");
		}

	}

}
