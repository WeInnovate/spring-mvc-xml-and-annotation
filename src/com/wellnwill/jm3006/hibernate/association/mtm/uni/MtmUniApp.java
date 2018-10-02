package com.wellnwill.jm3006.hibernate.association.mtm.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MtmUniApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(Trainer.class)
				.addAnnotatedClass(Trainee.class).buildSessionFactory();

		try {
			Session session = sf.getCurrentSession();

			session.beginTransaction();

			Trainer trainerOne = new Trainer(10L, "Atul");
			Trainer trainerTwo = new Trainer(20L, "Some");

			Trainee traineeOne = new Trainee(101L, "Ashok");
			Trainee traineeTwo = new Trainee(102L, "Vivek");
			List<Trainee> trainees = new ArrayList<>();
			trainees.add(traineeOne);
			trainees.add(traineeTwo);

			trainerOne.setTrainees(trainees);
			trainerTwo.setTrainees(trainees);

			session.save(trainerOne);
			session.save(trainerTwo);
			session.getTransaction().commit();
		} finally {
			sf.close();
		}
	}

}
