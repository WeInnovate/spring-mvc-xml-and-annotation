package com.wellnwill.jm3006.hibernate.association.otm.bi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OtmBiApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(Course.class)
				.addAnnotatedClass(Assignment.class).buildSessionFactory();

		try {
			Session session = sf.getCurrentSession();

			session.beginTransaction();

			Assignment assignment1 = new Assignment(1010L, "Spring Framework");
			Assignment assignment2 = new Assignment(1020L, "Hibernate Framework");
			List<Assignment> assignments = new ArrayList<>();
			assignments.add(assignment1);
			assignments.add(assignment2);

			Course course = new Course(10L, "Java Frameworks");
			course.setAssignments(assignments);

			Long courseId = (Long) session.save(course);
			System.out.println(courseId);
		/*
			Assignment assignment = session.get(Assignment.class, 1010L);
			session.remove(assignment);
*/
			session.getTransaction().commit();
		} finally {
			sf.close();
		}
	}

}
