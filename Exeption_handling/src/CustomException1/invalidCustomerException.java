package CustomException1;

public class invalidCustomerException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(String s) {
		// TODO Auto-generated constructor stub
		return " invalid  user try again";
		// to make description available to default exception handler
	}
}
