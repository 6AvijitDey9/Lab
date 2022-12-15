package Com.College;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class College_cms {
	Scanner sc=new Scanner(System.in); //Scanner Class
	int Registration_Id, phone, passing_year, count=0; double tenth_marks, twelve_marks; String name, address, Dept, pass;
	
	public void create_ac() throws SQLException{ 
		Random rand = new Random();
		System.out.println("Wait for few Seconds.......\n"
				+ "Your id will visible soon....");
		Registration_Id = rand.nextInt(1111, 9999);
		System.out.println("Your Resigtration id is: "+Registration_Id+"\nPlease save it for later uses........");
		
		Connection conn=College_helper.con(); //Connecting to Database 
		Statement stmt1 = conn.createStatement(); 
		ResultSet rst = stmt1.executeQuery("select Registration_Id from students"); //Database query
		while(rst.next()) { //Loop to check if there's anything at database
			if(Registration_Id==rst.getInt(1)) { //To check if the account number is exist or not
				count+=1;
				System.out.println("This Resigtration Id already created........\n"
						+ "Please restart your programme to create another Resigtration Id");}
			else {
				count=-1;
				}
			}	
		if(count==-1) { //If there is no same registration id
			System.out.println("Your account will be created shortly.....\n"
					+ "No existing Resigtration Id found with this number......\n"
					+ "Now please enter your Password: \n"
					+ "(Password should be in 6 digit, Must include one cap letter at first then,\n"
					+ "give atleast one small letter after that, atleast one digit)");
			pass = sc.next();
			while(!Pattern.matches("[A-Z]{1}[a-z]{1,4}[0-9]{1,4}", String.valueOf(pass))) {
				System.out.println("Please follow the specific pattern for Password and try again: ");
				pass = sc.next();
			}
			PreparedStatement stmt = conn.prepareStatement("insert into students values(?,?)"); //Statement to insert values in database. ? mark denotes how many columns the table has.
			stmt.setInt(1, Registration_Id); stmt.setString(2, pass);
			System.out.println("........Congo, Details inserted sucessfully.........\n"
					+ "Now please log-in to add details.........");
			}
		ResultSet rst2 = stmt1.executeQuery("select Registration_Id from students");
		if(rst2.next()==false) { //If the database is empty
			System.out.println("Your account will be created shortly.....\n"
					+ "You are the first student registraing with us.....\n"
					+ "Now please enter your Password: \n"
					+ "(Password should be in 6 digit, Must include one cap letter at first then,\n"
					+ "give atleast one small letter after that, atleast one digit)");
			pass = sc.next();
			while(!Pattern.matches("[A-Z]{1}[a-z]{1,4}[0-9]{1,4}", String.valueOf(pass))) {
				System.out.println("Please follow the specific pattern for Password and try again: ");
				pass = sc.next();
			}
			PreparedStatement stmt = conn.prepareStatement("insert into students values(?,?)"); //Statement to insert values in database. ? mark denotes how many columns the table has.
			stmt.setInt(1, Registration_Id); stmt.setString(2, pass);
			System.out.println("........Congo, Details inserted sucessfully.........\n"
					+ "Now please log-in to add details.........");
			}
      }
	public void login_ac() throws SQLException{
		System.out.println("Please Enter your Registration_Id: ");
		Registration_Id = sc.nextInt();
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from students where Registration_Id="+Registration_Id);
		if(!rs.next()) {
			System.out.println("Registration_Id not Exist......\n"
					+ "Please try again with Correct one......");
		}
		else {
			System.out.println("Registration_Id found.........\n"
					+ "Now please enter your password carefully....");
			pass=sc.next();
			ResultSet rs1=stmt.executeQuery("select * from students where password="+pass);
			if(!rs1.next()) {
				System.out.println("Password not matched.....\n"
						+ "Please recheck your password and try again.....");
			}
			else {
				System.out.println("Account details found...\n"
						+ "Now please enter the details.....\n"
						+ "Your Registration_Id is: "+Registration_Id);
				System.out.println("Now please enter your name: ");
				name=sc.next();
				System.out.println("Please enter your address(Location only): ");
				address=sc.next();
				System.out.println("Please enter your phone number: ");
				phone=sc.nextInt();
				System.out.println("Please enter your depertment to enroll: ");
				Dept=sc.next();
				System.out.println("Please enter your 10th Marks in percentage: ");
				tenth_marks=sc.nextDouble();
				while(tenth_marks>100) {
					System.out.println("Marks should not be more than 100.....\n"
							+ "Please enter again......");
				}
				System.out.println("Please enter your 12th Marksin percentage: ");
				twelve_marks=sc.nextDouble();
				while(twelve_marks>100) {
					System.out.println("Marks should not be more than 100.....\n"
							+ "Please enter again......");
				}
				System.out.println("Please enter your year of passing of your last exam: ");
				passing_year=sc.nextInt();
				System.out.println("All details collected.....");
				PreparedStatement stmt1=conn.prepareStatement("insert into admission values(?,?,?,?,?,?,?,?)");
				stmt1.setInt(1, Registration_Id); stmt1.setString(2, name); stmt1.setString(3, address); stmt1.setInt(4, phone); 
				stmt1.setString(5, Dept); stmt1.setDouble(6, tenth_marks); stmt1.setDouble(7, twelve_marks); stmt1.setInt(8, passing_year);
				System.out.println("All details inserted successfully.......\n"
						+ "You will get to know shortly if you are eligable for admission......\n"
						+ "Now please check the admission details from main menu to check if you eligable for admission or not......");
			}
		}
	}
	public void admission() throws SQLException{
		System.out.println("Please enter your Registration Id properly: ");
		Registration_Id=sc.nextInt();
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from admission where Registration_Id="+Registration_Id);
		if(!rs.next()) {
			System.out.println("Registration Id not Matched.....");
		}
		else {
			ResultSet rs1 = stmt.executeQuery("select 10th_marks from admission where Registration_Id="+Registration_Id);
			ResultSet rs2 = stmt.executeQuery("select 12th_marks from admission where Registration_Id="+Registration_Id);
			while(rs1.next()&&rs2.next()) {
				if(rs1.getDouble(1)>70 && rs2.getDouble(1)>70) {
					System.out.println("Congrats, You got the admission......\n"
							+ "Continue your Good Works......");
				}
				else {
					System.out.println("You need to get upto 70 marks to get the admission......");
				}
			}
		}
	}
	public void display_details() throws SQLException{
		System.out.println("Please enter your Registration Id to get your details: ");
		Registration_Id = sc.nextInt();
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from admission where Registration_Id="+Registration_Id);
		if(!rs.next()) {
			System.out.println("Registration Id not Matched.....");
		}
		else {
			System.out.println("Your details is: \n"+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)
			+" "+rs.getString(5)+" "+rs.getDouble(6)+" "+rs.getDouble(7)+" "+rs.getInt(8));
		}
	}
	public void update_details() throws SQLException{
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Press 1 for name update:\nPress 2 for address update:\nPress 3 phone num update\n"
				+ "Press 4 for Dept update:\nPress 5 for 10th marks update:\nPress 6 for 12th marks update:\n"
				+ "Press 7 for YOP update:");
		int choose = sc.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Please enter your name: ");
			String namee=sc.next();
			System.out.println("Please enter your updated name: ");
			name=sc.next();
			stmt.executeUpdate("update admission set name="+name+"where name="+namee);
			break;
		case 2:
			System.out.println("Please enter your address: ");
			String addresss=sc.next();
			System.out.println("Please enter your updated address: ");
			address=sc.next();
			stmt.executeUpdate("update admission set address="+address+"where address="+addresss);
			break;
		case 3:
			System.out.println("Please enter your phone number: ");
			int ph=sc.nextInt();
			System.out.println("Please enter your updated phone number: ");
			phone=sc.nextInt();
			stmt.executeUpdate("update admission set phone_no="+phone+"where phone_no="+ph);
			break;
		case 4:
			System.out.println("Please enter your Depertment: ");
			String Depertment=sc.next();
			System.out.println("Please enter your updated Depertment: ");
			Dept=sc.next();
			stmt.executeUpdate("update admission set dept="+Dept+"where dept="+Depertment);
			break;
		case 5:
			System.out.println("Please enter your 10th Marks: ");
			Double Marks=sc.nextDouble();
			System.out.println("Please enter your updated 10th Marks: ");
			tenth_marks=sc.nextDouble();
			stmt.executeUpdate("update admission set 10th_marks="+tenth_marks+"where 10th_marks="+Marks);
			break;
		case 6:
			System.out.println("Please enter your 12th Marks: ");
			Double Markss=sc.nextDouble();
			System.out.println("Please enter your updated 12th Marks: ");
			twelve_marks=sc.nextDouble();
			stmt.executeUpdate("update admission set 12th_marks="+twelve_marks+"where 12th_marks="+Markss);
			break;
		case 7:
			System.out.println("Please enter your Year of Passing: ");
			int yop=sc.nextInt();
			System.out.println("Please enter your updated Year of Passing: ");
			passing_year=sc.nextInt();
			stmt.executeUpdate("update admission set year_of_passing="+passing_year+"where year_of_passing="+yop);
			break;
		}
	}
	
	public void logout() throws SQLException{
		System.out.println("You are successfully logged out........\n"
				+ "Thank you for visiting our Website.......");
	}
		
}