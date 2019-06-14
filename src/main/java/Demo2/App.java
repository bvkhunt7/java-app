package Demo2;


import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		laptop laptop = new laptop();
		
		Scanner lp = new Scanner(System.in);
		System.out.println("enter laptop name");
        laptop.lname = lp.nextLine();
        

		/*student s = new student();
		s.setSid(101);r
		s.setSname("krutartha");
		s.setMarks(100);
		s.getLaptop().add(laptop);
		*/
	
		
		Configuration config = new Configuration().configure().addAnnotatedClass(laptop.class);
	    @SuppressWarnings("unused")
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();	
		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		//session.save(s);
		
		session.getTransaction().commit();
		
		
		
	}

}
