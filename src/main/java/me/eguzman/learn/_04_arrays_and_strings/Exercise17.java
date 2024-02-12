package me.eguzman.learn._04_arrays_and_strings;

public class Exercise17 {

	/**
	 * Write a Java program to check whether the character “z” is happy or not in the following string.
	 * A character is happy when the same character appears to its left or right in a string.
	 * String str = “azzlea”;
	 */
	public static void main(String[] args) {
		String str = "azzlea";
		char happy = 'z';
		
		int index = str.indexOf(happy);
		
		if ((index - 1) > 0 && str.charAt(index - 1) == happy) {
			System.out.printf("The character %s is happy %n", happy);
			
		} else if ((index + 1) < str.length() && str.charAt(index + 1) == happy) {
			System.out.printf("The character %s is happy %n", happy);
		}	
 
	}

}
