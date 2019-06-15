package Demo1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class biuni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		department d = new department();
        d.setDname("kru");
        
		
		person p = new person();
		p.setPname("krutarth");
		p.setDepartment(d);
		
		
		/*
		 * department d = new department(); d.setDname("kru");
		 */
          
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(person.class).addAnnotatedClass(department.class);
	    @SuppressWarnings("unused")
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();	
		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
	
		/*
		 * Query q = session.createQuery("from department"); List<department> dept =
		 * q.list(); for(department dp: dept) {
		 * 
		 * System.out.println(dp); }
		 */
		
		
		

		
		session.getTransaction().commit();
		
		
		
		
		
	}

}
