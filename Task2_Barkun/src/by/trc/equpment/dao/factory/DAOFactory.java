package by.trc.equpment.dao.factory;

import by.trc.equpment.dao.impl.SqlGoodDAO;
import by.trc.equpment.dao.impl.SqlUserDAO;
import by.trc.equpment.dao.GoodDAO;
import by.trc.equpment.dao.UserDAO;


public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	
	private final GoodDAO sqlGoodImpl = new SqlGoodDAO();
	private final UserDAO sqlUserImpl = new SqlUserDAO();
	
	private DAOFactory(){}
	
	public static DAOFactory getInstance(){
		return instance;
	}
	
	public GoodDAO getGoodDAO(){
		return sqlGoodImpl;
	}
	public UserDAO getUserDAO(){
		return sqlUserImpl;
	}

}
