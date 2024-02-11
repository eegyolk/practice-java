package me.eguzman.learn._03_flow_control_statements;

public class Exercise05 {

	/**
	 * Write a Java program for the following scenario: A student will not be allowed to sit in an exam if his attendance is less than 75%.
	 * Given the number of classes held and the number of classes attended, print out the percentage of classes attended and whether the student is allowed to sit in the exam or not.
	 * int classesHeld = 9;
	 * int classesAttended = 6;
	 */
	public static void main(String[] args) {
		int classesHeld = 9;
		int classesAttended = 6;
		
		double attendance = ((double) classesAttended / classesHeld) * 100;
		
		if (attendance >= 75) {
			System.out.printf("Student is allowed to sit and take the exam, attendance is %.2f percent %n", attendance);
			
		} else {
			System.out.printf("Student is not allowed to sit and take the exam, attendance is %.2f percent which is less than 75 percent %n", attendance);
		}

	}

}
