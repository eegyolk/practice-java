package me.eguzman.learn._03_flow_control_statements;

public class Exercise09 {

	/**
	 * Write a program in Java that prints the first 30 even numbers in the console.
	 */
	public static void main(String[] args) {
		int evenCounter = 0;
		
		System.out.println("The following are the first 30 even numbers:");
		for (int i = 1; evenCounter < 30; i++) {
			int mod = i % 2;
			
			if (mod == 0) {
				System.out.println(i);
				evenCounter++;
			}
		}

	}

}
