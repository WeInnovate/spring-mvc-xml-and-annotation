package com.wellnwill.jm3006.hibernate.association.otm.uni;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_COURSE_OTM_UNI")
public class Course {

	@Id
	@Column(name = "course_id")
	private Long id;

	@Column(name = "course_name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Assignment> assignments = new ArrayList<>();

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public Course(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Course() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", assignments=" + assignments + "]";
	}

}
