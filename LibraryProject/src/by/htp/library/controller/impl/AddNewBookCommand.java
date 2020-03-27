package by.htp.library.controller.impl;

import by.htp.library.bean.Book;
import by.htp.library.controller.Command;
import by.htp.library.service.ServiceException;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class AddNewBookCommand implements Command {// author=Author5 title=Book5 materialType=audio count=1

	@Override
	public String execute(String request) {
		String[] params;
		String response = "";

		UserService service = ServiceProvider.getInstance().getUserService();
		params = request.split(" ", 4);

		String author = params[0].substring(params[0].indexOf('=') + 1);
		
		String title = params[1].substring(params[1].indexOf('=') + 1);
		
		String materialType = params[2].substring(params[2].indexOf('=') + 1);
		
		int countOfPages = Integer.parseInt(params[3].substring(params[3].indexOf('=') + 1));
		

		Book book = new Book(-1, author, title, materialType, countOfPages);

		try {
			service.addnewBook(book);
			response = "book was added";
		} catch (ServiceException e) { // log
			response = "error";
		}
		return response;

	}
}