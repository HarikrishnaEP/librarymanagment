package com.library.system.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibrarymanagmentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarymanagmentsystemApplication.class, args);
		callLibrary();
	}

	private static void callLibrary() {
	    Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		
		Library library = new Library();
		
		b1.setTitle("Harrypotter");
		b1.setAuthor("J.K. Rowling");
		b1.setISBN(12524);
		b1.setGenre("Fantasy");
		b1.setPublicationYear(1997);
		b1.setDepartment("fiction");
		b1.setAvailability(true);
		
		
		b2.setTitle("The Lord of the Rings");
		b2.setAuthor("J.R.R. Tolkien");
		b2.setISBN(34224);
		b2.setGenre("High fantasy");
		b2.setPublicationYear(1954);
		b2.setDepartment("fiction");
		b2.setAvailability(true);
		
		b3.setTitle("1984");
		b3.setAuthor("George Orwell");
		b3.setISBN(65524);
		b3.setGenre("Dystopian fiction");
		b3.setPublicationYear(1949);
		b3.setDepartment("fiction");
		b3.setAvailability(true);
		
		b4.setTitle("To Kill a Mockingbird");
		b4.setAuthor("Harper Lee");
		b4.setISBN(45324);
		b4.setGenre("Bildungsroman");
		b4.setPublicationYear(1960);
		b4.setDepartment("fiction");
		b4.setAvailability(true);	
		
		library.addBook(b1);
		library.addBook(b2);
		library.addBook(b3);
		library.addBook(b4);
		
		library.display();
	
		library.removeBook(12524);
		library.removeBook(12524);
		library.removeBook(31267);
		
		library.display();
	  
	}

}
