package me.eguzman.learn._03_flow_control_statements;

public class Exercise08 {

	/**
	 * Write a program in Java that prints the first 20 prime numbers in the console.
	 */
	public static void main(String[] args) {
		int primeCounter = 0;
		
		System.out.println("Following are the first 20 prime number:");
		for (int i = 2; primeCounter < 20; i++) {
			
			int factorCounter = 0;
			
			for (int ii = i; ii > 0; ii--) {
				int mod = i % ii;
				
				if (mod == 0) {
					factorCounter++;
				}
			}
			
			if (factorCounter == 2) {
				System.out.println(i);
				primeCounter++;
			}
		}
		
		/**
		 * Prime numbers are natural numbers greater than 1.
		 * 2 is the smallest prime number.
		 * 2 is the only even prime number. All the prime numbers except 2 are odd.
		 * A prime number has only two factors and the number itself.
		 */

	}

}
