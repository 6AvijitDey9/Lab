package Default;


//Q.2 WAJP to check the number is Prime or Not (User input)
import java.util.*;
public class Prime_For {

	public static void main(String[] args) {
		Scanner av= new Scanner(System.in); //Scanner class
		System.out.println("Enter a number to check wheather it is prime or not: ");	
        int Num=av.nextInt(); //Taking and storing user input
        int count=0;
        
        for(int i=1; i<=Num; i++) { 
        	if(Num%i==0) { // Conditions to check the number 
        	count += 1;
        	}
        }
        	
        	if(count>2)
        	System.out.println("You have entered "+ Num + ", It is not a Prime Number"); //Print statement
        	
        	else
        		System.out.println("You have entered "+ Num + ", It is a Prime Number");
	}

}
