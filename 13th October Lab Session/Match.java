/*3. Write a Java program to find sequences of lowercase letters joined with a underscore. */

package String;
import java.util.regex.*;
public class Match {
	public static void main(String[] args) {
		boolean b1=Pattern.matches("[a-z]{4}_[a-z]{8}", "Java_Exercise"); //return true if the given pattern matches with the condition.
		boolean b2=Pattern.matches("[a-z]{4}_[a-z]{8}", "java_exercise"); //the pattern says we can take a to z 4 times then add a _ then we can take a to z 8 times to verify the statement.
		System.out.println(b1);
		if (b1==true && b2==true) { //If both of the inputs satisfy their condition
			System.out.println("Match Found");
		}
		else if(b1==true || b2==true) { //If only one of the inputs satisfy the condition
			System.out.println("One of the two match found");
		}
		else {
			System.out.println("Match not found"); //If no any inputs satisfy the condition
		}}}
