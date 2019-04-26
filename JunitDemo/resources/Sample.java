import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	Add add = new Add();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class execution");
	}

	@Before
	public void beforeMeth() {
		System.out.println("before execution of test case");
	}

	@Test
	public void test1() {
		assertEquals(add.add(10, 20), 30);
	}

	@Test
	@Ignore
	// to disable the test case 2
	public void test2() {
		assertEquals(add.add(10, 40), 50);
	}

	@After
	public void afterMeth() {
		System.out.println("after execution of test case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class execution");
	}

}
