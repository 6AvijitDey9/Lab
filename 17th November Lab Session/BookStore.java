/*Design class called BookStore which contains an appropriate collection object to store Book instances.
Implement the below operations.

1. addBook(Book b)
To add a new Book object into the collection.

2. searchByTitle(String title)
Search a book based on title and if found, display the details

3. searchByAuthor(String author) Search a book based on author and if found, display the details

4. displayAll()
Print the details of all the books

Store both classes in a package com.book.*/


package com.book;
import java.util.ArrayList;
public class BookStore { //Main class
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
				System.out.println("Book not found");
				break;
			}
		}
	} 
	
	public void searchByAuthor(String author) { //Passing author string as argument to search
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
