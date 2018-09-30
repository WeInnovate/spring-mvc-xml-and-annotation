package com.wellnwill.jm3006.hibernate.association.oto.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OtoBiApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate-cfg.xml").addAnnotatedClass(Trainer.class)
				.addAnnotatedClass(TrainerDetail.class).buildSessionFactory();

		try {
			Session session = sf.getCurrentSession();

			session.beginTransaction();

			/*Trainer trainer = new Trainer(101L, "Atul", "987");
			TrainerDetail trainerDetail = new TrainerDetail(10101L, "a@a.com", 22, "Male");
			trainerDetail.setTrainer(trainer);
			
			Long trainerDetailId = (Long)session.save(trainerDetail);
			System.out.println(trainerDetailId);*/
			
			TrainerDetail trnDtl = session.get(TrainerDetail.class, 10101L);
			System.out.println(trnDtl);
			System.out.println(trnDtl.getTrainer());
	
			
			session.getTransaction().commit();
		} finally {
			sf.close();
		}
	}

}
