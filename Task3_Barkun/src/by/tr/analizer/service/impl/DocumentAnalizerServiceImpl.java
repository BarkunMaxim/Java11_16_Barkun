package by.tr.analizer.service.impl;

import java.io.File;

import by.tr.analizer.bean.Document;
import by.tr.analizer.bean.Element;
import by.tr.analizer.dao.DocumentAnalizerDAO;
import by.tr.analizer.dao.exception.DaoException;
import by.tr.analizer.dao.factory.DAOFactory;
import by.tr.analizer.service.DocumentAnalizerService;
import by.tr.analizer.service.exception.ServiceException;

public class DocumentAnalizerServiceImpl implements DocumentAnalizerService {

	@Override
	public File openFile(String filepath) throws ServiceException {
		File file = null;

		if (filepath != null & !filepath.isEmpty()) {
			file = new File(filepath);
		} else {
			throw new ServiceException("Wrong file path");
		}
		return file;
	}

	@Override
	public Document analizeFile(File file) throws ServiceException {

		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		Document document = null;
		try {
			DocumentAnalizerDAO documentAnalizerDAO = daoObjectFactory.getAnalizerDAO();
			document = new Document(documentAnalizerDAO.analizeFile(file));
		} catch (DaoException e) {
			throw new ServiceException("Could not read the file content", e);
		}

		return document;
	}

	@Override
	public void printDocument(Document document) {
		for (Element element : document.getElements()) {
			System.out.println(element);
		}
	}
}
