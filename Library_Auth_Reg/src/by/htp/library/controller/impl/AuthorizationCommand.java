package by.htp.library.controller.impl;

import by.htp.library.bean.User;
import by.htp.library.controller.Command;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class AuthorizationCommand implements Command {

	@Override
	public String execute(String request) {// request=login=aaa password=bbb name=Ivan
		String[] params;
		String response = "";

		UserService service = ServiceProvider.getInstance().getUserService();
		params = request.split(" ", 3);

		String login = params[0].substring(params[0].indexOf('=') + 1);		
		String password = params[1].substring(params[1].indexOf('=') + 1);

		User user = new User(-1,login, password);

		try {
			service.authorization(login, password);
			response = "Welcome";
		} catch (ServiceException e) { // log
			response = "Error during login procedure";
		}
		return response;
	}
}