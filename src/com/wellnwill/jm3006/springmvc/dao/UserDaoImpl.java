package com.wellnwill.jm3006.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wellnwill.jm3006.springmvc.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) {
//		sessionFactory.openSession().saveOrUpdate(user);
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public User getUser(Long id) {
		return sessionFactory.openSession().get(User.class, id);
	}

	@Override
	public List<User> getUsers() {
		return (List<User>) sessionFactory.openSession().createQuery("from User").getResultList();
	}

	@Override
	public void deleteUser(Long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		User user = session.get(User.class, id);
		session.delete(user);
		session.getTransaction().commit();
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

}
