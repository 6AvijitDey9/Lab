//Problem Statement: Write a Java program to insert the specified element at the front of a linked list.

package Linked_List;
import java.util.LinkedList;
public class Insert_ele {
	public static void main(String[] args) { //Main Method
		LinkedList<String> ll = new LinkedList<>(); //Creating LinkedList
        ll.add("You"); ll.add("have"); ll.add("entered"); ll.add("a"); ll.add("Linked"); ll.add("List"); //Add values on List
        System.out.println("Before inserting: "+ ll); //Print
        ll.addFirst("Now"); //Adding first element on LinkedList
        System.out.println("After inserting: "+ ll); //Print
	}}
