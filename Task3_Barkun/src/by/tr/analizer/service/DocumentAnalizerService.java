package by.tr.analizer.service;

import java.io.File;

import by.tr.analizer.bean.Document;
import by.tr.analizer.service.exception.ServiceException;

public interface DocumentAnalizerService {
	
	File openFile(String filepath) throws ServiceException;
	Document analizeFile(File file) throws ServiceException;
	void printDocument(Document doc);

}
