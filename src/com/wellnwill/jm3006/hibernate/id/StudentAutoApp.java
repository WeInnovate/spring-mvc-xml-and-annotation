package com.wellnwill.jm3006.hibernate.id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentAutoApp {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(StudentAuto.class)
				.buildSessionFactory();

		Session session = sf.getCurrentSession();
		try {

//			begin the transaction
			session.beginTransaction();
//			perform the transaction
			StudentAuto std = new StudentAuto("Martin", "Fowler", 55, "Male");
			Long id = (Long) session.save(std);
			System.out.println("ID is: " + id);
//			commit the transaction
			session.getTransaction().commit();
		} finally {
			sf.close();
		}

	}

}
