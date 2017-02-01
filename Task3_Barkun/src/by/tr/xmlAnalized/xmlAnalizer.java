package by.tr.xmlAnalized;




import by.tr.xmlAnalized.service.AnalizerService;
import by.tr.xmlAnalized.service.impl.AnalizerServiceImpl;

public class xmlAnalizer {

	public static void main(String[] args) {
		AnalizerService analizedService = new AnalizerServiceImpl();
		analizedService.analizedXml(".//resource//notes.xml");
		
	}		
}

