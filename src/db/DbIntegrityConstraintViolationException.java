package db;

public class DbIntegrityConstraintViolationException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DbIntegrityConstraintViolationException(String msg) {
		super(msg);
	}

}
