package com.bringboard.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.bringboard.dao.CourseDAO;
import com.bringboard.model.Course;
import com.bringboard.model.HibernateSessionFactory;

public class CourseImpl implements CourseDAO {
	@Override
	public boolean saveCourse(Course c){
		if(c==null)
			throw new RuntimeException("course is null");
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();	
		s.save(c);
		System.out.println("saved succesfully");
		tx.commit();
		s.close();	
		return true;	
	}
	@Override
	public void  updateCourse(Course c){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		/*Criteria cr=s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseId", cId));
		List<Course> result= cr.list();
*/
		//Course c= (Course) s.load(Course.class, new Integer(cId));
		//s.save(c);
		s.update(c);
		System.out.println("updated");
		tx.commit();
		s.close();
	}
	@Override
	public List<Course> availableCourses(){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Course.class);
		List<Course> result= cr.list();
		System.out.println(result);

		tx.commit();
		s.close();
		return result;
	}
	@Override
	public List<Course> fetchCourse(int cId){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Course.class);
		cr.add(Restrictions.eq("courseId", cId));
		List<Course> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;
	
	}
	@Override
	public void deleteCourse(int cId ){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Course cr= (Course) s.load(Course.class, new Integer(cId));
		s.delete(cr);
		System.out.println("deleted");

		tx.commit();
		s.close();	
	}
	

}
