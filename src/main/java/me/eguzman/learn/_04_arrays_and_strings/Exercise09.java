package me.eguzman.learn._04_arrays_and_strings;

public class Exercise09 {

	/**
	 * Write a Java program to get the character's ASCII code at the index 8 in the string.
	 * String str = “I love coding in Java”;
	 */
	public static void main(String[] args) {
		String str = "I love coding in Java";
		
		System.out.printf("The character in index 8 is %s with ASCII code %d ", str.charAt(8), (int) str.charAt(8));

	}

}
