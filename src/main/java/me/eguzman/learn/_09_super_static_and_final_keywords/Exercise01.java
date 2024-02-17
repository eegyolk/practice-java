package me.eguzman.learn._09_super_static_and_final_keywords;

/**
 * Write a Java program to create a class Animal with a parameterized constructor that initializes a String attribute called name. 
 * Create a class Dog that extends the class Animal with a parameterized constructor that takes String two parameters and 
 * initializes a Dog’s attribute called breed and calls the Animal class constructor to initialize the name attribute.
 */

class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal {
	String breed;

	Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return String.format("Dog [breed=%s, name=%s]", breed, name);
	}
	
}

public class Exercise01 {

	public static void main(String[] args) {
		Dog dog = new Dog("Bruno", "Jack Russel Terrier");
		System.out.println(dog);
	}

}
