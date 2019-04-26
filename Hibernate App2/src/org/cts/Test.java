package org.cts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		// Integer id=(Integer) session.save(emp);//it returns serializable
		// System.out.println(id+" inserted successfully");
		// session.saveOrUpdate(emp);//to save or to update
		// session.delete(emp);//to delete the row in the db
		Employee e = session.get(Employee.class, 1);
		System.out.println(e.getEid() + "\t" + e.getEname() + "\t"
				+ e.getEaddress());
		// tx.commit();
		session.close();
	}

}
