package org.cts;

import java.util.List;

import org.cts.dao.EmpDaoImpl;
import org.cts.dao.EmployeeDao;
import org.cts.entity.Employee;

public class Test {

	public static void main(String[] args) {
		// TO Insert
		EmployeeDao dao = new EmpDaoImpl();
		Employee emp1 = new Employee();
		Employee emp = new Employee(2, "sam", "banglore");
		Integer id = dao.insert(emp);
		System.out.println(id + " saved successfully");

		// To Get
		int eid = 1;
		Employee e = dao.get(eid);
		System.out.println(e.getEid() + "\t" + e.getEname() + "\t"
				+ e.getAddress());

		// To Delete
		int eId = 3;
		dao.delete(eId);
		System.out.println(eId + " deleted successfully");

		// To Update
		dao.update(4, "shaik", "delhi");
		System.out.println(emp1.getEid() + "\t" + emp1.getEname() + "\t"
				+ emp1.getAddress());

		// To Get All Details
		List<Employee> employees = dao.getEmployees();
		for (Employee empl : employees) {
			System.out.println(empl.getEid() + "\t" + empl.getEname() + "\t"
					+ empl.getAddress());
		}

	}

}
