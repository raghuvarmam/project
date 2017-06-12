package maven.demo.hibernate_sample;


public class CourseSchedule   {
	private Course c;
	private Trainer tr;
	private int noofDays;
	private Student s;
	private int startTime;
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	public Trainer getTr() {
		return tr;
	}
	public void setTr(Trainer tr) {
		this.tr = tr;
	}
	public int getNoofDays() {
		return noofDays;
	}
	public void setNoofDays(int noofDays) {
		this.noofDays = noofDays;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	
}
