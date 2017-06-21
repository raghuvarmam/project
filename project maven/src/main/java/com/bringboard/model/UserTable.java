package com.bringboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserTable {
	@Id
	private String username;
	@Column
	private String password;
	@Column
	private String fName;
	@Column
	private String lName;
	//private Address addr;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
//	public Address getAddr() {
//		return addr;
//	}
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}


}
