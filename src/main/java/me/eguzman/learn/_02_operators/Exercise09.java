package me.eguzman.learn._02_operators;

public class Exercise09 {

	/**
	 * Write a Java program that, given the radius of a circle, calculates and prints out the area and perimeter of the circle.
	 * double radius = 7.5;
	 */
	public static void main(String[] args) {
		double radius = 7.5;
		
		double area = Math.PI * (radius * radius);
		System.out.println("The area is: " + area);
		
		double perimeter = Math.PI * (radius * 2);
		System.out.println("The perimeter is: " + perimeter);
	}

}
