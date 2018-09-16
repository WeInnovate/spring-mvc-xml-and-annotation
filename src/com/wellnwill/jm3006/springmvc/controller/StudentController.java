package com.wellnwill.jm3006.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wellnwill.jm3006.springmvc.model.Student;

@Controller
public class StudentController {

	@InitBinder
	public void trimStrings(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/studentForm")
	public String getStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/processStudentForm")
	public String processStudentForm(@Valid @ModelAttribute("student") Student std, BindingResult bindingResult) {
//		int i = 10/0;
		if (bindingResult.hasErrors()) {
			return "student-form";
		}
		System.out.println(std);
		return "student";
	}
}
