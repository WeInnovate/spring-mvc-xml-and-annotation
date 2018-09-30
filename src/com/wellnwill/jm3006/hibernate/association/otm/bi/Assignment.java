package com.wellnwill.jm3006.hibernate.association.otm.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_ASSIGNMENT_OTM_BI")
public class Assignment {

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Id
	@Column(name = "assignment_id")
	private Long id;

	@Column(name = "assignment_name")
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private Course course;

	public Assignment() {
		super();
	}

	public Assignment(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Assignment [id=" + id + ", name=" + name + "]";
	}

}
