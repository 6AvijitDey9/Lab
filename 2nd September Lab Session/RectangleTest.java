package Default;
/* Q.2... you will make a class ‘Rectangle’ and declare the variable length and breadth as private.
One Constructor will be used for initializing the value of variables. When an object is created,
the constructor will be called and the default value of the instance variables will be assigned.
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and
assign values of the parameter used in constructor. Calculate area of the rectangle and print
it on the console. Let’s update the new value of variable. And then read the updated value.
Sample Output: Area = 800
New area = 900 */

import java.util.Scanner;
class Rectangle { //Declaring class
	int length;
	int breadth;
	Rectangle(int l, int b){ //Constructor declaration 
		length = l;
		breadth = b;
	}
	void display() { 
		System.out.println("The Area is: "+(length*breadth));// Print statement
	}
	void display1() { //Print method
		System.out.println("The New Area is: "+(length*breadth));
	}}
public class RectangleTest {
	public static void main (String... args) {
		Scanner re=new Scanner(System.in); //Taking input from user
		System.out.println("The first length: ");
		int f = re.nextInt();
		System.out.println("The second length: ");
		int s = re.nextInt();
		System.out.println("The updated first length: ");
		int uf = re.nextInt();
		System.out.println("The updated second length: ");
		int us = re.nextInt();
		Rectangle first=new Rectangle(f,s); //Calling constructor
		Rectangle second=new Rectangle(uf,us);
		first.display(); //Calling print method
		second.display1();
	}}
