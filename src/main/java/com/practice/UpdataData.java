package com.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.Hibernatepractice;

public class UpdataData {
	public static void main(String[] args) {
		
		SessionFactory factory = Hibernatepractice.getsessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student s = session.find(Student.class, 4);
		s.setfName("rahul");
		s.setlName("Gadhave");
		s.setCity("Lonar");
		s.setMobileNumber(84645585);
		
		transaction.commit();
		session.close();
	}
}

