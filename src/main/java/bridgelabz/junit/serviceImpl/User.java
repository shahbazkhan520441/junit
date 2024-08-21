package bridgelabz.junit.serviceImpl;


public class User {
	
	public void invlidAgeException(int age) {
		if(age<18) {
			throw new AgeInvalidException("you are not elligble to apply for driving licence");
		}
		else {
			System.out.println("you are eligible to apply for driving licence");
		}
	}


}
