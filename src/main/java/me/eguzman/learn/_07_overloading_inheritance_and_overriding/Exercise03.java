package me.eguzman.learn._07_overloading_inheritance_and_overriding;

/**
 * Write a Java program to create a base class MyShape using calculateArea(). 
 * Create three subclasses: MyCircle, MyRectangle, and MyTriangle. 
 * Override the calculateArea() method in each subclass to calculate and return the shape's area.
 */
class MyShape {
	double calculateArea() {
		return 0;
	}
}

class MyCircle extends MyShape {
	double radius;
	
	MyCircle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return Math.PI * (radius * radius);
	}
}

class MyRectangle extends MyShape {
	double width;
	double length;
	
	MyRectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	@Override
	double calculateArea() {
		return width * length;
	}
}

class MyTriangle extends MyShape {
	double base;
	double height;
	
	MyTriangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	double calculateArea() {
		return (base * height) / 2;
	}
}

public class Exercise03 {

	public static void main(String[] args) {
		MyCircle circle = new MyCircle(12.25);
		System.out.println("Circle area is: " + circle.calculateArea());
		System.out.println(" ");
		
		MyRectangle rect = new MyRectangle(10.12, 12.21);
		System.out.println("Rectangle area is: " + rect.calculateArea());
		System.out.println(" ");
		
		MyTriangle tri = new MyTriangle(15.23, 18);
		System.out.println("Triangle area is: " + tri.calculateArea());

	}

}
