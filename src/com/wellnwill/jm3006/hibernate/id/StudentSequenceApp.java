package com.wellnwill.jm3006.hibernate.id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentSequenceApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(StudentSequence.class)
				.buildSessionFactory();

		try {
			Session session = sf.getCurrentSession();

			session.beginTransaction();

			StudentSequence std = new StudentSequence("Ashok", "Pradhan", 22, "Male");
			Long id = (Long) session.save(std);
			System.out.println("ID is: " + id);

			session.getTransaction().commit();
		} finally {
			sf.close();
		}
	}

}
