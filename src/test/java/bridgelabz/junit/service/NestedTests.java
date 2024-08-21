package bridgelabz.junit.service;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import bridgelabz.junit.serviceImpl.Calculator;

public class NestedTests {
	Calculator cal;


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

	@Nested
	class addAndSub
	{
		@Test
		public void addTest()
		{
			assertEquals(30,cal.add(10,20));
			assertEquals(5,cal.add(2,3));
			assertEquals(3000,cal.add(1000,2000));
			assertEquals(-90,cal.add(-40,-50));

			System.out.println(" add test is executed");
		}
		@Test
		public void subTest()
		{
			assertEquals(10,cal.sub(20,10));
			System.out.println(" sub test is executed");
		}
	}

	@Nested
	class MultipleAndDivision
	{
		@Test
		public void multiplyTest()
		{
			assertEquals(200,cal.multiply(10,20));
			System.out.println(" multiplication test is executed");
		}
		@Test
		public void divisionTest()
		{
			assertEquals(20,cal.divide(200,10));
			System.out.println(" division test is executed");
		}
	}

}