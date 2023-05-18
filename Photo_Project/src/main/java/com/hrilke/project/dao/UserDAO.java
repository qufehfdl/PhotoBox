package com.hrilke.project.dao;

import org.springframework.stereotype.Repository;

import com.hrilke.project.beans.User;
import com.hrilke.project.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDAO {
	private final UserMapper userMapper;

	public void addUser(User user) {
		userMapper.addUser(user);
	}

	public User getOneUser(User user) {
		return userMapper.getOneUser(user);
	}

}
