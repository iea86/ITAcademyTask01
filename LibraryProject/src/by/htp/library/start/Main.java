package by.htp.library.start;

import by.htp.library.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();

		String request, response = null;

		//request = "registration login=olga password=olga status=subscriber";
		//request = "authorization login=qqq password=www";
		//request = "add_new_book author=Author5 title=Book5 materialType=audio countOfPages=0";
		//request = "change_status_by_id id=3 status=admin";
		request = "sort_and_print list of books";
		
		
		

		response = controller.action(request);

		System.out.println(response);

	}

}
