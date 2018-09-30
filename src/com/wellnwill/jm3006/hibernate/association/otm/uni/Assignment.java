package com.wellnwill.jm3006.hibernate.association.otm.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_ASSIGNMENT_OTM_UNI")
public class Assignment {

	@Id
	@Column(name = "assignment_id")
	private Long id;

	@Column(name = "assignment_name")
	private String name;

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
