package by.tr.xmlAnalized.dao;

import by.tr.xmlAnalized.dao.exception.DAOException;

public interface AnalizedDAO {

	String getNode(String filename) throws DAOException;
}
