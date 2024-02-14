package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Circle" with a radius attribute. 
 * You can access and modify this attribute. Create methods to find the area and circumference of the circle. 
 * Create an object of “Circle”, set a value for the radius and display the area and circumference. 
 */

class Circle {
	private double radius;

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * (radius * radius);
	}
	
	double circumference() {
		return 2* Math.PI * radius;
	}
	
}

public class Exercise04 {

	public static void main(String[] args) {
		Circle circ = new Circle();
		circ.setRadius(12);
		
		System.out.println("The radius of the circle is: " + circ.getRadius());
		
		double area = circ.area();
		double circumfernce = circ.circumference();
		
		System.out.printf("The area of the circle is: %.2f %n", area);
		System.out.printf("The circumfernce of the circle is: %.2f %n", circumfernce);

	}

}
