package org.cts;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
	Emp e = new Emp(1, "shaik");

	public void setEmpId(int eid) {
		e.setEid(eid);
	}

	public int getEmpId() {
		return e.getEid();
	}

	public void setEmpName(String ename) {
		e.setEname(ename);
	}

	public String getEmpName() {
		return e.getEname();
	}

	public List<Emp> getEmpDetails() {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(2, "Meh"));
		return list;

	}

}
