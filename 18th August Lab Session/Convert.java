//Q2. A java program to convert minutes into a number of years and days

package Default;

public class Convert {

	public static void main(String[] args) {
		System.out.println("The total number of minutes is: " + "3456789" );
		int Year = 3456789 / 525600;
	    int Day = 3456789 / 1440;
	    System.out.println(Year + " Year " + Day + " Day");
	}

}
