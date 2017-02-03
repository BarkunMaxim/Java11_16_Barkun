package by.tr.analizer.dao.exception;

public class DaoException extends Exception {
	
	private static final long serialVersionUID = 8718976863864277095L;
	
	public DaoException(){
		super();
	}
	public DaoException(String message){
		super(message);
	}
	public DaoException(Exception e){
		super(e);
	}
	public DaoException(String message,Exception e){
		super(message,e);
	}
	

}
