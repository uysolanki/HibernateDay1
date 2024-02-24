import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gl.entity.Employee;
import com.gl.utils.HibernateUtils;

public class LoadDemo {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtils.getSessionFactory();
		
		Session session1=factory.openSession();
		
		Transaction tx=session1.beginTransaction();
		
		Employee e1=(Employee)session1.load(Employee.class, 101);
		//will be select executed ? 
		System.out.println("hi");
		System.out.println("bye");
		
		System.out.println(e1.getEname());
		tx.commit();
	}
	
}
