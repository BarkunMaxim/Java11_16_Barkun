package by.trc.equpment.dao;

import by.trc.equpment.bean.User;
import by.trc.equpment.dao.exception.DAOException;

public interface UserDAO {
	void singIn(String login, String password) throws DAOException;
	void registration(User user) throws DAOException;
	
}
