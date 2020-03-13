package by.htp.library.controller;

import by.htp.library.dao.DaoException;

public interface Command {
	
	String execute(String request) throws DaoException;

}
