package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
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
	
//	@ManyToMany(mappedBy="courses",cascade=CascadeType.ALL)
//	private List<Student> st;
	public Course(int courseId, String courseName, int noofLessons, String duration) {
		this.courseId = courseId;
		CourseName = courseName;
		this.noofLessons = noofLessons;
		this.duration = duration;
	}
	public Course() {
}
		
//	public Trainer getT() {
//		return t;
//	}
//	public void setT(Trainer t) {
//		this.t = t;
//	}
//	public List<Student> getSt() {
//		return st;
//	}
//	public void setSt(List<Student> st) {
//		this.st = st;
//	}
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
