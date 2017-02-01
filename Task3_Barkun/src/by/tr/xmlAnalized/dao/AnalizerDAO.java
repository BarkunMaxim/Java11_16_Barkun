package by.tr.xmlAnalized.dao;

import by.tr.xmlAnalized.dao.exception.DAOException;

public interface AnalizerDAO {

	String readFile(String filename) throws DAOException;
}
