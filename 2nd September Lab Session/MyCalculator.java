package Default;

/* Q.1... You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at
most 1000. */


import java.util.Scanner;

class AdvancedArithmetic { //Declaring Class
	void divisor_sum(int n) {
	    int sum=0;
	    if(n<1000) { //Decision making statement
	    for(int i=1;i<=n;i++) {
	    	if(n%i==0) {
	    		sum+=i;
	    	}}
	    		System.out.println("Divisor sum is: "+sum); //The value is less than 1000
	    }
	    else { //The value is greater than 1000
    		System.out.println("The number is greater than 1000"); //Print statement
	    }}}

class MyCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Taking input from user
		System.out.println("Enter a number to get the divisor sum: ");
	    int ds = sc.nextInt();
		AdvancedArithmetic aa=new AdvancedArithmetic(); //Creating object
		aa.divisor_sum(ds);
	}

}

