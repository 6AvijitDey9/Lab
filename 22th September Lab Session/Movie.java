/*3. Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie, getMovie where you can create movieName, movieStartTime, movieEndTime, MovieTicketPrice as instance variables.*/

package Assignment;

public class Movie {
	String MovieName;
    Double movieStartTime;
    Double movieEndTime;
    Double MovieTicketPrice;
    
     String get_name() {
		return MovieName;
	}
     Double get_Starttime() {
 		return movieStartTime;
 	}
     Double get_Endtime() {
  		return movieEndTime;
  	}
     Double get_TicketPrice() {
   		return MovieTicketPrice;
   	}
     void set_name(String MovieName) {
 		this.MovieName=MovieName;
 	}
     void set_Starttime(Double movieStartTime) {
  		this.movieStartTime=movieStartTime;
  	}
     void set_Endtime(Double movieEndTime) {
   		this.movieEndTime=movieEndTime;
   	}
     void set_TicketPrice(Double MovieTicketPrice) {
    		this.MovieTicketPrice=MovieTicketPrice;
    	}
}
