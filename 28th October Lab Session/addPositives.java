/* Problem code 3: 
Write a method called addTwoPositive that takes two int 
parameters, and if either value is not positive, throw an 
ArithmeticException, passing the string "Non-positive 
integer sent". to the constructor of the exception.if the
values are both positive, then return the sum of them. 
Under what circumstances will the finally code block be 
executed in a try/catch/finally segments. */

package Threads;
import java.util.Scanner;
public class addPositives { //Main Class	
	int addTwoPositive(int a, int b) throws ArithmeticException{ //Method which will throw arithmetic exception in condition not matches
		if(a<0 || b<0) {
			throw new ArithmeticException("Non-Positive integer sent");} //Exception Message
		else {
			return (a+b); //If both inputs are positive
		}}
	public static void main(String[] args) { //Main Method
		Scanner sc=new Scanner(System.in); //Scanner class to take input from user
		addPositives np=new addPositives(); //Calling main class and creating main class object
		System.out.println("Enter both number one by one: "); 	 
		while(sc.hasNext()) { //Loop will continue if the proper integer inputs are given
			int a = sc.nextInt();
		    int b = sc.nextInt();
		try {
			System.out.println("The sum of the integers: " + np.addTwoPositive(a, b));} //Will print the output after addition
		catch(ArithmeticException ae) {
			System.out.println(ae);} //Will print the corresponding exception message
		finally {
			System.out.println("This issue is resolved..."); //by using finally block, the print statement will print at any case
			System.out.println();
			System.out.println("Press enter to give another response: "); //by using finally block, the print statement will print at any situation
		}}}}
