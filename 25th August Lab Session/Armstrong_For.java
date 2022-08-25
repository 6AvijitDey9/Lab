
package Default;


import java.util.*;
public class Armstrong_For {

	public static void main(String[] args) {
	Scanner av= new Scanner(System.in); //Scanner Class
	System.out.println("Enter a 3 digit number: ");
	int Arms= av.nextInt(); //Taking input from user
	int out=0;
	int NewArms=Arms;
	
	while(NewArms!=0) { //Using loop
	int remainder= NewArms%10;
	out += Math.pow(remainder, 3);
	NewArms/=10;
	}
	
	if(out==Arms) 
		System.out.println("You have entered an Armstrong number, The number is: " + Arms);//Print statement
	else
		System.out.println(Arms + " is not a Armstrong number");
}}
