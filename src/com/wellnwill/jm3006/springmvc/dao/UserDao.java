package com.wellnwill.jm3006.springmvc.dao;

import java.util.List;

import com.wellnwill.jm3006.springmvc.model.User;

public interface UserDao {
	void saveUser(User user);

	User getUser(Long id);

	List<User> getUsers();

	void deleteUser(Long id);

	void updateUser(User user);
}
