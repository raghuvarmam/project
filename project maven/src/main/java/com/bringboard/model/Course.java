package com.bringboard.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id 
	private int courseId;
	@Column
	private String CourseName;
	@Column
	private int noofLessons;
	@Column
	private String duration;	
	@ManyToMany(mappedBy="courses",cascade=CascadeType.ALL)
	private List<Student> st;
	
//	@ManyToOne
//	private Trainer t;
		
	public List<Student> getSt() {
		return st;
	}
	public void setSt(List<Student> st) {
		this.st = st;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getNoofLessons() {
		return noofLessons;
	}
	public void setNoofLessons(int noofLessons) {
		this.noofLessons = noofLessons;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", CourseName=" + CourseName + ", noofLessons=" + noofLessons
				+ ", duration=" + duration + "]";
	}
	
	
	

}
