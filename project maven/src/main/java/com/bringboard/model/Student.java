package com.bringboard.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private String sNAme;
	@Column
	private String education;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course> courses;
	
	//private Address stAddr;
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public String getsNAme() {
		return sNAme;
	}
	public void setsNAme(String sNAme) {
		this.sNAme = sNAme;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
//	public Address getStAddr() {
//		return stAddr;
//	}
//	public void setStAddr(Address stAddr) {
//		this.stAddr = stAddr;
//	}
//	

}
