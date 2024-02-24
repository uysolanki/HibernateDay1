package com.gl.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionfactory=null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionfactory==null)
		{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sessionfactory=cfg.buildSessionFactory();
		}
		return sessionfactory;
	}
}
