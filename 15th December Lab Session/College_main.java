package Com.College;

import java.sql.SQLException;
import java.util.Scanner;

public class College_main {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	College_cms cms = new College_cms();
	System.out.println("Press 1. for New user Registration\n"
			+ "Press 2. Login account with Id\n"
			+ "Press 3. Admission\n"
			+ "Press 4. Display details with login ID\n"
			+ "Press 5. Update\n"
			+ "Press 6. Log out");
	int choise = sc.nextInt();
	while(choise!=6) {
		switch(choise) {
		case 1:
			cms.create_ac();
			System.out.println("Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 2:
			cms.login_ac();
			System.out.println("Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 3:
			cms.admission();
			System.out.println("Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 4:
			cms.display_details();
			System.out.println("Please choose other options for more details.......\n"
					+ "Or, Press 6 to log out........");
			choise = sc.nextInt();
			if(choise==6) {
				cms.logout();
			}
			break;
		case 5:
			cms.update_details();
			System.out.println("Please choose other options for more details.......\n"
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
 