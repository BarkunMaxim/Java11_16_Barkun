package by.tr.xmlAnalized.dao.factory;

import by.tr.xmlAnalized.dao.AnalizedDAO;
import by.tr.xmlAnalized.dao.impl.XmlAnalizedDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final AnalizedDAO xmlAnalizedDAO = new XmlAnalizedDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}
	public AnalizedDAO getAnalizedDAO(){
		return xmlAnalizedDAO;
	}
	

}
