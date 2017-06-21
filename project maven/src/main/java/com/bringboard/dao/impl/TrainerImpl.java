package com.bringboard.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.bringboard.dao.TrainerDAO;
import com.bringboard.model.HibernateSessionFactory;
import com.bringboard.model.Trainer;

public class TrainerImpl implements TrainerDAO {
	@Override
	public void saveTrainer(Trainer t){
		if(t==null)
			throw new RuntimeException("trainer is null");
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();

		s.save(t);
		System.out.println("saved succesfully");
		tx.commit();
		s.close();	

	}
	@Override
	public void deleteTrainer(String tname){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Trainer cr= (Trainer) s.load(Trainer.class, new String("tname"));
		s.delete(cr);
		System.out.println("deleted");

		tx.commit();
		s.close();	

	}
	@Override
	public void updateTrainer(Trainer t){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		s.update(t);
		System.out.println("updated");
		tx.commit();
		s.close();
	}
	@Override
	public List<Trainer> allTrainers(){

		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Trainer.class);
		List<Trainer> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;
	}
	@Override
	public List<Trainer> fetchTrainer(String tname){
		Session s= HibernateSessionFactory.createSession().openSession();
		Transaction tx= s.beginTransaction();
		Criteria cr=s.createCriteria(Trainer.class);
		cr.add(Restrictions.eq("trName", tname));
		List<Trainer> result= cr.list();
		System.out.println(result);
		tx.commit();
		s.close();
		return result;
	}

}
