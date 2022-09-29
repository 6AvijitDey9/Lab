/* Q.3 Program to create library book Management system
to store and display book details in library where you can
create two classes one is main another one is library, where you can
create two methods as addBook,dispanseBook and
bookId,bookName,bookAuthor as instance variables */

package Assignment;
import java.util.Scanner;
public class library_book_Management { // Main Class

		public static void main(String[] args) { // Main Method
			int bookId;
		    String bookName;
		    String bookAuthor;
		    
		 library L_B_M=new library();
	     Scanner LBM=new Scanner(System.in);
	     System.out.println("Enter the Book ID: ");
	     bookId = LBM.nextInt();
	     System.out.println("Enter the Book Name: ");
	     bookName = LBM.next();
	     System.out.println("Enter the Book Author Name: ");
	     bookAuthor = LBM.next();
	     
	    L_B_M.addBook_Id(bookId);
	    L_B_M.addBook_bookName(bookName);
	    L_B_M.addBook_bookAuthor(bookAuthor);
	    
	    System.out.println(L_B_M.dispanseBook_bookName() + " Book details saved sucessfully;");
	    System.out.println("The Book name is: " + L_B_M.dispanseBook_bookName());
	    System.out.println("The Book ID is: " + L_B_M.dispanseBook_Id());
	    System.out.println("The Book Author Name is: " + L_B_M.dispanseBook_bookAuthor());   
		}
	}

    class library {
	int bookId;
    String bookName;
    String bookAuthor;
    
     void addBook_Id(int bookId) {
 		this.bookId=bookId;
 	}
     void addBook_bookName(String bookName) {
  		this.bookName=bookName;
  	}
     void addBook_bookAuthor(String bookAuthor) {
   		this.bookAuthor=bookAuthor;
   	}
     int dispanseBook_Id() {
 		return bookId;
 	}
      String dispanseBook_bookName() {
  		return bookName;
  	}
      String dispanseBook_bookAuthor() {
   		return bookAuthor;
   	}
}


