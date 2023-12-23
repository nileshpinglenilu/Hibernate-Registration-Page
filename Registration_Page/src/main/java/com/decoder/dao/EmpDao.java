package com.decoder.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.decoder.entity.Emp;

public class EmpDao 
{
	private SessionFactory sessionFactory;

	public EmpDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	public boolean saveEmp(Emp emp)
	{
		boolean f = false;
		Session session  = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int i = (Integer)session.save(emp);
		if(i>0)
		{
			System.out.println("data saved..!");
			f = true;
		}
		else
		{
			System.out.println("Not save");
		}
		
		tx.commit();
		session.close();
		
		return f;
	}
	
}
