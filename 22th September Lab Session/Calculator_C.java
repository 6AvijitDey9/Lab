/* 2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.*/
 

package Assignment;

import java.util.Scanner;

public class Calculator_C { //Main class
	public static void main(String[] args) {
		
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the first Number: "); //taking first number from user
	int num1=num.nextInt();
	System.out.println("Enter the second Number: "); //taking second number from user
	int num2=num.nextInt();
	System.out.println("Enter any of these operators (+,-,*,/)"); //taking operator from user
	char operator = num.next().charAt(0);
	
	switch(operator) // Checking the operator using switch case
    {
        case '+' :
        {
        	Calculator_C.add(num1, num2);
            break;
        }
        case '-' :
        {
        	Calculator_C.substraction(num1, num2);
            break;
        }
        case '*' :
        {
        	Calculator_C.multiplication(num1, num2);
            break;
        }
        case '/' :
        {
        	Calculator_C.devision(num1, num2);
            break;
        }
        default :
        {
            System.out.print("Please enter proper operator");
            return;
        }
    }
	
	}
	static void add(int a, int b) { 
		int sum = a+b;
		System.out.println("You have choosen '+' operator."); //Print line 
		System.out.println("The addition is: " + sum);
	}
	static void substraction(int a, int b) {
		int subs = a-b;
		System.out.println("You have choosen '-' operator.");
		System.out.println("The substraction is: " + subs);
	}
	static void multiplication(int a, int b) {
		int mul = a*b;
		System.out.println("You have choosen '*' operator.");
		System.out.println("The multiplication is: " + mul);
	}
	static void devision(int a, int b) {
		int dev = a/b;
		System.out.println("You have choosen '/' operator.");
		System.out.println("The devision is: " + dev);
	}
}
