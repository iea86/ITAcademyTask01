package by.htp.library.controller;

import by.htp.library.bean.User;
import by.htp.library.dao.DaoException;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class Controller {
	
	private final CommandProvider provider = new CommandProvider();
	
	public String action(String request) throws DaoException {//registration login=aaa password=bbb name=Ivan
		String[] params;
		Command command;
				
		params = request.split(" ", 2);		
		
		command = provider.getCommand(params[0]);//RegistrationCommand
		
		String response = command.execute(params[1]);//command.execute(login=aaa password=bbb name=Ivan)
		
		return response;
	}

}
