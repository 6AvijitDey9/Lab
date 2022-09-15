/* 4…((Consider a scenario where Bank is a class that provides functionality to get the rate
of interest. However, the rate of interest varies according to banks. For example, SBI,
ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest)). */

package Core;

public class Bank { //Parent Class
int getRateOfInterest() {
	return 0;}}
class SBI extends Bank { //Child class extends Bank class
	int getRateOfInterest() {
		return 8;}}
class ICICI extends Bank { //Child class extends Bank class
	int getRateOfInterest() {
		return 7;}}
class Axis extends Bank { //Child class extends Bank class
	int getRateOfInterest() {
		return 9;}}

class Banking{
	public static void main(String args[]) { //Main method
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("Interest reate of SBI is: " + s.getRateOfInterest() + "%");
		System.out.println("Interest reate of ICICI is: " + i.getRateOfInterest() + "%");
		System.out.println("Interest reate of AXIS is: " + a.getRateOfInterest() + "%");
	}}
