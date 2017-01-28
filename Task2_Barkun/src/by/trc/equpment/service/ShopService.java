package by.trc.equpment.service;

import by.trc.equpment.bean.Good;
import by.trc.equpment.service.exception.ServiceException;

public interface ShopService {
	void addNewGood(Good good) throws ServiceException;
	void addEditedGood(Good good) throws ServiceException;

}
