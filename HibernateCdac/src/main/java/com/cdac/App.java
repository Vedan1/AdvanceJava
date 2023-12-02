package com.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
    	
    	SessionFactory sf = new Configuration().addAnnotatedClass(Alien.class).buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(ali);
    	tx.commit();
    }
}
