package me.eguzman.learn._03_flow_control_statements;

public class Exercise02 {

	/**
	 * Write a Java program that, given three numbers, prints out the greatest number.
	 * int num1 = 48;
	 * int num2 = 12;
	 * int num3 = 37;
	 */
	public static void main(String[] args) {
		int num1 = 48;
		int num2 = 12;
		int num3 = 37;
		
		int greatest = num1;
		
		if (num2 > greatest) {
			greatest = num2;
		}
		
		if (num3 > greatest) {
			greatest = num3;
		}

		System.out.printf("Given the three numbers %d, %d, and %d, the greatest number is %d", num1, num2, num3, greatest);
	}

}
