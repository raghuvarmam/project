package com.bringboard.model;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {

	static SessionFactory sf= null;
	public static SessionFactory createSession(){
		if (sf==null)
			sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();		
		return sf;
	}

}
