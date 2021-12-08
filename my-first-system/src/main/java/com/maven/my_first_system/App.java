package com.maven.my_first_system;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
	Student s=new Student();
	s.setName("Suhaib");
	s.setRollno(1);
	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t= session.beginTransaction();
	session.save(s);
	t.commit();
}
}
