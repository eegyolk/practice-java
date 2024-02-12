package me.eguzman.learn._04_arrays_and_strings;

public class Exercise12 {

	/**
	 * Write a Java program to reverse the string.
	 * String str = “I love coding in Java”;
	 */
	public static void main(String[] args) {
		String str = "I love coding in Java";
		
		String reverse = "";
		
		for (int i = str.length() -1; i >= 0 ;i--) {
			reverse += str.charAt(i);
		}
		
		System.out.println("The reverse string is " + reverse);

	}

}
