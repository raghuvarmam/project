package com.bringboard.dao;

import java.util.List;

import com.bringboard.model.Course;

public interface CourseDAO  {
	public boolean saveCourse(Course c);
	public void updateCourse(Course c);
	public List<Course> availableCourses();
	public List<Course> fetchCourse(int cId);
	public void deleteCourse(int cId );
	
}
