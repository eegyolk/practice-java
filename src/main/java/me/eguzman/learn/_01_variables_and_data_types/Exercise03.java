package me.eguzman.learn._01_variables_and_data_types;

public class Exercise03 {

	/**
	 * Write a Java program that declares and initializes two long variables with the values 24125456143 and 784125345656, respectively.
	 * Then, print the variables out in the console.
	 */
	public static void main(String[] args) {
		long num1 = 24125456143L;
		long num2 = 784_125_345_656L;

		System.out.println("The num1 is: " + num1);
		System.out.printf("The num2 is: %d %n", num2);
		
		/**
		 * See: https://docs.oracle.com/javase/8/docs/technotes/guides/language/underscores-literals.html
		 * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. 
		 * This feature enables you, for example, to separate groups of digits in numeric literals, which can improve the readability of your code.
		 * For instance, if your code contains numbers with many digits, you can use an underscore character to separate digits in groups of three, 
		 * similar to how you would use a punctuation mark like a comma, or a space, as a separator.
		 */
	}

}
