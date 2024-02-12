package me.eguzman.learn._04_arrays_and_strings;

public class Exercise11 {

	/**
	 * Write a Java program to check whether the string ends in “ava”.
	 * String str = “I love coding in Java”;
	 */
	public static void main(String[] args) {
		String str = "I love coding in Java";
		
		if (str.endsWith("ava")) {
			System.out.println("The string does ends with 'ava'");
		} else {
			System.out.println("The string doesn't ends with 'ava'");
		}

	}

}
