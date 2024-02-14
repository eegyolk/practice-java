package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Person" with a name and age attribute. 
 * Create two instances of the "Person" class, set their attributes using a constructor, and print their name and age.
 */

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Exercise01 {

	public static void main(String[] args) {
		Person player = new Person("Michael", 23);
		System.out.println(player.toString());
		System.out.println(" ");
		
		Person singer = new Person("Justin", 18);
		System.out.println(singer.toString());
	}

}
