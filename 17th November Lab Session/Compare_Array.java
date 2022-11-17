//Problem Statement: Write a Java program to compare two array lists.

package Array_assignment;
public class Compare_Array {
	public static void main(String[] args) {
		String fa[]= {"RED", "GREEN", "BLACK", "PINK"}; //First Array
		String sa[]= {"RED", "GREEN", "BLACK", "WHITE", "PINK"}; //Second Array
		for(int i=0; i<fa.length; i++) { //Traversing through first array
			for(int j=i; j<sa.length; j++) { //Traversing through second array
				if(fa[i]==sa[j]) {
					System.out.print("Yes.");
					break;}
				else { System.out.print("No.");}}}}}
