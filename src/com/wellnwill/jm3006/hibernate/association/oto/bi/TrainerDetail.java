package com.wellnwill.jm3006.hibernate.association.oto.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_TRAINER_DETAIL_OTO_BI")
public class TrainerDetail {

	@Id
	@Column(name = "id")
	private Long id;

	public TrainerDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private int age;

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
		if (trainer != null) {
			trainer.setTrainerDetail(this);
		}
	}

	@OneToOne(mappedBy = "trainerDetail", cascade = CascadeType.ALL)
	private Trainer trainer;

	public TrainerDetail(Long id, String email, int age, String gender) {
		super();
		this.id = id;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	@Column(name = "gender")
	private String gender;


	@Override
	public String toString() {
		return "TrainerDetail [id=" + id + ", email=" + email + ", age=" + age + ", gender=" + gender + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}
