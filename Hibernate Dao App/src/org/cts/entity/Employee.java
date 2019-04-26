package org.cts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "EmployeeDao")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String address;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
