/*1.. Create menu driven program (CMS)
      College management System
      
press 1 for New user Registration ( with details- login with Id & password )
( Use a random number generator and that value should be your ID value )
press 2. Login account with Id
press 3. Admission ( those who got >70% in both 10th & 12th )
         ( addmission details )
press 4 Display details with login ID ( If addmission done successfully)
press 4  update  
press 5 Log out

table name Admission 
Registration_Id integer,
name varchar (20),
address varchar (20),
phone no number (10),
course/dept varchar (10),
10th marks(12,2),
12th marks(12,2),
Year of passing ( 12th )

validation:

Addmission/Update validation: duplicate Registration id not allowed & <70% not allowed, only current year can applied

fetching validation: wrong Id is not allowed

Password: only 6 digit ( one small one Cap one Special char )*/



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
		Random rand = new Random(); //Calling random class to create Random numbers
		System.out.println("Wait for few Seconds.......\n"
				+ "Your id will visible soon....");
		Registration_Id = rand.nextInt(1111, 9999); //Random number should be within 1111 to 9999
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
				pass = sc.next(); //First letter of the password should be cap letter then small letter then digits
			}
			PreparedStatement stmt = conn.prepareStatement("insert into students values(?,?)"); //Statement to insert values in database. ? mark denotes how many columns the table has.
			stmt.setInt(1, Registration_Id); stmt.setString(2, pass); stmt.executeUpdate();
			System.out.println("........Congo, Details inserted sucessfully.........\n"
					+ "Now please log-in to add details.........");
			}
		ResultSet rst2 = stmt1.executeQuery("select Registration_Id from students");
		if(rst2.next()==false) { //If the database is empty
			System.out.println("Your account will be created shortly.....\n"
					+ "You are the first student registraing with us.....\n"
					+ "Now please enter your Password: \n"
					+ "Once created you can't change your PassWord as of now......\n"
					+ "(Password should be in 6 digit, Must include one cap letter at first then,\n"
					+ "give atleast one small letter after that, atleast one digit)");
			pass = sc.next();
			while(!Pattern.matches("[A-Z]{1}[a-z]{1,4}[0-9]{1,4}", String.valueOf(pass))) {
				System.out.println("Please follow the specific pattern for Password and try again: ");
				pass = sc.next();
			}
			PreparedStatement stmt = conn.prepareStatement("insert into students values(?,?)"); //Statement to insert values in database. ? mark denotes how many columns the table has.
			stmt.setInt(1, Registration_Id); stmt.setString(2, pass); stmt.executeUpdate();
			System.out.println("........Congo, Details inserted sucessfully.........\n"
					+ "........Now please log-in to add details.........");
			}
      }
	public void login_ac() throws SQLException{
		System.out.println("Please Enter your Registration_Id: ");
		Registration_Id = sc.nextInt(); //Taking user entry for registration id
		Connection conn=College_helper.con(); //Connecting to database
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from students where Registration_Id="+Registration_Id);
		if(!rs.next()) { //Checking into database if the registration id exist
			System.out.println("Registration_Id not Exist......\n"
					+ "Please try again with Correct one......");
		}
		else {
			System.out.println("Registration_Id found.........\n"
					+ "Now please enter your password carefully........");
			pass=sc.next();
			ResultSet rs1=stmt.executeQuery("select * from students where password='"+pass+"'");
			if(!rs1.next()) { //Checking table if password is correct or not
				System.out.println("Password not matched.....\n"
						+ "Please recheck your password and try again.....");
			}
			else {
				System.out.println("Account details found...\n"
						+ "Now please enter the details.....\n"
						+ "Your Registration_Id is: "+Registration_Id); //If password is correct
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
				System.out.println("Please enter your 12th Marks in percentage: ");
				twelve_marks=sc.nextDouble();
				while(twelve_marks>100) {
					System.out.println("Marks should not be more than 100.....\n"
							+ "Please enter again......");
				}
				System.out.println("Please enter your year of passing of your 12th exam: ");
				passing_year=sc.nextInt();
				System.out.println("All details collected.....");
				PreparedStatement stmt1=conn.prepareStatement("insert into admission values(?,?,?,?,?,?,?,?)");
				stmt1.setInt(1, Registration_Id); stmt1.setString(2, name); stmt1.setString(3, address); stmt1.setInt(4, phone); 
				stmt1.setString(5, Dept); stmt1.setDouble(6, tenth_marks); stmt1.setDouble(7, twelve_marks); stmt1.setInt(8, passing_year);
				stmt1.executeUpdate(); //Storing data into database
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
		Statement stmt=conn.createStatement(); //Create connection for resultsets
		Statement stmt1=conn.createStatement();
		Statement stmt2=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from admission where Registration_Id="+Registration_Id);
		if(!rs.next()) {
			System.out.println("Registration Id not Matched.....");
		}
		else {
			ResultSet rs1 = stmt1.executeQuery("select 10th_marks from admission where Registration_Id="+Registration_Id);
			ResultSet rs2 = stmt2.executeQuery("select 12th_marks from admission where Registration_Id="+Registration_Id);
			while(rs1.next()&&rs2.next()) {
				if(rs1.getDouble(1)>70 && rs2.getDouble(1)>70) { //Checking if the marks are more than 70 or not
					System.out.println("\nCongrats, You got the admission......\n"
							+ "Continue your Hard Works......\n"
							+ "Wish you all the best for your Future.......\n");
				}
				else {
					System.out.println("\nSorry, You need to get upto 70 percent marks to get the admission......\n"
							+ "Wish you all the best for your career\n");
				}
			}
		}
	}

	public void display_details() throws SQLException{  //Display method to display student details
		System.out.println("Please enter your Registration Id to get your details: ");
		Registration_Id = sc.nextInt(); //Taking user inputs to get details
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from admission where Registration_Id="+Registration_Id);
		if(!rs.next()) {
			System.out.println("Registration Id not Matched.....");
		}
		else {
			System.out.println("Your details is:- \n............................\n"+"Resigstration ID- "+rs.getInt(1)+";"+"\nName- "+rs.getString(2)+";"+
		            "\nLocation- "+rs.getString(3)+";"+"\nPhone Number- "+rs.getInt(4)+";"+"\nDepertment- "+rs.getString(5)+";"+
					"\n10th Marks- "+rs.getDouble(6)+";"+"\n12th Marks- "+rs.getDouble(7)+";"+"\n12th Passing Year- "+rs.getInt(8)+";");
		}
	}
	
	public void update_details() throws SQLException{
		Connection conn=College_helper.con();
		Statement stmt=conn.createStatement();
		Statement stmt1=conn.createStatement();
		System.out.println("Press 1 for name update:\nPress 2 for address update:\nPress 3 phone num update\n"
				+ "Press 4 for Dept update:\nPress 5 for 10th marks update:\nPress 6 for 12th marks update:\n"
				+ "Press 7 for YOP update:");
		int choose = sc.nextInt();
		switch(choose) {
		case 1:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt(); //To update details first we need to check if the registration id exist or not
			ResultSet rs = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next(); //We need to check if the password is matching with the id or not
				if(rs.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select name from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) { //Showing the current details to user
						System.out.println("Your name is: "+rs1.getString(1)+"\n.....................");
					}
					System.out.println("Please enter your updated name: ");
					name=sc.next();
					stmt.executeUpdate("update admission set name='"+name+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n"); //Updating the details by the user input
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}	
			break;
		case 2:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs2 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs2.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs2.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select address from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your address is: "+rs1.getString(1)+"\n.....................");
					}
					System.out.println("Please enter your updated address: ");
					address=sc.next();
					stmt.executeUpdate("update admission set address='"+address+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		case 3:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs3 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs3.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs3.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select phone_no from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your Phone Number is: "+rs1.getInt(1)+"\n.....................");
					}
					System.out.println("Please enter your updated Phone Number: ");
					phone=sc.nextInt();
					stmt.executeUpdate("update admission set phone_no='"+phone+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		case 4:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs4 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs4.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs4.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select dept from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your Depertment is: "+rs1.getString(1)+"\n.....................");
					}
					System.out.println("Please enter your updated Depertment: ");
					Dept=sc.next();
					stmt.executeUpdate("update admission set dept='"+Dept+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		case 5:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs5 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs5.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs5.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select 10th_marks from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your 10th marks is: "+rs1.getDouble(1)+"\n.....................");
					}
					System.out.println("Please enter your updated 10th marks: ");
					tenth_marks=sc.nextDouble();
					stmt.executeUpdate("update admission set 10th_marks='"+tenth_marks+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		case 6:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs6 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs6.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs6.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select 12th_marks from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your 12th marks is: "+rs1.getDouble(1)+"\n.....................");
					}
					System.out.println("Please enter your updated 12th marks: ");
					twelve_marks=sc.nextDouble();
					stmt.executeUpdate("update admission set 12th_marks='"+twelve_marks+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		case 7:
			System.out.println("Please enter your Registration Id: ");
			Registration_Id=sc.nextInt();
			ResultSet rs7 = stmt.executeQuery("select password from students where Registration_Id="+Registration_Id);
			if(!rs7.next()) {
				System.out.println("\nThis is not a valid Registation Id.......\n"
						+ "Check the Registation Id and Try again........\n");
			}
			else {
				System.out.println("Please Enter your Password: ");
				pass = sc.next();
				if(rs7.getString(1).equals(pass)) {
					System.out.println("Account Details found.........\n");
					ResultSet rs1 = stmt1.executeQuery("select year_of_passing from admission where Registration_Id="+Registration_Id);
					if(rs1.next()) {
						System.out.println("Your YOP is: "+rs1.getInt(1)+"\n.....................");
					}
					System.out.println("Please enter your updated year of Passing: ");
					passing_year=sc.nextInt();
					stmt.executeUpdate("update admission set year_of_passing='"+passing_year+"'where Registration_Id="+Registration_Id);
					System.out.println("\nDetails suceessfully Updated.........\n");
				}
				else {
					System.out.println("Password not matched with Registration Id.............\n"
							+ "Please do check and Try again............\n");
				}
			}
			break;
		}
	}
	
	public void logout() throws SQLException{
		System.out.println("You are successfully logged out........\n"
				+ "Thank you for visiting our Website.......");
	}	
}