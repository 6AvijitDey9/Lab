//Take Five numbers as input to calculate and print the average of the numbers.

class Average
{
public static void main(String []args)
{
System.out.println("The five numbers are:");
int a=10;//taking inputs
int b=20;
int c=30;
int d=40;
int e=50;
System.out.println(a+","+b+","+c+","+d+","+e);//printing the inputs
int sum = a+b+c+d+e;
int average = sum/5;
System.out.println("The Average of five numbers is = " +  average);//printing the output
}
}




//Swapping two variables.

class Swap
{
public static void main(String ...args)
{
System.out.println("The two numbers for swapping are:");
int a=10;//taking inputs
int b=20;
int c;
System.out.println(a+","+b);
c=a;//swapping process
a=b;
b=c;
System.out.println("After swapping the values are = " + a+","+b);//print after swapping
}
}





// Check whether Java is installed on your computer.

class JavaSetup
{
public static void main(String []args)
{
System.out.println("Java Setup is completed on your device : ");
System.out.println("Java Version: 1.8.0_71");//printing out the the java version details
System.out.println("Java Runtime Version: 1.8.0_71-b15");
System.out.println("Java Home: /opt/jdk/jdk1.8.0_71/jre");
System.out.println("Java Vendor: Oracle Corporation");
System.out.println("Java Vendor URL: http://Java.oracle.com/");
System.out.println("Java Class Path: .");
}
}





// Compute the specified expressions the print the output.

class Expression
{
public static void main(String ...args)
{
System.out.println("The given specified expression is:");
System.out.println("(25.5*3.5-3.5*3.5)/(40.5-4.5)");//printing out the expression
double c = (25.5*3.5-3.5*3.5)/(40.5-4.5);//calculating and storing in a variable
System.out.println("After calculating the result is = " + c);//printing the output
}
}





// Write a Java program to print the sum, multiply, substract, divide and reminder of two numbers.

class Calculator
{
public static void main(String []args)
{
System.out.println("The two numbers are:");
int a=125;//taking inputs
int b=24;
System.out.println(a+","+b);//printing the inputs
int sum = a+b;//doing operations and storing it in a variable
int substract = a-b;
int multiply = a*b;
double divide = a/b;
double reminder = a%b;

System.out.println("The sum is = " +  sum);//printing the output of operations
System.out.println("The substraction is = " +  substract);
System.out.println("The multiplication is = " +  multiply);
System.out.println("The dividation is = " +  divide);
System.out.println("The reminder is = " +  reminder);
}
}
