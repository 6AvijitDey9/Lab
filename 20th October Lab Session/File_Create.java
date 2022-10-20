/*Problem: 2
Write a program in Java to create a file in Java using Exception Handling. */

package Exception;

import java.io.File;    
public class File_Create{  
public static void main(String[] args){     
File file = new File("C:\\Users\\avijit.de\\Java\\Test.java"); //Initialize File object and creating the path of file 
boolean isitcreated;  
try{  
isitcreated = file.createNewFile(); //Creates a new file  
if(isitcreated){ //Test if successfully created a new file, if the file is already there then it will initialize the else part 
System.out.println("file created "+file.getCanonicalPath());} //If the file is successfully created it will prints the file location
else{  
System.out.println("File already exist at location: "+file.getCanonicalPath());} //If file already exist at the given location it will print
}   
catch (Exception e){  
System.out.println(e + ", Check the file location properly"); //prints exception if any problem occurs with the file location
}}}  
