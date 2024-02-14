package me.eguzman.learn._06_oop;

/**
 * Write a Java program to create a class called "Book" with attributes for the title, author, and ISBN, 
 * a parameterized constructor and a display() method that prints out the book information. 
 * In another class, create an array of books, add three books, and print the books by looping the array over.
 */
class Book {
	private String title;
	private String author;
	private long ISBN;
	
	Book(String title, String author, long iSBN) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
	}
	
	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + ISBN);
	}
	
}

public class Exercise05 {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		books[0] = new Book("Harry Potter", "J.K. Rowling", 9112223334441L);
		books[1] = new Book("The Lord of The Rings", "J. R. R. Tolkien", 8112223334442L);
		books[2] = new Book("The Da Vinci Code", "Dan Brown", 7112223334443L);

		for (Book book: books) {
			book.display();
			System.out.println(" ");
		}
	}

}
