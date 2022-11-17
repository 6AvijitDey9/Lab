//Write a Java program to replace an element in a linked list.

package Linked_List;
import java.util.LinkedList;
public class Replace_ele {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>(); //Creating LinkedList
        ll.add("You"); ll.add("have"); ll.add("entered"); ll.add("a"); ll.add("Linked"); ll.add("List"); //Add values on List
        System.out.println("Before inserting: "+ll); //Print
        ll.set(3, "special"); //Replacing a LinkedList value
        System.out.println("After replaceing: "+ll); //Print
	}}
