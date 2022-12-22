package com.Scanner.Daoimpl;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Scanner.Dao.BookDao;
import com.Scanner.Entity.BookClass;
import com.Scanner.HibernateUtil.BookUtil;

public class BookImpl implements BookDao {

	public void addBook() {
		Session session = BookUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		long book_id;
		String na, au;
		int price;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book ID: ");
		book_id = s.nextLong();
		System.out.println("Enter Book name: ");
		na = s.next();
		System.out.println("Enter Book author name: ");
		au = s.next();
		System.out.println("Enter Book price: ");
		price = s.nextInt();
		BookClass boc = new BookClass();
		boc.setId(book_id);
		boc.setBookname(na);
		boc.setAuthor(au);
		boc.setPrice(price);
		session.save(boc);
		t.commit();
		System.out.println("Book Record Inserted Successfully");
		session.close();
	}		

	public void readBook() {
		Session session = BookUtil.getSessionFactory().openSession();
		long i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter User Id: ");
		i = s.nextLong();
		BookClass boc = session.get(BookClass.class, i);
		System.out.println("Book Id : "+boc.getId()+"\nBook name : "+boc.getBookname()+
				"\nBook Author name : "+boc.getPrice()+"\nBook Price : "+boc.getPrice());
		session.close();
	}		
	}

