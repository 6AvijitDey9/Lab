/* Q.5 Write a Java program to find common elements from three sorted (in non-decreasing order) arrays. */

package Assignment;
import java.util.Arrays;
public class Find_Common { // Main class
	public static void main(String[] args) {
		{
			Find_Common ob = new Find_Common(); // calling class
			int array1[] = { 100, 23, 34, 12, 30, 90 }; // arrays in not sorted format
			int array2[] = { 90, 34, 30, 80, 23 };
			int array3[] = { 30, 34, 19, 90, 30, 12, 150, -2 };
			System.out.print("Common elements are: ");
			ob.findCommon(array1, array2, array3); // Calling method
		}
	}
	void findCommon(int arr1[], int arr2[], int arr3[]) // Method to sort the arrays and find the common elements
	{
		Arrays.sort(arr1); // Sorting array
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) { 
				System.out.print(arr1[i] + ", "); // If all the elements are equal
				i++;
				j++;
				k++;
			}
			else if (arr1[i] < arr2[j]) // If array 2 is greater than array 1
				i++;
			else if (arr2[j] < arr3[k]) // If array 3 is greater than array 2
				j++;
			else // If array 3 is smaller than array 1 and array 2
				k++;
		}
	}
}
