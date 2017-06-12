package maven.demo.hibernate_sample;

public class Course {
	private int courseId;
	private String CourseName;
	private int noofLessons;
	private String duration;
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
	
	
	

}
