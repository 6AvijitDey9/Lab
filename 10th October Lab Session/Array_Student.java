/*Q.3 Create a student class having the following attributes
 1. Student No. (Data type int)
 2. Student Name. (Data type String)
 3. Student Mail Id. (Data type String)
 4. Student Address. (Data type String)
 This class should have 2 methods
 1. void fees (Int Student No.)
 2. void display (Int Student number)
== After the class, you need to create an array of Student having 5 Students
 assign different fees to each Student and also print the details of each
 Student with the array only.
== Now create a static method in the main class which will accept Student
 number and Student fees as parameter and if the fees are less than 2000
 then fees will increase by 10% of their current fees to that Student. Call the display method to print the updated details.*/


package Array_assignment;
class Student{ //Student Class
	int Student_no, Student_fees;
	String Student_name, Student_mail, Student_add;
	
	void fees(int Student_fees) { //Creating Void fees method
		if(Student_fees<2000) {
			int current_fees= (Student_fees + (Student_fees*10)/100);
			System.out.println("Current fees: " + current_fees);
		}
		else {
			System.out.println("Previous fees is your current fees");
		}
	}
	void display(int Student_no) { //Creating Void display method
	System.out.println(Student_no + "," + " Student name: " + Student_name + "," + " Student mail: " + Student_mail + "," + " Student address: " + Student_add+ "," + " Student fees: " + Student_fees);
	}
	Student(int no, String name, String Mail, String add, int fees){
		this.Student_no=no; this.Student_name=name; this.Student_mail=Mail; this.Student_add=add; this.Student_fees=fees;
	}
}
public class Array_Student { //Main Class
	public static void main(String[] args) {
    Student stu1= new Student(1, "abc", "abc12@gmail.com", "Kolkata", 1009);
    stu1.display(1); //Calling display method
    stu1.fees(1009); //Calling fees method
    Student stu2= new Student(2, "ghv", "ghv12@gmail.com", "Bankura", 2000);
    stu2.display(2); //Calling display method
    stu2.fees(2000); //Calling fees method
    Student stu3= new Student(3, "bhn", "bhn12@gmail.com", "sealdah",500);
    stu3.display(3); //Calling display method
    stu1.fees(500); //Calling fees method
    Student stu4= new Student(4, "hjk", "hjk12@gmail.com", "siliguri",4000);
    stu4.display(4); //Calling display method
    stu4.fees(4000); //Calling fees method
    Student stu5= new Student(5, "mnc", "mnc12@gmail.com", "paskra",5000);
    stu5.display(5); //Calling display method
    stu5.fees(5000); //Calling fees method
	}
}
