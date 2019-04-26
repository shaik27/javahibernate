package org.cts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = AppConfig.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Emp emp = new Emp(1, "shaik");
		session.save(emp);
		tx.commit();
		session.close();
	}

}
