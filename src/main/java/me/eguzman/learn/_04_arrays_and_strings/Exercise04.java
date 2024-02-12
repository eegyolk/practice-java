package me.eguzman.learn._04_arrays_and_strings;

public class Exercise04 {

	/**
	 * Write a Java program to find the index of value 4 in the array.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 4) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			System.out.println("The value 4 is found at index " + index);
		} else {
			System.out.println("The value 4 is not in the array");
		}
	}

}
