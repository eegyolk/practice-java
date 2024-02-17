package me.eguzman.learn._07_overloading_inheritance_and_overriding;

/**
 * Write a Java program to create a base class Sport with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. 
 * Override the play() method in each subclass to display a specific statement for each sport.
 */
class Sport {
	void play() {
		
	}
}

class Football extends Sport {
	@Override
	void play() {
		System.out.println("touchdown");
	}
}

class Basketball extends Sport {
	@Override
	void play() {
		System.out.println("slam dunk");
	}
}

class Rugby extends Sport {
	@Override
	void play() {
		System.out.println("goal");
	}
}

public class Exercise04 {

	public static void main(String[] args) {
		Football fb = new Football();
		System.out.println("Football: ");
		fb.play();
		
		System.out.println(" ");
		
		Basketball bb = new Basketball();
		System.out.println("Basketball: ");
		bb.play();
		
		System.out.println(" ");
		
		Rugby rug = new Rugby();
		System.out.println("Rugby: ");
		rug.play();

	}

}
