package me.eguzman.learn._04_arrays_and_strings;

public class Exercise15 {

	/**
	 * Write a Java program to check whether the first two characters appear at the end of the following string.
	 * String str = “educated”;
	 */
	public static void main(String[] args) {
		String str = "educated";
		
		String firstTwoChar = str.substring(0, 2);
		
		if (str.endsWith(firstTwoChar)) {
			System.out.printf("The string %s ends with %s %n", str, firstTwoChar);
		}

	}

}
