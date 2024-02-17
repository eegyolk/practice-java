package me.eguzman.learn._07_overloading_inheritance_and_overriding;

/**
 * Write a Java program to create a class called "Helper" with three overloaded methods. The method name is formatNumber(). 
 * The first method receives an int and returns it converted into a String. 
 * The second method takes a double, formats the number with 3 decimal places and returns it as a String. 
 * The third method takes a String (the String contains a decimal number), formats the number with 2 decimal places and returns it as a String.
 */
class Helper {
	String formatNumber(int num) {
		return Integer.toString(num);
	}
	
	String formatNumber(double num) {
		return String.format("%.3f", num);
	}
	
	String formatNumber(String num) {
		return String.format("%.2f", Double.parseDouble(num));
	}
}

public class Exercise01 {

	public static void main(String[] args) {
		Helper help = new Helper();
		
		System.out.println("Method formatNumber with int as param: " + help.formatNumber(123));
		System.out.println("Method formatNumber with double as param: " + help.formatNumber(Math.PI));
		System.out.println("Method formatNumber with String as param: " + help.formatNumber(String.valueOf(Math.PI)));

	}

}
