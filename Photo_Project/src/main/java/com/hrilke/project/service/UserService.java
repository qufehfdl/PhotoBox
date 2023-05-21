package com.hrilke.project.service;

import org.springframework.stereotype.Service;

import com.hrilke.project.beans.User;
import com.hrilke.project.dao.UserDAO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserDAO userDAO;

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public User getOneUser(User user) {
		User DBUser = userDAO.getOneUser(user);
		return DBUser;
	}

	public void modifyUser(User user) {
		userDAO.modifyUser(user);
	}
}
