package Default;


//Q.1 WAJP to find Factorial of a number (User Input)
import java.util.Scanner;
public class FactorialFor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);	// initializing scanner class
		System.out.println("Enter a number to get factorial value: "); //Print statement
		 int n = sc.nextInt(); //Store=ing input in a variable
		 
	        int fact = 1;

	        for(int i = 1; i <= n; i++ ) 
	        {
	            fact *= i; //Condition
	        }

	        System.out.println("Your Number is: "+ n + ", Factorial of your number is: " + fact); //Print statement
	    }

	}


