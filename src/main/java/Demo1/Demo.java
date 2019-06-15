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


public class Demo {
	
	public static void main(String[] args) {
	
	
	Per h = new Per();
	
	
	
	
	
//	Human h = new Human();
	//h.getLaps().add(lp);
	

	System.out.println("enter human name");
	
	Scanner nm = new Scanner(System.in);
	
	String name=nm.nextLine();
	
	
	
	Configuration config = new Configuration().configure().addAnnotatedClass(Contact.class).addAnnotatedClass(Per.class);
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
	
	

	 String hql = "FROM Per h WHERE h.pname='"+ name +"'";
	 Query q=session.createQuery(hql); 
	 List results = q.list();
	 //System.out.println(results);
	 int abc=0;
	 for(Iterator iterator = results.iterator(); iterator.hasNext();)
	 {
	 Per q1 = (Per) iterator.next();
	 System.out.println("First Name:" + q1.getPid());
	 abc=q1.getPid();
	 }
	 
	 Per h1 = new Per();
	 h1.setPid(abc);
	 
	 Contact ct = new Contact();
	
		ct.setCno(50000000);
		ct.setPer(h1);
		ArrayList<Contact> list1 = new ArrayList<Contact>();
		list1.add(ct);
		 
		h1.setLaps(list1);
	 
	 if(abc==0)
	 {
		 h1.setPname(name);
		 session.save(h1);
			session.save(ct);
	 }
	 else
	 {
			session.save(ct);
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


