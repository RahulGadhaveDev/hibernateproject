package com.practice;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.Entity.Student;
import com.practice.Utility.Hibernatepractice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
        s.setId(6);
        s.setfName("rushikesh");
        s.setlName("Shinde");
        s.setGender("Female");
        s.setCity("parbhani");
        s.setMobileNumber(653445859);
        
        Student s1 = new Student();
        s1.setId(7);
        s1.setfName("Pratiksha");
        s1.setlName("Jadhao");
        s1.setGender("Female");
        s1.setCity("lonar");
        s1.setMobileNumber(653445859);
        
        Student s2 = new Student();
        s2.setId(8);
        s2.setfName("Arti");
        s2.setlName("kulal");
        s2.setGender("Female");
        s2.setCity("parbhani");
        s2.setMobileNumber(653445859);
        
        
        List<Student> StudentList = Arrays.asList(s,s1,s2);
        
        
        // 1. session factory
       SessionFactory factory= Hibernatepractice.getsessionFactory();
       
       //2.session from session factory
       Session session = factory.openSession();
       
       //3. Transaction from session
       
//       // part -1
//       Transaction transaction = session.beginTransaction();
//       
//       //4.save process
//       session.persist(s);
//       
//       //5.pass to database
//       transaction.commit();
       
       
       //Part -2
       
       //to save list of student
       for(Student stu:StudentList) {
    	   Transaction transaction = session.beginTransaction();
    	   session.persist(stu);
    	   transaction.commit(); 
       }
       
       //6.session closed
       session.close();
    }
}
