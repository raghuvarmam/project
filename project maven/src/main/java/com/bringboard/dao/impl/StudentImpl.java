package com.bringboard.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.bringboard.dao.StudentDAO;
import com.bringboard.model.HibernateSessionFactory;
import com.bringboard.model.Student;

public class StudentImpl implements StudentDAO {


	public boolean saveStudent(Student st){

		if(st==null)
			throw new RuntimeException("student is null");
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();

		s.save(st);
		System.out.println("saved succesfully");
		tx.commit();
		s.close();
		return true;
	}
	public void updateStudent(Student st){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		s.update(st);
		System.out.println("updated");
		tx.commit();
		s.close();
	
	}
	public List<Student> allStudents(){


		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Student.class);
		List<Student> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;
	
	}
	public List<Student> fetchStudent(String sname){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Student.class);
		cr.add(Restrictions.eq("sName", sname));
		List<Student> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;
	
	}
	public void deleteStudent(String sname ){


		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Student cr= (Student) s.load(Student.class, new String("sName"));
		s.delete(cr);
		System.out.println("deleted");

		tx.commit();
		s.close();	

	
		
	}



}
