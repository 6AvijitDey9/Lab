/* Problem 2 :
Take two numbers x and y. Throw the exception if the two numbers are negative else print the 
Product of x and y.
Input Format:
The only line of input consist of two integers, x and y.
Constraints
-20<= x, y <=20
Output Format:
Print the product if both are positive else print the output as below:
java.lang.Exception: x and y should not be zero. */

package Threads;
import java.util.Scanner;
public class NegativeorProduct { //Main Class
	int eqution(int x, int y) throws Exception{ //equation method which will give exception for some conditions
	if(x<=0 || y<=0) {
		throw new Exception("x and y should not be zero.");} //Will throw exception if inputs are less than 0 or equal to 0
	else {
		return(x*y); //Return the product of inputs if both the inputs are positive
	}}
	public static void main(String[] args) { //Main Method
		Scanner sc=new Scanner(System.in); //Creating scanner class object to take input from user
		NegativeorProduct np=new NegativeorProduct(); //Creating main class object
		System.out.println("Enter the first number: "); int x = sc.nextInt();
		System.out.println("Enter the second number: "); int y = sc.nextInt();
		try {
			System.out.println("The Product of both number is: " + np.eqution(x, y));} //Will print the product of given inputs
		catch (Exception ex){
			System.out.println(ex); //Will throws the exception message
		}}}
