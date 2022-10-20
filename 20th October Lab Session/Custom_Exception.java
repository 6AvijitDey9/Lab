/*Problem: 3
Write a program to create custom exception in java.*/

package Exception;

import java.util.Scanner;
class HeavenorHell extends Exception{ //Creating user define exception class
	public HeavenorHell(String last_word) {
		super(last_word); //User define exception message will send to parent exception class
	}
}
public class Custom_Exception { 
	public static void main(String[] args) { //Main Method
		Scanner sc=new Scanner(System.in); //Calling scanner class to take user input
		System.out.println("What is your Gender? (M/F/T): ");
		while(sc.hasNext()) //Whether user will give proper String input this loop will continue
		try {
        String gender=sc.next();
        	if(gender.equals("F") || gender.equals("T")) //Condition checks if user chooses F or T, or not 
        		throw new HeavenorHell("Congo, You are going to Heaven."); //This exception will invoke if user chooses F or T
        	    System.out.println("Hell king is waiting for you My Boi."); //If user chooses M this will print
        }
        	catch(Exception e) {
        		System.out.println(e.getMessage()); //commend line to handle the exception and print the exception message
		}}}
