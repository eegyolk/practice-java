package me.eguzman.learn._04_arrays_and_strings;

public class Exercise16 {

	/**
	 * Write a Java program to check whether the following string has duplicate
	 * characters (exclude blank spaces). 
	 * String str = “I love coding in Java”;
	 */
	public static void main(String[] args) {
		String str = "I love coding in Java";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			}

			for (int ii = i + 1; ii < str.length(); ii++) {
				if (str.charAt(i) == str.charAt(ii)) {
					System.out.printf("Found duplicate character %c with index %d, %d %n", str.charAt(i), i, ii);
				}
			}
		}

	}

}
