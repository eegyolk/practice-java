package me.eguzman.learn._03_flow_control_statements;

public class Exercise01 {

	/**
	 * Write a Java program that, given a number, prints out whether it is positive or negative.
	 * int num = 48;
	 */
	public static void main(String[] args) {
		int num = 48;
		
		if (num >= 0) {
			System.out.printf("The num %d is positive", num);
		} else {
			System.out.printf("The num %d is negative", num);
		}

	}

}
