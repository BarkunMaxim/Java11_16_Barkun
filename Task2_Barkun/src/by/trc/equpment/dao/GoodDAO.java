package by.trc.equpment.dao;

import by.trc.equpment.bean.Good;
import by.trc.equpment.dao.exception.DAOException;

public interface GoodDAO {
	void addGood(Good good) throws DAOException;
	void deleteGood(long id) throws DAOException;

}
