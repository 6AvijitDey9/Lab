/*2. Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or Dcan't be greater than 3. Some valid IP address:
000.12.12.034
121.234.12.12
23.45.12.56
Some invalid IP address:
000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.*/

package String;
import java.util.regex.*;
import java.util.Scanner;
public class MyRegex {
	public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the IP address: ");
        while(in.hasNext()) //Loop works only if the input is valid
        {
            String IPaddress = in.next();
            System.out.println(IPaddress.matches(new solution().pattern));// Returns true if the user input is as the same pattern in solution class.
        }
    }
}
class solution {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])"; //Some Valid IP addresses 
    String pattern = num + "." +  num + "." +  num + "." + num;
}
