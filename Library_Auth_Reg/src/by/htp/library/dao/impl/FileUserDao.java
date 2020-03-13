package by.htp.library.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.security.auth.login.LoginException;
import by.htp.library.bean.User;
import by.htp.library.dao.DaoException;
import by.htp.library.dao.UserDao;

public class FileUserDao implements UserDao {

	@Override
	public boolean authorization(String login, String password) throws DaoException {
		List<User> users = getDataFromFile();
		for (User u : users) {
			if (u.getLogin().equals(login) && (u.getPassword().equals(password))) {
				return true;
			}
		}

		// what should happen when login fails
		try {
			throw new LoginException();
		} catch (LoginException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public boolean registration(User newUser) throws DaoException {

		List<User> users = getDataFromFile();
		int maxId=users.get(0).getId();
		for (User us : users) {
			if (us.getId() > maxId) {
				maxId = us.getId();
			}
		}

		try {
			FileWriter writer = new FileWriter("src/resources/users.txt", true);

			String login = newUser.getLogin();
			String password = newUser.getPassword();

			// lineSeparator - Переменная которая будет делать перевод строки
			String lineSeparator = System.getProperty("line.separator");
			String s = lineSeparator + "id=" + (maxId+1) + " " + "login=" + login + " " + "password=" + password;
			writer.write(s);
			writer.flush();
			writer.close();

		} catch (IOException e) {
			throw new DaoException(e);
		}
		return false;
	}

	@Override
	public boolean changeUserStatus(int idUser, String newStatus) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> getDataFromFile() throws DaoException {
		Scanner input = null;
		List<User> users = new ArrayList<User>();

		try {
			input = new Scanner(new File(System.getProperty("user.dir") + "/src/resources/users.txt"));
			// parse file and load into List
			while (input.hasNext()) {

				String id = input.next();
				int idnew = Integer.parseInt(id.substring(id.indexOf('=') + 1));

				String l = input.next();
				String loginnew = l.substring(l.indexOf('=') + 1);

				String p = input.next();
				String passwordnew = p.substring(p.indexOf('=') + 1);

				User user = new User(idnew, loginnew, passwordnew);
				users.add(user);

			}
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		}

		return users;
	}
}
