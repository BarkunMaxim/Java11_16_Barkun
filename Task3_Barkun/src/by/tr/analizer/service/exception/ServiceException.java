package by.tr.analizer.service.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -2829653396588378773L;

	public ServiceException() {
		super();
	}
	
	public ServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ServiceException(String arg0) {
		super(arg0);
	}

	public ServiceException(Throwable arg0) {
		super(arg0);
	}

}
