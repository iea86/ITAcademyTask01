package by.htp.library.service;

import by.htp.library.bean.Book;
import by.htp.library.bean.User;

public interface UserService {

	boolean authorization(String login, String password) throws ServiceException;

	void registration(User user) throws ServiceException;
	
	void addnewBook(Book book) throws ServiceException;
	
	void changeStatusById(int id, String status) throws ServiceException;
	
	String GetSortedBooks() throws ServiceException;
	

}
