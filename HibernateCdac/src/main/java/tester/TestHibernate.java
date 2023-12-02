package tester;
import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.User;
import pojos.UserRole;

public class TestHibernate {

	public static void main(String[] args) {
	
		try(SessionFactory sf = getFactory();Scanner sc = new Scanner(System.in)){
			
			//name,mail,pass,pass,urole,regamt,lcl date yyyy-mm-dd
			User user = new User(sc.next(), sc.next(),sc.next(), sc.next(), UserRole.valueOf(sc.next().toUpperCase()), sc.nextDouble(), LocalDate.parse(sc.next()));    
			
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println(dao.registerUser(user));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
