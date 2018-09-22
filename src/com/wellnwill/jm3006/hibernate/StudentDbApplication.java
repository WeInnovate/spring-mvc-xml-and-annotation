package com.wellnwill.jm3006.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDbApplication {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate-cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			Student student = new Student(101L, "Ashok", "Vivek", 22, "Male");
//			session.save(student);
			
//			Student std = session.get(Student.class, 101L);
//			System.out.println(std);
			
//			Student std = session.get(Student.class, 101L);
//			std.setLastName("Karan");
			
			Student std = session.get(Student.class, 101L);
			session.delete(std);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
