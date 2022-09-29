/* Q.4 a Java program to find all pairs of elements in an array whose sum is
equal to a specified number */

package Assignment;
public class Find_pairs { // Main class

	    public static void main(String args[]) // Main Method
	    {
	        int[] arr = { 2, 6, -3, 9, 5, 3 }; // Taking array input
	        int sum = 8;
	        GetPairs(arr, sum); // Calling method
	    }
	    public static void GetPairs(int[] arr, int sum) { // Creating method to find the pairs of elements whose sum is equal to a specific number
	    	System.out.println("pairs which are equal to 8:- ");
	        for (int i = 0; i < arr.length; i++)
	            for (int j = i + 1; j < arr.length; j++)
	                if ((arr[i] + arr[j]) == sum)	 // if the sum is equal to the specific number
	        System.out.println(arr[i] + ", " + arr[j]); // Print statement
	    }
	}
