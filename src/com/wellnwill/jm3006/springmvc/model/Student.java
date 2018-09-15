package com.wellnwill.jm3006.springmvc.model;

import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.wellnwill.jm3006.springmvc.validation.BatchCode;



public class Student {

	@NotNull(message = " is requied")
	private String name;

	@Min(value = 18, message = " should be more than 18")
	@Max(value = 110, message = " should be less than 110")
	private int age;

	private String gender = "Female";

	@Size(min = 3, max = 10, message = " should be min 3 and max 10 chacter long")
	private String country;
	
	private String[] courses;

	private boolean graduate;
	
	@Pattern(regexp = "^[a-zA-Z0-9]", message = " should only characters/digits are allowed")
	private String comment;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Past
	private Date dob;
	
	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	@BatchCode(value = "FW3", message = " prefix should be FW3")
	private String batchCode;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future
	private Date examDate;
	
	public Date getDob() {
		return dob;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

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
				+ Arrays.toString(courses) + ", graduate=" + graduate + ", comment=" + comment + ", dob=" + dob
				+ ", batchCode=" + batchCode + ", examDate=" + examDate + "]";
	}

}
