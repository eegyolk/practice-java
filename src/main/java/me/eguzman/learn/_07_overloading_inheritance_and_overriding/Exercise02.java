package me.eguzman.learn._07_overloading_inheritance_and_overriding;

/**
 * Write a Java program to create a base class called Animal (Animal Family) with a method called sound(). 
 * Create two subclasses, Bird and Cat. Override each subclass's sound() method to make a specific sound for each animal.
 */

class Animal {
	void sound() {
		System.out.println("noise");
	}
}

class Bird extends Animal {
	@Override
	void sound() {
		System.out.println("screech");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("roar");
	}
}

public class Exercise02 {

	public static void main(String[] args) {
		Bird eagle = new Bird();
		System.out.println("Eagle sound is: ");
		eagle.sound();
		
		System.out.println(" ");
		
		Cat tiger = new Cat();
		System.out.println("Tiger sound is: ");
		tiger.sound();

	}

}
