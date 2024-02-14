package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Employee" with a name, job title, salary attributes, a 
 * parameterized constructor and methods to retrieve and update the salary.
 */
class Employee {
	private String name;
	private String jobTitle;
	private double salary;
	
	Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
	}
	
}

public class Exercise07 {

	public static void main(String[] args) {
		Employee emp = new Employee("Jack", "Manager", 85_000);
		
		System.out.println(emp.toString());
		System.out.println(" ");
		
		emp.setSalary(94_000);
		System.out.println("Updated salary is: " + emp.getSalary());
		System.out.println(" ");
		
		System.out.println(emp.toString());

	}

}
