package Assignment;
import java.util.ArrayList;
public class ListLoader {
void loadList(int startNumber, int lastNumber) { //Method which takes first and last number of arraylist and stores all the numbers in arraylist
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=startNumber; i<=lastNumber; i++) {
		al.add(i);
	}}
	public static void main(String[] args) throws Exception { //Main Method which throws exception to avoid multi thread running
		long starttime = System.currentTimeMillis(); //Starttime before excution
		ListLoader ll = new ListLoader();
		ll.loadList(0, 10000000);
		System.out.println("The response time is: " + (System.currentTimeMillis() - starttime)+"ms"); //Time taken by the thread to store data in arraylist without using multi threading
		long Enhancedstarttime = System.currentTimeMillis(); //New Starting time before execution
		first_thread ft = new first_thread();
		second_thread st = new second_thread();
		ft.start();
		st.join();
		st.start();
		System.out.println("After multi threading the new response time is: " + (System.currentTimeMillis() - Enhancedstarttime)+"ms"); //Time taken by doing the same task as before using multi threading
	}}
class first_thread extends Thread{
	public void run() { //run method of thread to store 0-5000000 in an arraylist
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=0; i<=5000000; i++) {
		al.add(i);
	}}}
class second_thread extends Thread{
	public void run() { //run method of thread to store 5000000-10000000 in an arraylist
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=5000000; i<=10000000; i++) {
		al.add(i);
	}}}
