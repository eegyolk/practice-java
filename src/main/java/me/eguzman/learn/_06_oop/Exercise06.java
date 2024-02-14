package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "TrafficLight" with attributes for colour and duration, a 
 * parameterized constructor and methods to change the colour and check for red or green. 
 * The method that changes the colour automatically changes from red to green and vice versa.
 */
class TrafficLight {
	private String colour;
	private int duration;
	
	TrafficLight(String colour, int duration) {
		this.colour = colour;
		this.duration = duration;
	}
	
	void change() {
		if (this.colour == "green") {
			this.colour = "red";
		} else if (this.colour == "red") {
			this.colour = "green";
		}
	}

	@Override
	public String toString() {
		return "TrafficLight [colour=" + colour + ", duration=" + duration + "]";
	}
	
}

public class Exercise06 {

	public static void main(String[] args) {
		TrafficLight signal = new TrafficLight("red", 60);
		System.out.println(signal.toString());
		System.out.println(" ");
		
		signal.change();
		System.out.println(signal.toString());
		System.out.println(" ");
		
		signal.change();
		System.out.println(signal.toString());
	}

}
