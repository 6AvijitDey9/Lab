package Assignment;

import java.util.ArrayList;
public class ListLoader {
void loadList(int startNumber, int lastNumber) {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=startNumber; i<=lastNumber; i++) {
		al.add(i);
	}}
	public static void main(String[] args) throws Exception {
		long starttime = System.currentTimeMillis();
		ListLoader ll = new ListLoader();
		ll.loadList(0, 10000000);
		System.out.println("The response time is: " + (System.currentTimeMillis() - starttime)+"ms");
		long Enhancedstarttime = System.currentTimeMillis();
		first_thread ft = new first_thread();
		second_thread st = new second_thread();
		ft.start();
		st.join();
		st.start();
		System.out.println("After multi threading the new response time is: " + (System.currentTimeMillis() - Enhancedstarttime)+"ms");
	}}
class first_thread extends Thread{
	public void run() {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=0; i<=5000000; i++) {
		al.add(i);
	}}}
class second_thread extends Thread{
	public void run() {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=5000000; i<=10000000; i++) {
		al.add(i);
	}}}
