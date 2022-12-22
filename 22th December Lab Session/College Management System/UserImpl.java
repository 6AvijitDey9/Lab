package com.Scanner.Daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Scanner.Dao.UserDao;
import com.Scanner.Entity.UserClass;
import com.Scanner.HibernateUtil.UserUtil;

public class UserImpl implements UserDao {

	public void addUser() {
		Session session = UserUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		long user_id;
		String fn, ln, em;
		int ag;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		user_id = s.nextLong();
		System.out.println("Enter First name: ");
		fn = s.next();
		System.out.println("Enter Last name: ");
		ln = s.next();
		System.out.println("Enter Email: ");
		em = s.next();
		System.out.println("Enter Age: ");
		ag = s.nextInt();
		UserClass uc = new UserClass();
		uc.setId(user_id);
		uc.setFirstname(fn);
		uc.setLastname(ln);
		uc.setEmail(em);
		uc.setAge(ag);
		session.save(uc);
		t.commit();
		System.out.println("User Record Inserted Successfully");
		session.close();
	}

	public void readUser() {
		Session session = UserUtil.getSessionFactory().openSession();
		long i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id: ");
		i = s.nextLong();
		UserClass uc = session.get(UserClass.class, i);
		System.out.println("User Id : "+uc.getId()+"\nUser First name : "+uc.getFirstname()+
				"\nUser Last name : "+uc.getLastname()+"\nUser Email : "+uc.getEmail()+
				"\nUser Age : "+uc.getAge());
		session.close();
	}

	public void updateUser() {
		Session session = UserUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter User ID: ");
		Long J = s.nextLong();
		UserClass uc = session.get(UserClass.class, J);
		System.out.println("Enter your updated Email: ");
		String eml = s.next();
		uc.setEmail(eml);
		session.update(uc);
		t.commit();
		System.out.println("Update Successfull");
		session.close();
	}

	public void deleteUser() {
		Session session = UserUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Your Id : ");
		long k = s.nextLong();
		UserClass uc = session.get(UserClass.class, k);
		session.delete(k);
		t.commit();
		System.out.println("Delete Process Sucessfull.......");
		session.close();
	}
}
