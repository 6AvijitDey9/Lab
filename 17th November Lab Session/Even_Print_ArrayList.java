/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/

package Array_assignment;
import java.util.ArrayList;
class Even_Print {
		ArrayList<Integer> A1 = new ArrayList<>(); //Creating first ArrayList with instance variable A1
		ArrayList<Integer> A2 = new ArrayList<>(); //Creating first ArrayList with instance variable A2
		//Creating first ArrayList method which returns all the even numbers from 2 to n in ArrayList A1		
        public ArrayList<Integer> storeEvenNumbers(int N){ 
        	for (int i = 2; i <= N; i++) {
    			if (i%2 == 0) { A1.add(i);}
    		}return A1;}
      //Creating second ArrayList method which returns all the even numbers*2 from 2 to n in ArrayList A2
        public ArrayList<Integer> printEvenNumbers(){
        	for(int i : A1) { //traversing all the values of ArrayList A1 using for-each loop
        		A2.add(i*2);
        		System.out.print((i*2) + " ");}return A2;}
        //Creating a method which returns if the value is available in ArrayList or not
        public int retrieveEvenNumber(int N) {
        	for(int j : A1) { //traversing all the values of ArrayList A1
        		if(j==N) {
        			System.out.println("\nNumber found: " + j);return j;}}
        	System.out.println("\nNumber not found: " + 0);
        	return 0;}}
        // Main Class
        public class Even_Print_ArrayList {
        	public static void main(String[] args) {
        		Even_Print EP = new Even_Print(); //Calling class and methods in main class and method
        		EP.storeEvenNumbers(30); 
        		EP.printEvenNumbers();
        		EP.retrieveEvenNumber(25);
			}}

