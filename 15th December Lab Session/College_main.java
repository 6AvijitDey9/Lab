package Com.College;

import java.sql.SQLException;
import java.util.Scanner;

public class College_main {
public static void main(String[] args) throws SQLException { //Main method
	Scanner sc=new Scanner(System.in); //Scanner Class
	College_cms cms = new College_cms();
	System.out.println("Press 1. for New user Registration\n"
			+ "Press 2. Login account with Id\n"
			+ "Press 3. Admission\n"
			+ "Press 4. Display details with login ID\n"
			+ "Press 5. Update\n"
			+ "Press 6. Log out");
	int choise = sc.nextInt();
	while(choise!=6) { //The Program will run whenever user inputs 6
		switch(choise) {
		case 1:
			cms.create_ac(); //If user choose 1 create_ac method will invoked
			System.out.println("......................\n"
					+ "Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt(); //If user gives other response it will do accordingly
			if(choise==6) { //If user gives 6 then the logout method will be invoked and program will stop
				cms.logout();
			}
			break;
		case 2:
			cms.login_ac(); //If user choose 2 this method will invoked
			System.out.println("........................\n"
					+ "Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 3:
			cms.admission(); //If user choose 3 this method will invoked
			System.out.println("...........................\n"
					+ "Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 4:
			cms.display_details(); //If user choose 4 this method will invoked
			System.out.println(".............................\n"
					+ "Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 5:
			cms.update_details(); //If user choose 5 this method will invoked
			System.out.println("..............................\n"
					+ "Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		 }
	   }
     }
   }
 