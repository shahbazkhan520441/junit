package bridgelabz.junit.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import bridgelabz.junit.serviceImpl.PalindromeandIsPrime;

public class ParameterisedTesting {

	PalindromeandIsPrime pal;

	@BeforeEach
	public void init()
	{
		pal=new PalindromeandIsPrime();
		System.out.println(" executed every time before every method ");
	}

	@ParameterizedTest
	@ValueSource(strings = {"madam","aha","viiv"})
	public void valuesource(String args)
	{
		assertEquals(true,pal.check_Palindrome(args));
	}

	@ParameterizedTest
	@CsvSource({
		"true,2",
		"false,6",
		"true,7"
	})
	public void csvsource(boolean expected,int input)
	{
		assertEquals(expected,pal.isPrime(input));
	}

	enum Data
	{
		MADAM,AHA,VIIV
	}
	@ParameterizedTest
	@EnumSource(Data.class)
	public void enumsource(Data args)
	{
		assertEquals(true,pal.check_Palindrome(args.name()));
	}

	public static String[] data()
	{
		return new String[]{"madam","aha","viiv"};
	}
	@ParameterizedTest
	@MethodSource("data")
	public void enumsource(String args)
	{
		assertEquals(true,pal.check_Palindrome(args));
	}





}
