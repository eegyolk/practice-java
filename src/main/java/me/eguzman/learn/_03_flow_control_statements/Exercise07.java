package me.eguzman.learn._03_flow_control_statements;

public class Exercise07 {

	/**
	 * Write a program in Java that prints numbers from 1 to 10,000 in the console.
	 */
	public static void main(String[] args) {
		int num = 1;

		while (num <= 10_000) {
			System.out.println("The num is: " + num);
			num++;
		}

	}

}
