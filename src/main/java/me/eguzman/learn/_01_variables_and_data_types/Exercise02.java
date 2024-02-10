package me.eguzman.learn._01_variables_and_data_types;

public class Exercise02 {

	/**
	 * Write a Java program that declares and initializes two double variables with the values 45.62435 and 107.25424, respectively. 
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		double num1 = 45.62435;
		double num2 = 107.25424;
		
		System.out.println("The num1 is: " + num1);
		System.out.printf("The num2 is: %.3f %n", num2);
		
		/**
		 * The printf() method above,
		 * 
		 * the template is "The num2 is: %.3f %n"
		 * %.3f is a placeholder for the value of variable "num2" which is a decimal number with 3 decimal digits
		 * %n is a new line
		 */

	}

}
