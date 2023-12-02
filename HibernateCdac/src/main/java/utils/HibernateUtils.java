package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;

	static { 	
		System.out.println("In Init <3");
		factory = new Configuration().configure().buildSessionFactory();
		
	}

	public static SessionFactory getFactory() {
		return factory;
	}
	
	
	
}
