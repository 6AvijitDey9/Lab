/* Q.1 Write a Java program to read first 3 lines from a file. */

package IO;
import java.io.*;

public class Read_First_3_lines { //Main class
	public static void main(String[] args) throws Exception  { //Main Method
		BufferedReader read = new BufferedReader(new FileReader("E:\\filee.txt")); //Import file into bufferedreader's object
		String Line = read.readLine(); //Storing line in String
		int i = 0;
		while((Line!=null)&&(i<3)) { System.out.println(Line); Line = read.readLine(); i++; //Printing the first 3 lines from the file
	}
read.close(); //Closing the BufferedReader class
}}
