package bridgelabz.junit.service;


import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import bridgelabz.junit.serviceImpl.Calculator;

public class TimeOutTesting {

	Calculator cal;

	@BeforeEach
	public void init()
	{
		cal=new Calculator();
		System.out.println(" executed every time before every method ");
	}

	@Test
	public void test1()
	{
		assertTimeout(Duration.ofMillis(1),()->cal.timeOutTesting());
	}

}
