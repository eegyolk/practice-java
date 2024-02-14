package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Rectangle" with width and height attributes. 
 * Create a parameterized constructor and two methods that find the area and perimeter of the rectangle. 
 * Create an object of “Rectangle” and display the area and perimeter.
 */

class Rectangle {
	private double width;
	private double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return this.width * this.height;
	}
	
	double perimeter() {
		return 2 * (this.width + this.height);
	}
	
}

public class Exercise03 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 10);
		double area = rect.area();
		double perimeter = rect.perimeter();
		
		System.out.println("The rectangle area is: " + area);
		System.out.println("The rectangle perimeter is: " + perimeter);

	}

}
