package bridgelabz.junit.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bridgelabz.junit.serviceImpl.AgeInvalidException;
import bridgelabz.junit.serviceImpl.Calculator;
import bridgelabz.junit.serviceImpl.User;

public class Exception {

	Calculator cal;
	User user;

	@BeforeEach
	public void init()
	{
		cal=new Calculator();
		user=new User();
		System.out.println(" executed every time before every method ");
	}

	@Test
	public void exceptiontesting()
	{
		assertThrows(ArithmeticException.class,()-> cal.divide(10, 0));
	}
	
	@Test
	public void  validateAgeInvalidException() {
		
		assertThrows(AgeInvalidException.class, ()-> user.invlidAgeException(12) );
	}


}
