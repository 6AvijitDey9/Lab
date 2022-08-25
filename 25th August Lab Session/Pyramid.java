package Default;

//Q.3 WAJP to draw a pattern (User Input)
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner av= new Scanner(System.in); // Scanner class
		System.out.println("Enter the rows of Pyramid: ");
		int row=av.nextInt(); // Storing the rows of pyramid 
		
		for(int i=1; i<=row; i++) { // Outer loop
			for(int j=row-i; j>=1; j--) { // First inner loop to print space
			System.out.print(" ");	
			}
			for(int j=1; j<=i; j++) { // Another inner loop to print *
				System.out.print("* ");
			}
			System.out.println(); // Printing new line
		}

	}

}
