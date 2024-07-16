package com.library.system.library;

import org.junit.jupiter.api.Test;

public class LibraryTest {

  private Library library = new Library();
  private Book book1, book2;   
  
  @Test
  public void testAddBook() {
	
	 book1 = new Book();
     book1.setAuthor("author");
     book1.setAvailability(true);
     book1.setDepartment("department");
     book1.setISBN(1);
     book1.setPublicationYear(2023);
     book1.setTitle("Title1");
     
     book2 = new Book();
     book2.setAuthor("author2");
     book2.setAvailability(true);
     book2.setDepartment("department1");
     book2.setISBN(3);
     book2.setPublicationYear(2023);
     book2.setTitle("Title2");  
    
      library.addBook(book1);
      
  }

  @Test
  public void testRemoveBook() {
	 book1 = new Book();
     book1.setAuthor("author");
     book1.setAvailability(true);
     book1.setDepartment("department");
     book1.setISBN(1);
     book1.setPublicationYear(2023);
     book1.setTitle("Title1");
       
     library.addBook(book1);
     library.removeBook(1);
  }

  
}
