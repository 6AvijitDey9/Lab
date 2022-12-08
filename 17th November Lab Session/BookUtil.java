/*Create a class BookUtil in package com.bookutil which has the main method.
-Instantiate the BookStore class
-Read data from user for 3 Book objects.
-Call the addBook method to add the book objects into the collection
-Search the books by title and author
-Display all the book details..*/


package com.bookutil;
import java.util.Scanner;
import com.book.Book; //Import Book class 
import com.book.BookStore; //Import BookStore class

public class BookUtil {
	public static void main(String[] args){	//Calling main method
		BookStore obj = new BookStore();	//Creating BookStore object
		Scanner sc  = new Scanner(System.in); //Calling scanner object								
		for(int i=1; i<=3; i++) {	//Using for loop to add 3 books 
		System.out.println("For book-"+i);
		System.out.println("Enter bookID:");	
		String bookID = sc.nextLine(); //Taking input for bookID
		
		System.out.println("Enter Book title:");
		String title = sc.nextLine(); //Taking input for title
		
		System.out.println("Enter Book author:");
		String author = sc.nextLine(); //Taking input for author
		
		System.out.println("Enter Book category:");
		String category = sc.nextLine();	//Taking input for category
		
		System.out.println("Enter Book price:");
		float price = sc.nextFloat(); //taking input for price
      
		obj.addBook(new Book(bookID,title,author,category,price)); //Adding Book instances into BookStore
		obj.displayAll(); 
		}	// For loop ends here
	
		System.out.println("\nEnter title to search book: ");
		String title = sc.nextLine(); //Taking book title input 
		System.out.println("\nSearched by title");
		obj.searchByTitle(title); //Searching book by book title 
		
		System.out.println("\nEnter author name to search book");
		String author = sc.nextLine();	//taking author name input 
		System.out.println("\nSearched by author");
		obj.searchByAuthor(author); //Searching book by book author name
		System.out.println("\nPrinting all books:");
		obj.displayAll(); //Displaying all books 
	}
}
