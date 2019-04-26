package org.cts.dao;

import java.util.List;

import org.cts.entity.Employee;
import org.cts.util.DbUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpDaoImpl implements EmployeeDao {

	@Override
	public Integer insert(Employee emp) {
		Session session = DbUtil.getSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer) session.save(emp);
		tx.commit();
		session.close();
		return id;
	}

	@Override
	public Employee get(int id) {
		Session session = DbUtil.getSession();
		Employee emp = session.get(Employee.class, id);
		session.close();
		return emp;
	}

	@Override
	public void delete(int id) {
		Session session = DbUtil.getSession();
		Transaction tx = session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		session.delete(e);
		tx.commit();
		session.close();
	}

	@Override
	public void update(int id, String name, String address) {
		Session session = DbUtil.getSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee(id, name, address);
		session.saveOrUpdate(emp);
		// Employee emp = session.get(Employee.class, id);
		// emp.setEname(name);
		// emp.setAddress(address);
		tx.commit();
		session.close();
	}

	@Override
	public List<Employee> getEmployees() {
		Session session = DbUtil.getSession();
		Query query = session.createQuery("from org.cts.entity.Employee as e");
		List<Employee> employees = query.list();
		return employees;
	}

}
