package me.eguzman.learn._04_arrays_and_strings;

public class Exercise14 {

	/**
	 * Write a Java program to get the index of all the alphabet characters in the following string.
	 * String str = "The quick brown fox jumps over the lazy dog.";
	 */
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		
		char whitespace = ' ';
		char dot = '.';
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != whitespace && str.charAt(i) != dot) {
				System.out.printf("The character %c has index %d %n", str.charAt(i), i);
			}
			
		}

	}

}
