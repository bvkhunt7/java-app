package Demo1;



import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Stud sd = new Stud();
		sd.setSid(100);
		sd.setSname("kru");
		sd.setSstd(9);
		
		
		
		 
		@SuppressWarnings("deprecation")
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
	    session.beginTransaction();
		
	    
	    //save data
		session.save(sd);
	
	    
	    // fetch data
	    //sd=(Stud)session.get(Stud.class,102);
	    
		session.getTransaction().commit();
		
		System.out.println(sd);
		
	}

}
