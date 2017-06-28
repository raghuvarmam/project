package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class testclass {
	public static void main(String[] args) {
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		
		CourseDAO cd= new CourseDAOImpl();
		
		Course c1= new Course(1, "courseName", 25, "duration");
		Course c2= new Course(2, "courseName 2", 15, "duration 2");
		List<Course> list= new ArrayList<Course>();
		list.add(c2);
		list.add(c1);
		
		cd.saveCourse(c1);
		cd.saveCourse(c2);

		s.save(c1);
		s.save(c2);
		s.close();
		tx.commit();
	}

}
