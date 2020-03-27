package by.htp.library.service.impl;

import java.util.Collections;
import java.util.List;

import by.htp.library.bean.Book;
import by.htp.library.bean.User;
import by.htp.library.dao.DaoException;
import by.htp.library.dao.DaoProvider;
import by.htp.library.dao.UserDao;

import by.htp.library.service.ServiceException;
import by.htp.library.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean authorization(String login, String password) throws ServiceException {
		if (login == null || login.isEmpty()) {
			throw new RuntimeException("login is empty");// stub
		}
		// check password
		boolean result;

		DaoProvider provider = DaoProvider.getInstance();
		UserDao userDao = provider.getUserDao();
		try {
			result = userDao.authorization(login, password);

		} catch (DaoException e) {
			throw new ServiceException(e);
		}

		return result;

	}

	@Override
	public void registration(User user) throws ServiceException {

		// to validate login and password
		if (user.getLogin() == null || user.getLogin().isEmpty() || user.getPassword() == null
				|| user.getPassword().isEmpty()) {
			throw new RuntimeException("login is empty");// stub
		}

		boolean result;

		DaoProvider provider = DaoProvider.getInstance();
		UserDao userDao = provider.getUserDao();

		try {
			result = userDao.registration(user);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public void addnewBook(Book book) throws ServiceException {
		// to validate book
		if (book.getAuthor() == null || book.getAuthor().isEmpty() ) {
			throw new RuntimeException("no book");// stub
		}

		boolean result;

		DaoProvider provider = DaoProvider.getInstance();
		UserDao userDao = provider.getUserDao();

		try {
			result = userDao.addNewBook(book);
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public void changeStatusById(int id, String status) throws ServiceException {
		// to validate book
				if (status==null ) {
					throw new RuntimeException("no new status");// stub
				}

				boolean result;

				DaoProvider provider = DaoProvider.getInstance();
				UserDao userDao = provider.getUserDao();

				try {
					result = userDao.changeUserStatus(id, status);
				} catch (DaoException e) {
					throw new ServiceException(e);
				}

			}

	@Override
	public String GetSortedBooks() throws ServiceException {
		DaoProvider provider = DaoProvider.getInstance();
		UserDao userDao = provider.getUserDao();
		
		List<Book> books;
		try {
			books = userDao.getSortedBooks();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		Collections.sort(books);
		String s = "";
		for(Book b:books) {
			
			s=s + b.toString() +  "\n";
		}
		
		
		
		
		return s;
	}

}
