package Default;

//Q.3 WAJP to draw a pattern (User Input)
import java.util.*;
public class Pyramid {

	public static void main(String[] args) {
		Scanner av= new Scanner(System.in);
		System.out.println("Enter the rows of Pyramid: ");
		int row=av.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=row-i; j>=1; j--) {
			System.out.print(" ");	
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
