package org.cts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "StudentDetails")
public class Student {
	@Id
	@Column(name = "studId")
	private int sId;
	@Column(name = "studName")
	private String sName;
	@Column(name = "studMarks")
	private int sMarks;

	public Student() {
		super();
	}

	public Student(int sId, String sName, int sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

}
