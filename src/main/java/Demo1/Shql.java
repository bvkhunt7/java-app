package Demo1;


//import java.util.List;
//import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Shql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Studhql.class);
	    @SuppressWarnings("unused")
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();	
		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		int b = 40;
		session.beginTransaction();
		
	/*	Random r = new Random();
	     
		for(int i=0;i<=100;i++)
		{
			Studhql s = new Studhql();
			s.setSid(i);
			s.setSname("sname" + i);
		    s.setMarks(r.nextInt(100));
		    session.save(s);
		}
	*/
		
		Query q = session.createQuery("select sum(marks) from Studhql where marks> :b ");
		q.setParameter("b",b);
		
		Long marks = (Long) q.uniqueResult();
		
		System.out.println(marks);
		
		
		session.getTransaction().commit();
		
		
		
	}



		
	}


