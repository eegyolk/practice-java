package me.eguzman.learn._03_flow_control_statements;

public class Exercise04 {

	/**
	 * Write a Java program for the following scenario: A company decides to give a bonus of 5% to the employees if their years of service are more than 5 years.
	 * So, given a number of years of service and a salary, print out the bonus.
	 * int years = 8;
	 * double salary = 65000;
	 */
	public static void main(String[] args) {
		int years = 8;
		double salary = 65_000;
		
		if (years > 5) {
			double bonus = ((double) 5 / 100) * salary;
			System.out.println("The bonus for the employee is: " + bonus);
		} else {
			System.out.println("No 5% bonus for the employee");
		}

		/**
		 * To calculate the percentage of a number, we need to use a different formula such as:
		 * 
		 * P% of Number = X, where X is the required percentage.
		 * If we remove the % sign, then we need to express the above formulas as,
		 * P/100 * Number = X
		 */
	}

}
