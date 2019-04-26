package org.cts;

import java.util.List;

import org.hibernate.Query;
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
		// Student stud = new Student(3, "sam", 50);
		Query query = session
				.createQuery("from org.cts.Student as s where s.sId=?");
		query.setParameter(0, 2);

		List<Student> students = query.list();
		for (Student student : students) {
			System.out.println(student.getsId() + "\t" + student.getsName()
					+ "\t" + student.getsMarks());
		}

		// session.save(stud);
		// tx.commit();
		session.close();

	}

}
