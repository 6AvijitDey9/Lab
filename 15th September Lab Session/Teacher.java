/*2… ((In this example, you have a base class Teacher and a sub class ITTeacher. Since
class ITTeacher extends the designation and college properties and work () method from
base class, we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method which are common to all the
teachers so we have declared them in the base class, this way the child classes like Math
Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used
directly from base class)).*/


package Core;
public class Teacher { //base class Teacher
 String College_Name = "Sammilani Mahavidyalaya";
 String Designation = "Teacher";
 void work() { //Method in base class
	 System.out.println("The person is working as a full time teacher");
 }
}

class ITTeacher extends Teacher { //sub class ITTeacher
	String sub = "Computer";
		public static void main(String args[]) {
			ITTeacher Teacher = new ITTeacher();
			System.out.println("The college name is: " + Teacher.College_Name);
			System.out.println(Teacher.Designation);
			Teacher.work(); //declaring method
		}}
