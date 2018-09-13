package com.wellnwill.jm3006.springmvc.model;

import java.util.Arrays;

public class Student {

	private String name;

	private int age;

	private String gender = "Female";

	private String country;
	
	private String[] courses;

	private boolean graduate;
	
	private String comment;
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", country=" + country + ", courses="
				+ Arrays.toString(courses) + ", graduate=" + graduate + ", comment=" + comment + "]";
	}

}
