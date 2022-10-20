/*Problem: 1
You are given a piece of Java code. You have to complete the code by writing down the handlers
for exceptions thrown by the code. The exceptions the code may throw along with the handler
message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable: Print "Format mismatch".
Accessing an invalid index in string: Print "Index is invalid".
Accessing an invalid index in array: Print "Array index is invalid".
MyException: This is a user defined Exception which you need to create. It takes a
parameter param. When an exception of this class is encountered, the handler should print "My
Exception[param]", here param is the parameter passed to the exception class.
Exceptions other than mentioned above: Any other exception except the above ones fall in this
category. Print "Exception encountered".
Finally, after the exception is handled, print "Exception Handling Completed".
*/

package Exception;
import java.util.Scanner;
class MyException extends Exception{ //Creating user define exception
	public MyException(String msg) {
		super(msg);
	}}

public class Java_Code {	
	public static void main(String[] args){ //Main method
		String nu = null;
		Java_Code jc=new Java_Code();
		Scanner sc=new Scanner(System.in); //Calling Scanner class
		try {
			int num=25/0;}
		catch(ArithmeticException e){ //Will print exception if want to divide a integer to zero
			System.out.println("Invalid division");}
		try {
			String s="Anu";
			int m=Integer.parseInt(s);}
		catch(Exception e) { //It will give exception if we want to change the format in this way
			System.out.println("Format mismatch");}
		try {
			int ar[] = {1, 2, 3, 4, 5};
			ar[7]=5;}
		catch(Exception e) { //It gives a exception because we want to add value in a invalid position of array
			System.out.println("Index is invalid");}
		try {
			int arr[]=new int[3];
			arr[4]=2;}
		catch(Exception e) { //Array index is invalid so it will print exception
			System.out.println("Array Index is invalid");}	
		try {
			if(nu.equals("anu"))
				System.out.println("same");}
		catch(Exception e) { //Will return back exception because the string is null
			System.out.println("Exception encountered");}
		try {
		System.out.println("Enter a number less than 18: ");
		int num=sc.nextInt();
		if(num>18)
			throw new MyException("My Exception[param]"); //exception will be thrown if we enter a value greater than 18
		    System.out.println("Exception Handling Completed.");}
		catch(MyException me) {
			System.out.println(me.getMessage());
			System.out.println("Exception Handling Completed.");
		}}}
