package by.tr.analizer.dao;

import java.io.File;
import java.util.List;

import by.tr.analizer.bean.Element;
import by.tr.analizer.dao.exception.DaoException;

public interface DocumentAnalizerDAO {
	
	List<Element> analizeFile(File file) throws DaoException;

}
