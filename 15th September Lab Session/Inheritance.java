/*3… Class A serves as a base class for the derived class B, which in turn
serves as a base class for the derived class C. (Which type Of Inheritance
explain with an example)*/

// This is called Multiple Inheritance;

package Core;
class A{ //Parent class
	int value() {
		return 123;
	}}
class B extends A{ //child class extending parent class A
	int value() {
		return 456;
	}}
class C extends B{ //child class extending class B as a base class
	int value() {
		return 789;
	}}
public class Inheritance {
	public static void main(String[] args) { //main method
	A a = new A();
	B b = new B();
	C c = new C();
	System.out.println(a.value());
	System.out.println(b.value());
	System.out.println(c.value());
	}}
