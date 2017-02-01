package by.tr.xmlAnalized.dao.factory;

import by.tr.xmlAnalized.dao.AnalizerDAO;
import by.tr.xmlAnalized.dao.impl.XmlAnalizerDAO;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final AnalizerDAO xmlAnalizedDAO = new XmlAnalizerDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}
	public AnalizerDAO getAnalizedDAO(){
		return xmlAnalizedDAO;
	}
	

}
