package com.wellnwill.jm3006.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wellnwill.jm3006.springmvc.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/studentForm")
	public String getStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student std) {
		System.out.println(std);
		return "student";
	}
}
