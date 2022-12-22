package com.Scanner;

import java.util.Scanner;
import com.Scanner.Daoimpl.BookImpl;

public class BookTest {
public static void main(String[] args) {
	BookImpl bm = new BookImpl();
	char ans;
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to Book Paradise............");
	System.out.println("Enter Choise........");
	System.out.println("1. Add\n2. Read\n3. Exit");
	int ch = s.nextInt();
	do {
		switch(ch){
		case 1:
			bm.addBook();
			break;
		case 2:
			bm.readBook();
			break;
		case 3:
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
