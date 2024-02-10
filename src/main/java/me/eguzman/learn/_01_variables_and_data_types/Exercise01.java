package me.eguzman.learn._01_variables_and_data_types;

public class Exercise01 {

	/**
	 * Write a Java program that declares and initializes two integer variables with the values 23452 and 45363, respectively.
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		int num1 = 23452;
		int num2 = 45363;
		
		System.out.println("The num1 is: " + num1);
		System.out.printf("The num2 is: %d %n", num2);
		
		/**
		 * The printf() method allows us to use template to print out strings in the console.
		 * 
		 * In the example above,
		 * 
		 * the template is "The num2 is: %d %n"
		 * %d is a placeholder that represents the number
		 * %n is represents the new line.
		 * 
		 * When the method is executed, the %d is replaced by
		 * the value of variable "num2" that we passed as second parameter.
		 * 
		 * Following are the placeholder that can be used:
		 * - %c, character
		 * - %d, decimal integer
		 * - %o, octal integer
		 * - %x, hexadecimal integer
		 * - %e, decimal number with floating point representation
		 * - %f, floating point decimal number
		 * - %s or %S, string
		 * - %t formats date/time
		 */
	}

}
