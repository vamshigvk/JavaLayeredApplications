package lab10_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateTest {

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
	public void test()
	{
		Date date= new Date();
		int expected=10;
		date.setDay(expected);
		int obtained=date.getDay();
		assertEquals(obtained, expected);
		assertNotNull(obtained);
		assertTrue(obtained>0&&obtained<=31);
		
	}
	@Test
	public void test1()
	{
		Date date= new Date();
		int expected=12;
		date.setMonth(expected);
		int obtained=date.getMonth();
		assertEquals(obtained, expected);
		assertNotNull(obtained);
		assertTrue(obtained>0&&obtained<13);
	}
	@Test
	public void test2()
	{
		Date date= new Date();
		int expected=2018;
		date.setYear(expected);
		int obtained=date.getYear();
		assertEquals(obtained, expected);
		assertNotNull(obtained);
		assertTrue(obtained>0&&obtained<9999);
	}

}
