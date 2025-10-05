package com.practice.Utility;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//utility class

public class Hibernatepractice {
	
	private Hibernatepractice() {
		
	}
	
	private static  SessionFactory factory;
	
	public static SessionFactory getsessionFactory() {
	
	if (factory==null) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	  }
	
	
	return factory ;

   }
}
