package by.trc.equpment.controller;

import java.util.HashMap;
import java.util.Map;

import by.trc.equpment.controller.command.Command;
import by.trc.equpment.controller.command.CommandName;
import by.trc.equpment.controller.command.impl.Rent;
import by.trc.equpment.controller.command.impl.Registr;
import by.trc.equpment.controller.command.impl.SingIn;
import by.trc.equpment.controller.command.impl.WrongRequest;

final class CommandProvider {
	
	private final Map<CommandName, Command> repository = new HashMap<>();
	
	CommandProvider(){
		repository.put(CommandName.SIGN_IN, new SingIn());
		repository.put(CommandName.REGISTRATION, new Registr());
		repository.put(CommandName.RENT, new Rent());
		repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
		
		
	}
	
	Command getCommand(String name){
		CommandName commandName = null;
		Command command = null;
		
		try{
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		}catch(IllegalArgumentException | NullPointerException e){
			command = repository.get(CommandName.WRONG_REQUEST);
		}
		
		return command;
	}
}
