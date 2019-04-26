package org.cts.dao;

import java.util.List;

import org.cts.entity.Employee;

public interface EmployeeDao {
	Integer insert(Employee emp);
	Employee get(int id);
	void delete(int id);
	void update(int id,String name,String address);
	List<Employee> getEmployees();
}
