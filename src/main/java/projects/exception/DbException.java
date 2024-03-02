package projects.exception;


public class DbException extends RuntimeException {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 8605615297869325996L;

	public DbException() {
	
	}
	
	public DbException(String message) {
		super(message);
	}

	public DbException(Throwable cause) {
		super(cause);
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
	}



}
