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
		Scanner scanBookID  = new Scanner(System.in);	//Calling scanner object	
		String bookID = scanBookID.nextLine(); //Taking input for bookID
		
		System.out.println("Enter Book title:");
		Scanner scanTitle  = new Scanner(System.in); //Calling scanner object
		String title = scanTitle.nextLine(); //Taking input for title
		
		System.out.println("Enter Book author:");
		Scanner scanAuthor  = new Scanner(System.in);	//Calling scanner object
		String author = scanAuthor.nextLine(); //Taking input for author
		
		System.out.println("Enter Book category:");
		Scanner scanCategory  = new Scanner(System.in);	//Calling scanner object
		String category = scanCategory.nextLine();	//Taking input for category
		
		System.out.println("Enter Book price:");
		Scanner scanPrice  = new Scanner(System.in); //Calling scanner object
		float price = scanPrice.nextFloat(); //taking input for price
      
		obj.addBook(new Book(bookID,title,author,category,price)); //adding Book instances into BookStore
		obj.displayAll(); 
		
		if(i!=4) {	//condition for close scanner input stream
			continue;
		}
		//closing all scanner input streams
		scanBookID.close();
		scanTitle.close();
		scanAuthor.close();
		scanCategory.close();
		scanPrice.close();
		}	//for loop end
	
		System.out.println("\nEnter title to search book: ");
		String title = s.nextLine();									//taking input for price
		System.out.println("\nSearched by title");
		obj.searchByTitle(title);									//searching book by book title 
		
		System.out.println("\nEnter author name to search book");
		String author = s.nextLine();									//taking input for price
		System.out.println("\nSearched by author");
		obj.searchByAuthor(author);									//searching book by author name
		
		System.out.println("\nPrinting all books:");
		obj.displayAll(); 										//displaying all books with details
		
		s.close(); 											//closing input stream
	}
	
}
