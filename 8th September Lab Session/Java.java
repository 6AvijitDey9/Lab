/* Q.3 Develop a public java class and make sure nobody can create any object of this class from outside the class */


package Default;

public class Java { // Declaring the first class
    private Java() {	
}}

class program{ // Declaring the second class
	public static void main(String[] args) {
	Java jdk=new Java(); // We cannot the object of public class named "Java" from outside of the class because, it becomes private
}}
