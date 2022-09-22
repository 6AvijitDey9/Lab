/*3. Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.*/
 

package Assignment;

import java.util.Scanner;

public class Movie_Theatre {

	public static void main(String[] args) {
     String MovieName;
     Double movieStartTime;
     Double movieEndTime;
     Double MovieTicketPrice;
     Movie m=new Movie();
     Scanner mv=new Scanner(System.in);
     System.out.println("Enter the Movie name: ");
     MovieName = mv.next();
     System.out.println("Enter the Movie Start Time: ");
     movieStartTime = mv.nextDouble();
     System.out.println("Enter the Movie End Time: ");
     movieEndTime = mv.nextDouble();
     System.out.println("Enter the Movie Ticket Price: ");
     MovieTicketPrice = mv.nextDouble();
     
    m.set_name(MovieName);
    m.set_Starttime(movieStartTime);
    m.set_Endtime(movieEndTime);
    m.set_TicketPrice(MovieTicketPrice);
    
    System.out.println(m.get_name() + " Movie details saved sucessfully;");
    System.out.println("The movie name is: " + m.get_name());
    System.out.println("The movie Start time is: " + m.get_Starttime());
    System.out.println("The movie End time is: " + m.get_Endtime());
    System.out.println("The movie Ticket Price is: " + m.get_TicketPrice());   
	}
}


