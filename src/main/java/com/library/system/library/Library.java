package com.library.system.library;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Library {

  public List<Book> library = new ArrayList<Book>();

//method to add book
  public void addBook(Book book) {
    log.info("addBook method started");
	for (Book b : library) {

	  if (b.getISBN() == (book.getISBN())) {
		log.info("Book already exist");
		return;
	  }
	}

	library.add(book);
	log.info("Book " + book.getTitle() + " added susccessfully");
	log.info("addBook method ended");
  }

// method to remove book
  public void removeBook(int ISBN) {
	
	log.info("removeBook method started");
	
	boolean availableStatus = false;
	
	for (Book b : library) {

	  if (b.getISBN() == ISBN && (b.isAvailability() == true)) {
		b.setAvailability(false);
		
		availableStatus = true;
		
		log.info("Book: " + b.toString() + " removed successfully");
		
		break;
	  }

	}

	if (availableStatus) {
	   log.info("Book already removed or Book with "+ISBN+" not exist");
	}

	log.info("removeBook method ended");
	
  }

  public List<Book> findBookByTitle(String title) {
	
	log.info("findBookByTitle method started");

	List<Book> list = new ArrayList<>();

	for (Book b : library) {
	  if (b.getTitle().equalsIgnoreCase(title)) {
		list.add(b);
	  }
	}
	log.info("findBookByTitle method ended");
	return list;
  }

  public List<Book> findBookByAuthor(String author) {

	List<Book> list = new ArrayList<>();

	for (Book b : library) {
	  if (b.getAuthor().equalsIgnoreCase(author)) {
		list.add(b);
	  }
	}
	return list;
  }

  public List<Book> listAllAvailableBooks() {
	List<Book> availableBooks = new ArrayList<Book>();
	
	for(Book book:library) {
	  if(book.isAvailability()) {
		availableBooks.add(book);
	  }
	}

	return availableBooks;
  }

  public List<Book> listAllBooks() {

	 return library;

  }
  
  public void display() {
	for (Book b : library) {
	  log.info(b.toString());
	}
  }
}
