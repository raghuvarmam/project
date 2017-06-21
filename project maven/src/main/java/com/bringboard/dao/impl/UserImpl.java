package com.bringboard.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.bringboard.dao.UserDAO;
import com.bringboard.model.HibernateSessionFactory;
import com.bringboard.model.UserTable;

public class UserImpl implements UserDAO {

	public boolean saveUser(UserTable u){
		if(u==null)
			throw new RuntimeException("trainer is null");
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();

		s.save(u);
		System.out.println("saved succesfully");
		tx.commit();
		s.close();
		return true;

	}
	public void deleteUser(String uname){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		UserTable ur= (UserTable) s.load(UserTable.class, new String("uname"));
		s.delete(ur);
		System.out.println("deleted");

		tx.commit();
		s.close();	


	}
	public void updateUser(UserTable u){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		s.update(u);
		System.out.println("updated");
		tx.commit();
		s.close();

	}
	public List<UserTable> allUsers(){


		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(UserTable.class);
		List<UserTable> result= cr.list();
		System.out.println(result);

		tx.commit();
		s.close();
		return result;


	}
	public List<UserTable> fetchUser(String uname){



		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(UserTable.class);
		cr.add(Restrictions.eq("username", uname));
		List<UserTable> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;



	}




}
