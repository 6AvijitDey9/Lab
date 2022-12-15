/*create a array of 5 students then convert the array to a TreeSet object and use iterator to print them.*/

package Map;
import java.util.*;
class students implements Comparable<students>{ // We need to implement the Comparable interface and provide the sorting logic 
int Id; String name; int Phone_number; String Dept; char rating;
public students(int Id, String name, int Phone_number, String Dept, char rating) {
	this.Id=Id; this.name=name; this.Phone_number=Phone_number; this.Dept=Dept; this.rating=rating;
}
@Override
public int compareTo(students obj) { // we sort objects on the basis of Student Name using compareTo of String Class
	return this.name.compareTo(obj.name);
}}
public class ArraytoTreeset {
public static void main(String[] args) {
	List<students> ls = new ArrayList<students>(); //Creating an Array list
	ls.add(new students(123, "Adinath", 70593423, "Science", 'A')); //Storing data of 5 students into Array list
	ls.add(new students(456, "Aditya", 90593423, "Arts", 'A'));
	ls.add(new students(456, "Adimanav", 906393423, "Commerce", 'A'));
	ls.add(new students(195, "Adipurush", 89583423, "Music", 'A'));
	ls.add(new students(610, "Adinanda", 70233423, "Painting", 'A'));
	TreeSet<students> ts = new TreeSet<students>(ls); //Converting the Array list to TreeSet object
	Iterator itr=ts.iterator(); //Using Iterator to print all the details 
	while(itr.hasNext()) {
		students ss = (students) itr.next();
		System.out.println("Student Id= "+ss.Id+", Student name= "+ss.name+", Student Ph_no= "+ss.Phone_number+
				", Student Depertment= "+ss.Dept+", Student rating= "+ss.rating);
	}}}
