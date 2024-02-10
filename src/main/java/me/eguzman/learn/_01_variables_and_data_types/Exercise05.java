package me.eguzman.learn._01_variables_and_data_types;

public class Exercise05 {

	/**
	 * Write a Java program that declares and initializes two float variables with the values 5.3 and 7.5, respectively. 
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		float num1 = 5.3f;
		float num2 = 7.5f;
		
		System.out.println("The num1 is: " + num1);
		System.out.printf("The num2 is: %.2f %n", num2);
		
		/**
		 * The printf() method above,
		 * 
		 * the template is "The num2 is: %.2f %n"
		 * %.2f is the placeholder of the float "num2" variable with 2 decimal digits
		 * %n is new line
		 */

	}

}
