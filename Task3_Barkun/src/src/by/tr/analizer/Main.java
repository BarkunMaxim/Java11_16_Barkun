package by.tr.analizer;

import java.io.File;

import by.tr.analizer.bean.Document;
import by.tr.analizer.service.DocumentAnalizerService;
import by.tr.analizer.service.exception.ServiceException;
import by.tr.analizer.service.impl.DocumentAnalizerServiceImpl;

public class Main {

	private static final String FILE_PATH = "resorces/notes.xml";

	public static void main(String[] args) {

		DocumentAnalizerService documentAnalizer = new DocumentAnalizerServiceImpl();
		
		File file;
		Document document;
		
		try {
			
			file = documentAnalizer.openFile(FILE_PATH);
			document = documentAnalizer.analizeFile(file);
			documentAnalizer.printDocument(document);
			
		} catch (ServiceException e) {
			
			System.out.println("Something going wrong, please contact system administrator for more informattion");
			
		}

	}

}
