package com.bringboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class Address {
	@Column
	private String email;
	@Column
	private String phnNum;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
	

}
