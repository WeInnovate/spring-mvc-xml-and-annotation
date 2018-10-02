package com.wellnwill.jm3006.hibernate.association.mtm.bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_TRAINER_MTM_BI")
public class Trainer {

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", trainees=" + trainees + "]";
	}

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL)
	List<Trainee> trainees = new ArrayList<>();

	public Trainer(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
		for (Trainee trainee : trainees) {
			trainee.getTrainers().add(this);
		}
	}

}
