package me.eguzman.learn._01_variables_and_data_types;

public class Exercise04 {

	/**
	 * Write a Java program that declares and initializes two String variables with the values I love Java and Hello ComIT, respectively.
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "Hello World";
		
		System.out.println("The str1 is: " + str1);
		System.out.printf("The str2 is: %s %n", str2);
		
		/**
		 * The printf() method above,
		 * 
		 * the template is "The str2 is: %s %n"
		 * %s is a placeholder for the variable "str2" which is a string
		 * %n is a new line
		 */

	}

}
