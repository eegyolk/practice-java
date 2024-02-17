package me.eguzman.learn._09_super_static_and_final_keywords;

/**
 * Write a Java program to create a class Printer with an int attribute called id, a constructor that initializes the id attribute and 
 * a method called display() that prints out the class name. 
 * The display() method cannot be overridden, and the id cannot be modified once initialized by the constructor. 
 * Hint: use the final keyword accordingly.
 */
class Printer {
	final int id;

	Printer(int id) {
		this.id = id;
	}
	
	 final void display() {
		System.out.println(this.getClass().getName());
	}
}

class Epson extends Printer {

	Epson(int id) {
		super(id);
	}

	@Override
	public String toString() {
		return String.format("Epson [id=%s]", id);
	}
	
}

public class Exercise03 {

	public static void main(String[] args) {
		Epson epson = new Epson(1);
		System.out.println(epson);
	}

}
