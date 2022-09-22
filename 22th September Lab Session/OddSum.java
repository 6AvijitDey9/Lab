/*1.write a java program to print sum of odd numbers up to N?*/

package Assignment;

import java.util.Scanner;

public class OddSum { //Main Class

	public static void main(String[] args) {
		int N, i, Sum=0;
		
		Scanner add=new Scanner(System.in);
		System.out.println("Enter a number: "); //Print line
		N = add.nextInt();
		
   for(i=1; i<=N; i++) {
	   
	   if(i%2 !=0)
	   {
		   Sum += i;
	   }
   }
   System.out.println("You have entered: " + N + ", Sum of all odd numbers upto your given number is: " + Sum); //Sum of odd numbers
	}

}
