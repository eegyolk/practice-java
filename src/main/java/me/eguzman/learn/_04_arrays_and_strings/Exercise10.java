package me.eguzman.learn._04_arrays_and_strings;

public class Exercise10 {

	/**
	 * Write a Java program to sum the character's ASCII codes of all the characters in the string.
	 * String str = “I love coding in Java”;
	 */
	public static void main(String[] args) {
		 String str = "I love coding in Java";

		 int sum = 0;
		 
		 for (int i = 0; i < str.length(); i++) {
			 sum += (int) str.charAt(i);
		 }
		 
		 System.out.println("The sum of the character's ASCII codes is " + sum);
	}

}
