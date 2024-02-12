package me.eguzman.learn._04_arrays_and_strings;

public class Exercise07 {

	/**
	 * Write a Java program to find the number of even and odd integers in the array.
	 * int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
	 */
	public static void main(String[] args) {
		int[] array = {7, 3, 6, 2, 8, 1, 5, 4, 9, 10};
		int odd = 0, even = 0;
		
		for (int item: array) {
			int mod = item % 2;
			
			if (mod == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.printf("The number of odd is %d and even is %d", odd, even);

	}

}
