package by.trc.equpment.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.trc.equpment.controller.command.Command;

public final class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	public String executeTask(String request){
		
		String commandName;
		Command executionCommand;
		
		Pattern p = Pattern.compile("(\\S)+");// зачем при каждом вызове метода создавать ничем друг от друга не отличающиеся объекты?
		
		// и зачем на такую простую операцию брать такие тяжелые объекты как Patter и Matcher
		// методов класса String не хватило?
	    Matcher m = p.matcher(request);
	    m.find();

	    commandName = request.substring(m.start(), m.end());
		executionCommand = provider.getCommand(commandName);
		
		String response;
		response = executionCommand.execute(request);
		
		return response;
	}

}
