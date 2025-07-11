package com.practice;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.Hibernatepractice;

public class GetDataByIdMain {
	public static void main(String[] args) {
		
		
		SessionFactory factory = Hibernatepractice.getsessionFactory();
		 
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Student st=session.find(Student.class, 2);
		System.out.println(st.toString());
		
		transaction.commit();
		session.close();
	} 
}
