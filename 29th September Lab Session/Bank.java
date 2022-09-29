/*Q.2 Banking Operations reate a class with customer private instance
variables as accountNumber,accountName,accountBalance and
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two
customers. */


package Assignment;
public class Bank { // Creating main class
	public static void main(String[] args) { // Main method
		User AD = new User(); // Taking input of first user
		AD.Create_Account(673492359, "Allu Arjun", 10.5);
		AD.setAmount(500.75); 
		AD.getAmount(); // Calling getAmount Method
		AD.withDrawAmount(150.00); // calling withDrawAmount method
		System.out.println();
		AD.Create_Account(980454470, "Prabhas", 20.34); // Taking input of second user
		AD.setAmount(1500.75);
		AD.getAmount();
		AD.withDrawAmount(100.34); 
		}}

class User { 
private int accnumber;
private String accname;
private double accbal;
public void Create_Account(int accnumber, String accname, double accbal) { 
this.accnumber = accnumber;
this.accname = accname;
this.accbal = accbal;
}
void setAmount(double accbal) { // method to Set the amount
	this.accbal = accbal;
}
public void getAmount() { // Method to Get the result
System.out.println("Account Holder name is: "+accname);
System.out.println("Account Balance is: "+accbal);
}
public void withDrawAmount(double Amount) { // Method to withdraw money and show the updated balance
accbal-=Amount;
System.out.println("You have successfully withdrawn: "+Amount+" and \nYour new updated balance is: "+accbal);
}}
