package by.trc.equpment.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.trc.equpment.controller.command.Command;

public final class Controller {
	private final CommandProvider provider = new CommandProvider();
	
	public String executeTask(String request){
		
		String commandName;
		Command executionCommand;
		
		Pattern p = Pattern.compile("(\\S)+");
	    Matcher m = p.matcher(request);
	    m.find();

	    commandName = request.substring(m.start(), m.end());
		executionCommand = provider.getCommand(commandName);
		
		String response;
		response = executionCommand.execute(request);
		
		return response;
	}

}
