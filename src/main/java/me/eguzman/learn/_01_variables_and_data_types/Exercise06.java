package me.eguzman.learn._01_variables_and_data_types;

public class Exercise06 {

	/**
	 * Write a Java program that declares and initializes two boolean variables with the values true and false, respectively. 
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("The bool1 is: " + bool1);
		System.out.printf("The bool2 is: %b %n", bool2);
		
		/**
		 * The printf() method above,
		 * 
		 * the template is "The bool2 is: %b %n"
		 * %b is the placeholder for boolean "bool2" variable
		 * %n is new line
		 */

	}

}
