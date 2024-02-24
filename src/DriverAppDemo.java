import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gl.entity.Employee;

public class DriverAppDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		Session session1=factory.openSession(); //will help us with methods to
												//perform the db CRUD opers
		Transaction tx=session1.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEno(102);
		e1.setEname("Ben");
		e1.setSal(900);
		session1.save(e1);   //ORM
		
		Employee e2=new Employee();
		e2.setEno(103);
		e2.setEname("Chris");
		e2.setSal(1000);
		session1.save(e2); 
		
		
		tx.commit();
		
		session1.close();
		factory.close();
	}

}
