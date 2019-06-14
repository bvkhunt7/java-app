package Demo1;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class LazyEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Human h = new Human();
		
		
		
		
		Laptop lp = new Laptop();
		lp.setLbrand("Apple");
		lp.setLprice(30000);
		lp.setHuman(h);
	
		System.out.println("enter human name");
		
		Scanner nm = new Scanner(System.in);
		
		String name=nm.nextLine();
		
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Human.class);
	    @SuppressWarnings("unused")
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();	
		@SuppressWarnings("deprecation")
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		Query q = session.createQuery("from Human  where hname=:name");
		q.setParameter("name",name);
		if(q.uniqueResult() == null)
		{
	       		h.setHname(name);
		}
		
		// Human h1 = session.get(Human.class, 1);
		// System.out.println(h1.getHname())
		
		session.save(h);
		session.save(lp);
		//session.save(s);
		
		session.getTransaction().commit();
		
		
		
		
		
		
		

	}

}
