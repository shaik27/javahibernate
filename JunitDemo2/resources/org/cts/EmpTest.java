package org.cts;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpTest {
	static EmpMain empMain = null;

	@BeforeClass
	public static void objectCreation() {
		empMain = new EmpMain();
		System.out.println("Object Created");
	}

	@Test
	public void testGetEid() {
		assertEquals(empMain.getEmpId(), 1);
	}

	@Test
	public void testGetEname() {
		assertEquals(empMain.getEmpName(), "shaik");
	}

	@Test
	public void getAllEmpDetails() {
		assertNotNull(empMain.getEmpDetails());
	}

	@Test
	public void compareEmpDetails() {
		assertNotEquals(empMain.getEmpDetails(), new Emp(2, "Meh"));
	}

	@AfterClass
	public static void objectDestruction() {
		empMain = null;
		System.out.println("Object Destroyed");
	}

}
