package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Dog" with a name and breed attribute. 
 * Create two instances of the "Dog" class, set their attributes using the constructor, modify them using the setter methods and 
 * print the updated values.
 */

class Dog {
	private String name;
	private String breed;
	
	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	void setName(String name) {
		this.name = name;
	}

	void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}
	
}

public class Exercise02 {

	public static void main(String[] args) {
		Dog smallDog = new Dog("Bruno", "Jack Russel Terrier");
		smallDog.setName("Peter");
		System.out.println(smallDog.toString());
		System.out.println(" ");

		Dog largeDog = new Dog("Cookie", "Labrador Retriever");
		largeDog.setBreed("American Bully XL");
		System.out.println(largeDog.toString());
	}

}
