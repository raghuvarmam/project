package model;

import java.util.List;

public interface CourseDAO  {
	public boolean saveCourse(Course c);
	public void updateCourse(Course c);
	public List<Course> availableCourses();
	public List<Course> fetchCourse(int cId);
	public void deleteCourse(int cId );
	
}
