package bridgelabz.junit.serviceImpl;

public class AgeInvalidException extends RuntimeException {

	private String message;

	public AgeInvalidException(String message) {
		super();
		this.message = message;
	}
	
	
}
