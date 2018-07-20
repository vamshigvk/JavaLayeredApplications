package lab10_2_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lab2_1.Person;

public class PersonTest {

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

	@Test
	public void testFirstName() {
		Person p=new Person("vam","krishna",'m');
		assertEquals("vam",p.getFirstName());
	}
	@Test
	public void testLastName() {
		Person p=new Person("vam","krishna",'m');
		assertEquals("krishna",p.getLastName());
	}
	@Test
	public void testGender() {
		Person p=new Person("vam","krishna",'m');
		assertEquals('m',p.getGender());
	}

}
