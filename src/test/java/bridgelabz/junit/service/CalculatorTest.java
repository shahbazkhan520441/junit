package bridgelabz.junit.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import bridgelabz.junit.serviceImpl.Calculator;

public class CalculatorTest {

	Calculator cal;

	@BeforeAll
	public static void beforeAll()
	{
		System.out.println(" database connection is established successfully ");
	}

	@AfterAll
	public static void afterAll()
	{
		System.out.println(" database connection is closed successfully ");
	}


	@BeforeEach
	public void init()
	{
		cal=new Calculator();
		System.out.println(" executed every time before every method ");
	}

	@AfterEach
	public void afterEach()
	{
		System.out.println(" executed every time after every method ");
	}

	@Test
	@DisplayName("addtestmethod")
	public void addTest()
	{
		assertEquals(30,cal.add(10,20));
		assertEquals(5,cal.add(2,3));
		assertEquals(3000,cal.add(1000,2000));
		assertEquals(-90,cal.add(-40,-50));

		System.out.println(" add test is executed");
	}






}
