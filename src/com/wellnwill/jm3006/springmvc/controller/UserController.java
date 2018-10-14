package com.wellnwill.jm3006.springmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wellnwill.jm3006.springmvc.model.User;
import com.wellnwill.jm3006.springmvc.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/registration")
	public String userRegistrationForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "user-registration";
	}

	@Transactional
	@PostMapping("/register")
	public void registerUser(@ModelAttribute("user") User user, HttpServletResponse response) throws IOException {
		System.out.println(user);
		userService.saveUser(user);
//		int i = 10/0;
		response.sendRedirect("all");
	}

	@GetMapping("/all")
	public String showAllUsers(Model model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@GetMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Long id, HttpServletResponse response) throws IOException {
		userService.deleteUser(id);
		response.sendRedirect("../all");
	}

	@GetMapping("/update/{id}")
	public String updateUserForm(@PathVariable("id") Long id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		return "user-registration";
	}
}
