package org.cts.dao;

import org.cts.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void insert(Student student) {
		Session session = sessionFactory.openSession();
		session.save(student);
		session.beginTransaction().commit();
	}

}
