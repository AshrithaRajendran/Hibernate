package com.jsp.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	private Integer id;
	@Column(nullable=true)
	private Long aadharNumber;
	private String address;
	@OneToOne
	private Citizen citizen;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long i) {
		this.aadharNumber = i;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	

}
