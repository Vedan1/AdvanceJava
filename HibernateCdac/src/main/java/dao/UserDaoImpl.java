package dao;

import pojos.User;
import static utils.HibernateUtils.getFactory;

import java.io.Serializable;

import org.hibernate.*;
public class UserDaoImpl implements UserDao{

	@Override
	public String registerUser(User user) {
		String mesg;
		Session sf = getFactory().openSession();
		Transaction tx = sf.beginTransaction();
		try {
			Serializable userID = sf.save(user);
			 tx.commit();
			 mesg = "UserRegistered Successfully "+userID;
			
		}catch(RuntimeException e) {
			if(tx!=null) 
				tx.rollback();
			throw e;	
		}
		finally {
			if(sf!=null) 
				sf.close();	
		}
		
		return mesg;
	}

}
