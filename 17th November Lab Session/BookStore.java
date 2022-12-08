package com.book;
import java.util.ArrayList;
public class BookStore {	//main class
	ArrayList<Book> bookList = new ArrayList<>(); //Creating arrayList object to store book objects
	
	public void addBook(Book b) {	//Passing book object as argument
		bookList.add(b);	//adding new book object to bookList Collection
	}  
  public void displayAll() {	//DisplayAll method will print all the elements of bookList collection
		for(Book b : bookList) {	//enhanced foreach loop
			System.out.println(b);
		}
	}
	public void searchByTitle(String title) {	//Passing Book title string as argument to search
		for (Book b : bookList) {
			if(title.contains(b.getTitle())) {		
				System.out.println(b);
				break;
			}else {
				System.out.println("not found");
				break;
			}
		}
	} 
	
	public void searchByAuthor(String author) {	//Passing author string as argument to search
		for (Book b : bookList) {
			if(author.contains(b.getAuthor())) {
				System.out.println(b);
				break;
			}else {
				System.out.println("Author not found");
				break;
			}
		}
	}
}
