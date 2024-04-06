package com.emp.Emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil 
{
	private static final SessionFactory sessionfactory=getsessionfactory();

	private static SessionFactory getsessionfactory()
	{
		try
		{
			return new Configuration().configure("hibernate.cfg.xml").
					addAnnotatedClass(Emp.class).
					addAnnotatedClass(Manager_data.class).
					addAnnotatedClass(Department.class).
					buildSessionFactory();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	public static Session getSession()
	{
		return sessionfactory.openSession();
		
	}
}
