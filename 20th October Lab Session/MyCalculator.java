/* Problem 4:
 * Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."
Input Format
Each line of the input contains two integers, n and p.
Output Format
Each line of the output contains the result, if both n and p are positive. If either n or p
is negative, the output contains "n and p should be non-negative". If both n and p are
zero, the output contains "n and p should not be zero.".
Sample TestCase 1
Input
12 2
2 10
0 0
2 -1
Output
144
1024
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.*/

package Exception;
import java.util.Scanner;

public class MyCalculator { //Creating MyCalculator class
	 long power(int n, int p) throws Exception { //Creating method which will throw exception or return the value if everything is ok
		if(n<0 || p<0) {
			throw new Exception("n or p should not be negative.");} //Throw exception if n or p is negative
		else if(n==0 && p==0) {
			throw new Exception("n and p should not be zero.");} //Throw exception if n and p are zero
		else {
	    return (long)(Math.pow(n, p));}} //Will return the final value in long
	 
	public static void main(String[] args) { //Main Method
		MyCalculator mc= new MyCalculator(); //Calling MyCalculator class by mc object
		Scanner sc=new Scanner(System.in); //Calling Scanner class by sc object
		System.out.println("Enter two values one after another: "); //Print statement
		 while (sc.hasNextInt()) { //Will take inputs while the input is in integer
			int n=sc.nextInt();
			int p=sc.nextInt();
			try {
				System.out.println();
				System.out.print(mc.power(n, p)); //It will call the power method which will print the power of two inputs
			}
			catch(Exception e) {
				System.out.print(e); //Will show exception if any exception condition matches
			}}}}
