package com.deconder.conn;

import java.util.Properties;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.decoder.entity.Emp;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory == null)
		{
			Configuration configuration = new Configuration();
			Properties properties = new  Properties();
			properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			properties.put(Environment.URL,"jdbc:mysql://localhost:3306/new_schema");
			properties.put(Environment.USER,"student");
			properties.put(Environment.PASS,"Student@1997");
			properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
			properties.put(Environment.HBM2DDL_AUTO,"update");
			properties.put(Environment.SHOW_SQL,true);
			
			configuration.setProperties(properties);
			configuration.addAnnotatedClass(Emp.class);
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		}
		return sessionFactory;
	}
}
