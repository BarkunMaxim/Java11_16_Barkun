package by.tr.xmlAnalized;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tr.xmlAnalized.service.AnalizedService;
import by.tr.xmlAnalized.service.impl.AnalizedServiceImpl;

public class xmlAnalized {

	public static void main(String[] args) {
		AnalizedService analizedService = new AnalizedServiceImpl();
		String prov = analizedService.getNode(".//resource//notes.xml");
		/*Pattern p = Pattern.compile("<to>[^>]+</to>");
	    Matcher m = p.matcher(prov);
	    while(m.find()){
	    	System.out.println(prov.substring(m.start(),m.end()));
	    }*/
	}		
}

