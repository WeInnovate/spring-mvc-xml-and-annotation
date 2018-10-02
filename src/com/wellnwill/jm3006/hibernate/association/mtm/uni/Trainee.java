package com.wellnwill.jm3006.hibernate.association.mtm.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_TRAINEE_MTM_UNI")
public class Trainee {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainee(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + "]";
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

}
