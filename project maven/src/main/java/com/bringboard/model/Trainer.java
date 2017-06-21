package com.bringboard.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Trainer {
	@Id
	private String trName;
	@Column
	private int trExp;
//	@Column
//	private Address trAddr;
//	private Set<Technologies> trTech;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Course> c;
	@ManyToMany
	private Collection<Student> st;
	
		
	public Collection<Course> getC() {
		return c;
	}
	public void setC(Collection<Course> c) {
		this.c = c;
	}
	public Collection<Student> getSt() {
		return st;
	}
	public void setSt(Collection<Student> st) {
		this.st = st;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public int getTrExp() {
		return trExp;
	}
	public void setTrExp(int trExp) {
		this.trExp = trExp;
	}
//	public Address getTrAddr() {
//		return trAddr;
//	}
//	public void setTrAddr(Address trAddr) {
//		this.trAddr = trAddr;
//	}
//	public Set<Technologies> getTrTech() {
//		return trTech;
//	}
//	public void setTrTech(Set<Technologies> trTech) {
//		this.trTech = trTech;
//	}
	

}
