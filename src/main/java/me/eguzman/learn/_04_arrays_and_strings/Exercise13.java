package me.eguzman.learn._04_arrays_and_strings;

public class Exercise13 {

	/**
	 * Write a Java program to compare the following two strings, ignoring case considerations.
	 * String str1 = “I love coding in Java”;
	 * String str2 = “I Love Coding In Java”;
	 */
	public static void main(String[] args) {
		String str1 = "I love coding in Java";
		String str2 = "I Love Coding In Java";
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("The two strings is match");
		} else {
			System.out.println("The two strings doesn't match");
		}

	}

}
