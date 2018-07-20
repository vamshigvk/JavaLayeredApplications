package lab10_2_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.eis.bean.Employee;

public class Lab10_2_2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=ExceptionCheck10_2_2.class)
	public void test() {
		Employee employee=new Employee();
		employee.setSalary(2000);
		assertEquals(2000,employee.getSalary(),0);
	}

}
