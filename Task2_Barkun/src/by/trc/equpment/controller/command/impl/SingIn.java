package by.trc.equpment.controller.command.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.trc.equpment.controller.command.Command;
import by.trc.equpment.service.ClientService;
import by.trc.equpment.service.exception.ServiceException;
import by.trc.equpment.service.factory.ServiceFactory;

public class SingIn implements Command {
	
	@Override
	public String execute(String requsets){
		String[] mas = new String[3];
		String login = null;
		String password = null;
		
		String responce;
		Pattern p = Pattern.compile("(\\S)+");
	    Matcher m = p.matcher(requsets);
	    m.find();
	    int i=0;
	    do{
	    	
	    	mas[i] = requsets.substring(m.start(),m.end());
	    	i++;
	    }while(m.find());
	    
	    login = mas[1];
	    password=mas[2];
	    
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ClientService clientService = serviceFactory.getClientService();
		try{
			clientService.singIn(login, password);
			responce = "Welcome";
		}catch(ServiceException e){
			responce = "Error duiring login procedure";
		}
		return responce;
	}

}
