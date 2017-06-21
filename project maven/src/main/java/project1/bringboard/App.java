package project1.bringboard;

import java.util.ArrayList;
import java.util.List;

import com.bringboard.dao.CourseDAO;
import com.bringboard.dao.impl.CourseImpl;
import com.bringboard.model.Course;
import com.bringboard.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	CourseDAO cd= new CourseImpl();
    	
		Course c1= new Course();
		c1.setCourseId(1);
		c1.setCourseName("c");
		c1.setDuration("65 days");
		c1.setNoofLessons(45);
		
		Course c2= new Course();
		c2.setCourseId(2);
		c2.setCourseName("c++");
		c2.setDuration("45 days");
		c2.setNoofLessons(25);
		
		List<Course> cl= new ArrayList<Course>();
		cl.add(c2);
		cl.add(c1);
		
		Student s1= new Student();
		s1.setsNAme("raghu");
		s1.setEducation("b.tech");
		
		
		Student s2= new Student();
		s2.setEducation("btech");
		s2.setsNAme("vinod");
		
		List<Student> ls= new ArrayList<Student>();
		ls.add(s2);
		ls.add(s1);
		
		c1.setSt(ls);
		s1.setCourses(cl);

		cd.saveCourse(c1);

    }
}
