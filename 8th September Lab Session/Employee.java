/* Q.2... 
>>Write a java class to develop an employee class object using Method.
>> The Method hold initialized the emp name & emp Id for 5 Emp
>> now write another class having name and from this class you have to create 5 employee objects but,
>> you are not allowed to use new keyword */


package Default;

public class Employee{
	public static void main(String... arg) {
		Employee_info.details("AD", 123);
		Employee_info.details("DD", 456);
		Employee_info.details("DA", 789);
		Employee_info.details("AA", 147);
		Employee_info.details("AV", 369);
	}
}
class Employee_info{
	static void details(String emp_name, int emp_ID) {
	System.out.println("The employee name is: " + emp_name + ", The employee ID is: " + emp_ID);	
	}}


