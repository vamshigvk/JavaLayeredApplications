package lab10_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Before test");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("After test");
	}

	@Test
	public void testGetFullName()
	{
	System.out.println("from TestPerson2");
	Person per = new Person();
	per.setFirstName("Robert");
	per.setLastName("king");
	String expected="Robert king";
	String observed=per.getFullName();
	
	assertEquals(expected, observed);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testNullsInName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		Person per1 = new Person(null,null);
	}
}



