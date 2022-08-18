//Q1. Write a Java Program to find the value of specified expression.

package Default;

public class Operations {

	public static void main(String[] args) {
		System.out.println("The first equation is: " + "(101+0)/3" );
		System.out.println("The answer of the equation is: " + ((101+0)/3));
		System.out.println("The second equation is: " + "3.0e-6*10000000.1");
		System.out.println("The answer of the equation is: " + (3.0e-6*10000000.1));
		System.out.println("The output of (true && true) will be: " + (true && true));
		System.out.println("The output of (false && true) will be: " + (false && true));
		System.out.println("The output of (false && false)||(true && true) will be: " + ((false && false)||(true && true)));
		System.out.println("The output of (false || false)&&(true && true) will be: " + ((false || false)&&(true && true)));
	}

}
