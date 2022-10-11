/* Q.2 we need to print the elements of the array which are present in odd positions. This can
be accomplished by looping through the array and printing the elements of an array by
incrementing i by 2 till the end of the array is reached.*/

package Array_assignment;
public class Array_Printing_odd { //Main Class

	public static void main(String[] args) {
		int[] value= {234, 124, 567, 890, 105, 295, 385, 478};
        for(int i=1; i< value.length; i=i+2) { //Loop for printing odd values
        	System.out.print(value[i] + " "); //Print Statement 
        }
	}
}