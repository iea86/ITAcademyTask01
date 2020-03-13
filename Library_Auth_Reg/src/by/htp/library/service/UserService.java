package by.htp.library.service;

import by.htp.library.bean.User;
import by.htp.library.dao.DaoException;

public interface UserService {
	
	boolean authorization(String login, String password)  throws ServiceException;
	void registration(User user)  throws ServiceException, DaoException;

}
