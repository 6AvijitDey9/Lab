//Q.1 Write a Java program to test if an array contains a specific value.


package Array_assignment;
public class Array_Specific_Value { //Main Class

	public static void main(String[] args) {
		int[] value= {234, 124, 567, 890, 105};
		int number= 105; //Need to find this number within array
		boolean check= false;
		for(int i=0; i<value.length; i++) { //Loop for checking if the given number is equal or not
			if(value[i]==number) {
				check = true;
				System.out.println(check); //Print statement 
				break;}}
		if(check==false) {
			System.out.println(check);
		}
	}
}
