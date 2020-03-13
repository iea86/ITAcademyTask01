package by.htp.library.start;

import by.htp.library.controller.Controller;
import by.htp.library.dao.DaoException;

public class Main {

	public static void main(String[] args) throws DaoException {
		Controller controller = new Controller();
		
		String request, response;		
		
		//request = "registration login=olga password=bbb name=Ivan";
		//request = "authorization login=qqq password=www name=Ivan";
		request = "authorization login=qqq password=www name=Ivan";

		response = controller.action(request);
		
	    System.out.println(response);	
		
	}

}
