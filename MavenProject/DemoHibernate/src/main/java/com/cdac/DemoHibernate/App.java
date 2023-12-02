package com.cdac.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  
   	System.out.println( "Hello World!" );
    	Alien ali = new Alien();
    	ali.setE_color("green");
    	ali.setE_id(101);
    	ali.setE_name("ali");
    	
    	Configuration con = new Configuration();
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	session.save(ali);
    	
    }
}
