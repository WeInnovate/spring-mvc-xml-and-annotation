package com.wellnwill.jm3006.springmvc.service;

import java.util.List;

import com.wellnwill.jm3006.springmvc.model.User;

public interface UserService {
	void saveUser(User user);

	User getUser(Long id);

	List<User> getUsers();

	void deleteUser(Long id);

	void updateUser(User user);
}
