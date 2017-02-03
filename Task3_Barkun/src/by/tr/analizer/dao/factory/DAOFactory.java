package by.tr.analizer.dao.factory;

import by.tr.analizer.dao.impl.DocumentAnalizerDAOImpl;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final DocumentAnalizerDAOImpl xmlAnalizerDAO = new DocumentAnalizerDAOImpl();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
	public DocumentAnalizerDAOImpl getAnalizerDAO(){
		return xmlAnalizerDAO;
	}

}
