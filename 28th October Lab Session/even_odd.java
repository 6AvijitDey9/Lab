/*Problem code 1. Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print */

package Threads;
	class Even_Check extends Thread{ //First Thread to check even numbers
		public void run() { //run method
		System.out.println("Even: ");
		for(int i=0; i<=100; i++ ) { //Loop for traversing i from 0 to 100
			if(i%2 == 0) { //Check if i divisible by 2 or not 
				System.out.print(i + ","); //Print statement for even numbers
			}}}}
		class Odd_Check extends Thread{ //Second Thread to check odd numbers
		public void run() { //run method
		System.out.println("Odd: ");
		for(int i=0; i<=100; i++ ) {
			if(i%2 != 0) { //Check if i divisible by 2 or not
				System.out.print(i + ","); //Print statement for odd numbers
			}}}}
		public class even_odd { //Main Class
			public static void main(String[] args) throws Exception { //Main Method which throws exception
				Even_Check ec = new Even_Check();
				Odd_Check oc = new Odd_Check();
				ec.start(); //Calling the first thread to execute
				Thread.sleep(1000); System.out.println(); //To wait for sometime between two threads
				oc.start(); ////Calling the second thread to execute
			}}
