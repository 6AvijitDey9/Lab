/*Problem code 1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print */

package Threads;
public class even_odd { //Main Class
	public static void main(String[] args) throws Exception { //Main Method which throws exception
		System.out.println("Even: ");
		for(int i=0; i<=100; i++ ) { //Loop for traversing i from 0 to 100
			if(i%2 == 0) { //Check if i divisible by 2 or not 
				System.out.print(i + ","); //Print statement for even numbers
			}}
		Thread.sleep(1000); //Helps to wait the ongoing process before printing the odd numbers
		System.out.println();
		System.out.println("Odd: ");
		for(int i=0; i<=100; i++ ) {
			if(i%2 != 0) { //Check if i divisible by 2 or not
				System.out.print(i + ","); //Print statement for odd numbers
			}}}}
