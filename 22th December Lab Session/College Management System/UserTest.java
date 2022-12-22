package com.Scanner;

import java.util.Scanner;
import com.Scanner.Daoimpl.UserImpl;

public class UserTest {
public static void main(String[] args) {
	UserImpl um = new UserImpl();
	char ans;
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to user record............");
	System.out.println("Enter Choise........");
	System.out.println("1. Add\n2. Read\n3. Update\n4. Delete\n5. Exit");
	int ch = s.nextInt();
	do {
		switch(ch){
		case 1:
			um.addUser();
			break;
		case 2:
			um.readUser();
			break;
		case 3:
			um.updateUser();
			break;
		case 4:
			um.deleteUser();
			break;
		case 5:
			System.exit(0);
			break;
		}
		System.out.println("Repeat the process? y/n");
		ans = s.next().charAt(0);
	}while(ans=='y'||ans=='Y');
	{
	System.out.println("Thank You!");
	}
}
}
