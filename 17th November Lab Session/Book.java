/*Design a class Book containing following members:
-bookID title
-text text
-price

Define Parameterized constructor to initialize Book object. Perform the below validations
-float
-Category must be "Science", "Fiction", "Technology" or "Others"
-Price cannot be negative bookID must start with 'B' and must be of length 4 characters

If any of the validations fail, throw an user defined exception InvalidBookException.*/


package com.book;

class InvalidBookException extends Exception{ //Creating custom exception class
	public InvalidBookException(String s) {	
		super(s); //Passing argument to Exception super class
	}
	
public class Book { //Main class
	private String bookID, title, author, category; //Encapsulation process
	private float price;
	
	public Book(String bookID, String title, String author, String category, float price)  { //Constructor Declaration
		try {
			//conditon for bookID	
			if((bookID.startsWith("B") && (bookID.length()==4)) {	//Condition
				this.bookID=bookID; //If condition meets
			}
			else {
				throw new InvalidBookException("book id should be start with 'B' and lenght of 4"); //Throws custom exception
			}
			if((category.equalsIgnoreCase("Science")) || (category.equalsIgnoreCase("Fiction")) || (category.equalsIgnoreCase("Technology")) || (category.equalsIgnoreCase("Others"))) { //Conditons
				this.category=category;	//If condition meets
			}
			else {
				throw new InvalidBookException("category should be Science,Fiction,Technology and Others"); //Throws custom exception
			}
			
			if(price>0) {	//Conditon for Price
				this.price=price; //If condition meets
			}
			else {
				throw new InvalidBookException("negative price can not be accepted"); //Throws custom exception
			}
		this.title=title;
		this.author=author;
		}
		catch(Exception e) { // Handling exception
			System.out.println(e);
		}
	}
	public String getBookID() { 	//Getters for all private data members
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public float getPrice() {
		return price;
	}
			   
	public String toString() { //For printing all details of Book objects
		"Book [bookID='" + bookID + "', title='" + title + "', author='" + author + "', category='" + category + "', price='" + price + "']";
	}	
    }
}
