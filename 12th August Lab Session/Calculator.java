// Write a Java program to print the sum, multiply, substract, divide and reminder of two numbers.


class Calculator
{
public static void main(String []args)
{
System.out.println("The two numbers are:");
int a=125;
int b=24;
System.out.println(a+","+b);
int sum = a+b;
int substract = a-b;
int multiply = a*b;
double divide = a/b;
double reminder = a%b;

System.out.println("The sum is = " +  sum);
System.out.println("The substraction is = " +  substract);
System.out.println("The multiplication is = " +  multiply);
System.out.println("The dividation is = " +  divide);
System.out.println("The reminder is = " +  reminder);
}
}
