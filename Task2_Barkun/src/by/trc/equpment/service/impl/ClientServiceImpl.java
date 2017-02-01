package by.trc.equpment.service.impl;

import by.trc.equpment.bean.User;
import by.trc.equpment.dao.UserDAO;
import by.trc.equpment.dao.factory.DAOFactory;
import by.trc.equpment.service.ClientService;
import by.trc.equpment.dao.exception.DAOException;
import by.trc.equpment.service.exception.ServiceException;

public class ClientServiceImpl implements ClientService {
	
	@Override
	public void singIn(String login, String password) throws ServiceException{
		if(login == null || login.isEmpty()){
			throw new ServiceException("Incorrect login");
		}// это и есть вся проверка логина
		// а пароль на валидность и проверять не надо?
		try{
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoObjectFactory.getUserDAO();
			userDAO.singIn(login, password);
		}catch(DAOException e){
			throw new ServiceException(e);
		}
	}
	
	@Override
	public void singOut(String login){
		
	}
	
	@Override
	public void registration(User user) throws ServiceException{
		if(user.getLogin() == null || user.getLogin().isEmpty()){
			throw new ServiceException("Incorrect login");
		}// то же, что и в первом методе
		try{
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoObjectFactory.getUserDAO();
			userDAO.registration(user);
		}catch(DAOException e){
			throw new ServiceException(e);
		}
	}

}
