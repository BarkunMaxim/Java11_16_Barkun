package by.tr.xmlAnalized;




import by.tr.xmlAnalized.service.AnalizedService;
import by.tr.xmlAnalized.service.impl.AnalizedServiceImpl;

public class xmlAnalized {

	public static void main(String[] args) {
		AnalizedService analizedService = new AnalizedServiceImpl();
		analizedService.analizedXml(".//resource//note.xml");
		
	}		
}

