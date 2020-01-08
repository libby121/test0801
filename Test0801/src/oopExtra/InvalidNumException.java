package oopExtra;

public class InvalidNumException extends Exception {

	//public int invalid;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNumException(int invalid, String msg) {
		super("number "+invalid+" must be aboce 0");
		//this.invalid = invalid;

	}

	


}