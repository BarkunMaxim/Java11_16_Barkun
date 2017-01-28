package by.trc.equpment.service;

import by.trc.equpment.bean.User;
import by.trc.equpment.service.exception.ServiceException;

public interface ClientService {
	void singIn(String login,String password) throws ServiceException;
	void singOut(String login) throws ServiceException;
	void registration(User user) throws ServiceException;

}
