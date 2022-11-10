/* Q.3 Write a Java program to find the longest word in a text file */

package IO;
import java.io.*;
import java.util.*;

public class longest_word_in_file { //Main class
public static void main(String[] args) throws Exception { //Main Method
	String CurrentC, LongWord="";
	Scanner sc = new Scanner(new File("E:\\filee.txt")); //Importing file into scanner class
	while(sc.hasNext()) { //reading each words
		CurrentC = sc.next(); //Storing words in another string
		if (CurrentC.length()>LongWord.length()) { LongWord = CurrentC; }} //Comparing each word length and storing
	System.out.println("The longest word is: "+LongWord);}} //Printing the longest word
