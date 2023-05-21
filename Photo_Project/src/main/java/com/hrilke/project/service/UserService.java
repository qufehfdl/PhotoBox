package com.hrilke.project.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hrilke.project.beans.User;
import com.hrilke.project.dao.UserDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	@Qualifier("loginUser")
	private final User loginUser;
	private final UserDAO userDAO;

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public User getOneUser(User user) {
		User DBUser = userDAO.getOneUser(user);
		if (DBUser != null) {
			loginUser.setUser_name(DBUser.getUser_name());
			loginUser.setUser_id(DBUser.getUser_id());
			loginUser.setUser_login(true);
		}
		return DBUser;
	}

	public void modifyUser(User user) {
		userDAO.modifyUser(user);
	}
}
