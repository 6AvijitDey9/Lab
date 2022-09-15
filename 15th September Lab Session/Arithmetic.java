/* 1… ((Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic)). */

package Core;
import java.util.Scanner;
 class Arithmetic { //class that takes integers as parameters
	int a;
	int b;
	void add(int a, int b) { //method which returns an integer denoting their sum
		this.a=a;
		this.b=b;
		int sum=(a+b);
		System.out.println("The first number is: " + a + ", The second number is: " + b + ", The Addtion is: " + sum );
	}}
	
	class Adder extends Arithmetic{ //Adder class that inherits from a superclass named Arithmetic class
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int num1 =  a.nextInt();
		System.out.println("Please enter second number: ");
		int num2 = a.nextInt();
		Adder plus = new Adder();
		plus.add(num1, num2);
	}}
