package me.eguzman.learn._04_arrays_and_strings;

import java.util.Arrays;

public class Exercise06 {

	/**
	 * Write a Java program to reverse the array.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int counter = 0;
		
		int[] newArray = new int[array.length];
		
		for (int i = array.length - 1; i >= 0; i--) {
			newArray[counter] = array[i];
			counter++;
		}
		
		System.out.println("The reverse array is " + Arrays.toString(newArray));

	}

}
