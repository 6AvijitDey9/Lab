/* Q.1 Write a Java method to check whether every digit of a given integer
is even. Return true if every digit is odd otherwise false? */

package Assignment;
import java.util.Scanner;
public class Everydigits_OddEvenCheck {	//Main Class
	 public static void main(String[] args){ //Main method
	        Scanner sc = new Scanner(System.in); // Taking input from user
	        System.out.println("Enter a Number:");
	        int n = sc.nextInt();
	        System.out.print("After checking whether every digit of a given integer is even or Odd the result is:\n");
	        System.out.print(Odd_Even(n));
	        }

	  public static boolean Odd_Even(int n){ // Creating method for the following program
	    final int f = 10;
	    if (n == 0){ // If the user input is 0 it will declare as odd number(false)
	        return true;
	    }
	    while(n != 0){
	        if((n % f) % 2 != 0){ // If user input's every digit is even it will declare as even number(true)
	            return true;
	        }
	        n /= 10; 
	    }
	     return false;
	   }
	}
