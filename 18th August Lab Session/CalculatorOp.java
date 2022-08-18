//Q3. A Java program that accepts two integers from the user and then do sum, product, difference, distance, average, maximum and minimum operations

package Default;
import java.util.Scanner;
public class CalculatorOp {

	public static void main(String[] args) {
		Scanner av= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = av.nextInt();
		System.out.println("Enter second number: ");
		int b = av.nextInt();
		System.out.println("Sum of two integers: " + (a+b));
		System.out.println("Difference of two integers: " + (a-b));
		System.out.println("Product of two integers: " + (a*b));
		System.out.println("Average of two integers: " + ((a+b)/2));
		System.out.println("Distance of two integers: " + (a-b));
		System.out.println("Max integer: " + Math.max(a,b));
		System.out.println("Min integer: " + Math.min(a,b));
	}

}
