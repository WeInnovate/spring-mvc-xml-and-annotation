package com.wellnwill.jm3006.hibernate;

import java.util.List;

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

//			Student student = new Student(104L, "Ashish", "Kumar", 25, "Male");
//			session.save(student);
			
//			Student std = session.get(Student.class, 101L);
//			System.out.println(std);
			
//			Student std = session.get(Student.class, 101L);
//			std.setLastName("Karan");
			
//			Student std = session.get(Student.class, 101L);
//			session.delete(std);
			
//			List<Student> students = session.createQuery("from Student").getResultList();
//			System.out.println(students);
			
//			List<Student> students = session.createQuery("from Student s where s.firstName = 'Ashok'").getResultList();
//			System.out.println(students);

//			List<Student> students = session.createQuery("from Student s where s.firstName = 'Ashok' and age > 22").getResultList();
//			System.out.println(students);
			
//			List<Student> students = session.createQuery("from Student s where s.firstName like 'As%'").getResultList();
//			System.out.println(students);
			
//			List<Student> students = session.createQuery("from Student s order by s.lastName").getResultList();
//			System.out.println(students);
			
			int i = session.createQuery("update Student s set s.age = 100 where s.id = 101").executeUpdate();
			System.out.println(i);
			
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
