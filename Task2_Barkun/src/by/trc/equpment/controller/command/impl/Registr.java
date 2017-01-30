package by.trc.equpment.controller.command.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.trc.equpment.bean.User;
import by.trc.equpment.controller.command.Command;
import by.trc.equpment.service.ClientService;
import by.trc.equpment.service.exception.ServiceException;
import by.trc.equpment.service.factory.ServiceFactory;

             // жалко было постратить пару символов и назвать команду вменяемо? или у тебя за символы IDE деньги просит?
public class Registr implements Command{
	User user = new User();// что еще за поле экземпляра класса?
	// + с потерянным атрибутом доступа
	// мы же обсуждали их вредность в этом коде
	@Override
	public String execute(String request) {
		String[] mas = new String[3];
		
		String responce;
		Pattern p = Pattern.compile("(\\S)+");// аналогично контроллеру
	    Matcher m = p.matcher(request);// попробуй форматировать код. читать ведь не удобно
	    m.find();
	    int i=0;
	    do{
	    	
	    	mas[i] = request.substring(m.start(),m.end());
	    	i++;
	    }while(m.find());
	    
	    user.setLogin(mas[1]); 
	    user.setPassword(mas[2]);

	    ServiceFactory serviceFactory = ServiceFactory.getInstance();
		ClientService clientService = serviceFactory.getClientService();
		try{
			clientService.registration(user);
			responce = "Welcome";
		}catch(ServiceException e){
			responce = "Error duiring login procedure";
		}
		return responce;
	}
}
