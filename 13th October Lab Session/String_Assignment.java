/*Problem Statement 1:
Write a program which creates a String “Welcome to Java World” and performs the following
--- Returns the character at 5th position and display it. 
--- Compares the above String with “Welcome” lexicographically ignoringcase differences and display the result. 
--- Concatenates “- Let us learn” to the above string and display it. 
--- Returns the position of the first occurrence of character ‘a’ and display it. 
--- Replaces all the occurrences of ‘a’ character with the new‘e’ and display it. 
--- Returns string between 4th position and 10th position and display it. 
--- Returns the lowercase of the string and display it. 
Problem Statement 2:
Write a program which creates a StringBuffer “This is StringBuffer” and performs the following. 1. Adds the string ”- This is a sample program” to existing string and display it. 2. Inserts the string “Object” into the existing string at 21st position and display it. 3. Reverses the entire string and displays it. 4. Replaces the word “Buffer” with “Builder” and display it. 
Problem Statement 3:
Write a program which creates a String“C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. It parses the string with the delimiter as ‘\’ and displays the String in the following format. Drive: c:\
Folders: IBM || DB2 || PROGRAM
File: DB2COPY1.EXE*/


package String;
public class String_Assignment {
	public static void main(String[] args) {
	String s="Welcome to Java World";
	String se="C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE";
	System.out.println("The fifth position is: "+ s.charAt(5)); // Performing all actions given in the Problem Statement
	System.out.println("After comparing the String with Welcome no-case sensitive: "+ s.compareToIgnoreCase("Welcome"));
	System.out.println("After concate the final String is: "+ s.concat(" -Let us learn"));
	System.out.println("The Index of 'a' is: " + s.indexOf("a"));
	System.out.println("After replacing 'a' with 'e': "+ s.replace("a", "e"));
	System.out.println("The New string after returning 4th and 10th position of the string is: "+ s.substring(4, 10));
	System.out.println("The final String in Lowercase is: "+ s.toLowerCase());
	StringBuffer S= new StringBuffer("This is StringBuffer ");
	System.out.println(S.append(" This is a sample program"));
    System.out.println(S.insert(21, " Object "));
    System.out.println(S.reverse());
    System.out.println(S.replace(14, 20, "Builder"));
    System.out.println(se);
    System.out.println("Drive: "+ se.substring(0, 3));
    System.out.println("Folders: "+ se.substring(3, 6)+ " || " + se.substring(7, 10)+ " || " + se.substring(11, 18));
    System.out.println("File: " + se.substring(19));
	}}
