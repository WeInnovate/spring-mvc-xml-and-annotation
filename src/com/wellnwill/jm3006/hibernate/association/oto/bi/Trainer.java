package com.wellnwill.jm3006.hibernate.association.oto.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3006_ASSOCIATION_TRAINER_OTO_BI")
public class Trainer {

	@Id
	@Column(name = "id")
	private Long id;

	public Trainer(Long id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "name")
	private String name;

	@Column(name = "mobile")
	private String mobile;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TRAINER_DETAIL_ID")
	private TrainerDetail trainerDetail;

	public TrainerDetail getTrainerDetail() {
		return trainerDetail;
	}

	public void setTrainerDetail(TrainerDetail trainerDetail) {
		this.trainerDetail = trainerDetail;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", mobile=" + mobile + ", trainerDetail=" + trainerDetail + "]";
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
