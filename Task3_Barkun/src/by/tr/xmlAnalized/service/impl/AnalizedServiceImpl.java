package by.tr.xmlAnalized.service.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import by.tr.xmlAnalized.dao.AnalizedDAO;
import by.tr.xmlAnalized.dao.exception.DAOException;
import by.tr.xmlAnalized.dao.factory.DAOFactory;
import by.tr.xmlAnalized.service.AnalizedService;

public class AnalizedServiceImpl implements AnalizedService {
	
	private Pattern p = Pattern.compile("<[^>]+>");
	Matcher m;
    
	@Override
	public void analizedXml(String fileName) {
		if(fileName == null || fileName.isEmpty()){
			System.out.println("Не указан файл");
		}
		
		String tag = null;
		try{
			List<String> list = new ArrayList<String>();
			DAOFactory daoObjectFactory = DAOFactory.getInstance();
			AnalizedDAO analizedDAO = daoObjectFactory.getAnalizedDAO();
			tag = analizedDAO.readFile(fileName);
			m = p.matcher(tag);
		    System.out.println(tag);
		    while(m.find()){
		    		list.add(tag.substring(m.start(),m.end())); 	
		    }
		    for(int i=1; i<list.size();i++){
		    	String startSymbols = list.get(i);
		    	if(!startSymbols.substring(0, 2).equals("</")){
		    		 System.out.println(list.get(i)+" -открывающий тег");
		    	}
		    	if(startSymbols.substring(0,2).equals("</")){
		    		System.out.println(list.get(i)+" - закрывающий тег");
		    	}
		    	
	        }
		}catch(DAOException e){
			System.out.println(e + "\n Проверьте путь и имя файла!");
		}
	
	}
}
