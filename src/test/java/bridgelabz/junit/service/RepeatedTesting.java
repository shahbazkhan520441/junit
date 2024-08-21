package bridgelabz.junit.service;



import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTesting {

	// @Test no need, if kept excecutes 1 more time
	@RepeatedTest(10)
	public void test1()
	{
		System.out.println(" test1 ");
	}
	
	


}

