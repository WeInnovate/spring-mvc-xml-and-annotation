package com.wellnwill.jm3006.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wellnwill.jm3006.springmvc.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String giveMeHomePage(Model model) {
		model.addAttribute("name", "Karan");
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guava");
		model.addAttribute("fruits", fruits);
		
		Map<String, String> contacts = new HashMap<>();
		contacts.put("Atul", "12345");
		contacts.put("Dheeraj", "4321");
		model.addAttribute("contacts", contacts);
		
		Student student = new Student();
		student.setName("Vivek");
		student.setAge(20);
		student.setGender("Male");
		model.addAttribute("std", student);
		
		return "index";
	}
	
	@RequestMapping("/car-name")
	public String convertMyCarNameToUpperCase(Model model, HttpServletRequest request) {
		String carNameFromUser = request.getParameter("carName");
		model.addAttribute("carNameInUpperCase", carNameFromUser.toUpperCase());
		return "car";
	}
	
	@RequestMapping("/car-name-thru-req-param")
	public String convertMyCarNameToUpperCaseThruReqParam(Model model, @RequestParam("carName") String theCarName) {
		model.addAttribute("carNameInUpperCase", theCarName.toUpperCase());
		return "car";
	}
	
	@RequestMapping("/car-name-thru-path-param/{carName}")
	public String convertMyCarNameToUpperCaseThruPathParam(Model model, @PathVariable("carName") String carName) {
		model.addAttribute("carNameInUpperCase", carName.toUpperCase());
		return "car";
	}
}
