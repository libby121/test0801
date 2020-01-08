package ExceptionTelevision;

public class InvalidVolumeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//why static why final;
	
	public InvalidVolumeException() {
		super("volume cant be over 10 or lower than 0");
	}
	
	
	

}
