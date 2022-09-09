/* Q.4... Can you create object of a class from inside the scope of
another class constructor. */
//Ans- Yes, it is possible.

package Default;

class Second {
	void display() {
	System.out.println("object of a class from inside the scope of another class constructor is sucessfully done");
}}
public class First{
	First() {
		Second sc=new Second(); // created object "sc" of a "Second" class from inside the scope of another class constructor named "First"
		sc.display();
	}
}
