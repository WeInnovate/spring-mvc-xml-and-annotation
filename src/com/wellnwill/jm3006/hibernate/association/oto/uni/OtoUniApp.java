package com.wellnwill.jm3006.hibernate.association.oto.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OtoUniApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(Trainer.class)
				.addAnnotatedClass(TrainerDetail.class).buildSessionFactory();

		try {
			Session session = sf.getCurrentSession();

			session.beginTransaction();
/*
			Trainer trainer = new Trainer(101L, "Atul", "987");
			TrainerDetail trainerDetail = new TrainerDetail(10101L, "a@a.com", 22, "Male");
			trainer.setTrainerDetail(trainerDetail);
			
			Long trainerId = (Long)session.save(trainer);
			System.out.println(trainerId);*/
		/*	
			Trainer trn = session.get(Trainer.class, 101L);
			System.out.println(trn);*/
			
		/*	Trainer trn = session.get(Trainer.class, 101L);
			trn.setName("Atul Dwivedi");
			trn.getTrainerDetail().setAge(24);
*/
			Trainer trn = session.get(Trainer.class, 101L);
			session.remove(trn);
			
			session.getTransaction().commit();
		} finally {
			sf.close();
		}
	}

}
