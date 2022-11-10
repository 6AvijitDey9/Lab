/* Q.4 WAJP to store text file content line by line into an array */

package IO;
import java.io.*;
import java.util.*;

public class Text_into_Array { //Main class
	public static void main(String[] args) throws Exception { //Main method
		ArrayList<String> al = new ArrayList<>(); //New ArrayList creation
		BufferedReader read = new BufferedReader(new FileReader("E:\\filee.txt")); //Import file into object
		String Line = read.readLine(); //Storing line in String
		int i = 0;
		while((Line!=null)&&(i<10)) {al.add(Line); Line = read.readLine(); i++;} //read and store every line on arraylist	
		System.out.println(al); //Print the arraylist
		read.close(); //Closing Bufferreader
		}}
