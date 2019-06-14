package Demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class unibi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		professor p = new professor();
		p.setPname("kru");
		p.setPsalary(30000);
		
		
		parkspace ps = new parkspace();
		ps.setLocation("surat");
		ps.setLot(100);
		
		
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(person.class).addAnnotatedClass(department.class);
	    @SuppressWarnings("unused")
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();	
		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(p);
		session.save(ps);
		//session.save(s);
		
		session.getTransaction().commit();
		
		
		
	}

}
