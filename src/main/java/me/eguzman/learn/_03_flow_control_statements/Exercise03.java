package me.eguzman.learn._03_flow_control_statements;

public class Exercise03 {

	/**
	 * Write a Java program that, given a year, prints out whether it is a leap year or not.
	 */
	public static void main(String[] args) {
		int year = 2024;
		
		int divisibleByFour = year % 4;
		int divisibleByHundred = year % 100;
		int divisibleByFourHundred = year % 400;
		
		if (divisibleByFour == 0 && divisibleByHundred > 0) {
			System.out.printf("The year %d is a leap year %n", year);
			
		} else {
			
			if (divisibleByFourHundred == 0) {
				System.out.printf("The year %d is a leap year %n", year);
				
			} else {
				System.out.printf("The year %d is not a leap year %n", year);
			}
		}
		
		/**
		 * A leap year always result in 1 extra day that is placed at the end of February.
		 * To check if a year is a leap year, it must be divisible by 4 and not divisible by 100.
		 * For centurial years, it must be divisible by 400 to be leap year.
		 */
		
	}

}
