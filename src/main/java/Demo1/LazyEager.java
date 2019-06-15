package Demo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
		
		
		
		
		
//		Human h = new Human();
		//h.getLaps().add(lp);
		
	
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
		/*
		 * Query q = session.createQuery("from Human  where hname=:name");
		 * q.setParameter("name",name); if(q.uniqueResult() == null) { h.setHname(name);
		 * }
		 */
		
		

		 String hql = "FROM Human h WHERE h.hname='"+ name +"'";
		 Query q=session.createQuery(hql); 
		 List results = q.list();
		 //System.out.println(results);
		 int abc=0;
		 for(Iterator iterator = results.iterator(); iterator.hasNext();)
		 {
		 Human q1 = (Human) iterator.next();
		 System.out.println("First Name:" + q1.getHid());
		 abc=q1.getHid();
		 }
		 
		 Human h1 = new Human();
		 h1.setHid(abc);
		 
		 Laptop lp = new Laptop();
			lp.setLbrand("lenovo");
			lp.setLprice(30000);
			lp.setHuman(h1);
			ArrayList<Laptop> list1 = new ArrayList<Laptop>();
			list1.add(lp);
			 
			h1.setLaps(list1);
		 
		 if(abc==0)
		 {
			 h1.setHname(name);
			 session.save(h1);
				session.save(lp);
		 }
		 else
		 {
				session.save(lp);
		 }
		
		

			
			
		//l1.add(h1);
		// Human h1 = session.get(Human.class, 1);
		// System.out.println(h1.getHname())
		
	//	session.save(h1);
	//	session.save(lp);
		//session.save(s);
		
		session.getTransaction().commit();
		
		
		
		
		
		
		

	}

}
