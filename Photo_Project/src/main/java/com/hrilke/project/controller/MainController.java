package com.hrilke.project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrilke.project.beans.User;
import com.hrilke.project.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/root")
@RequiredArgsConstructor
public class MainController {
	private final UserService userService;

	@PostMapping("/join")
	public boolean join(@RequestBody User user) {
		userService.addUser(user);
		return true;
	}

	@PostMapping("/login")
	public User login(@RequestBody User user) {
		User DBUser = userService.getOneUser(user);
		DBUser.setUser_login(true);
		return DBUser;
	}
 
	@PostMapping("/mypage")
	public User myPage(@RequestBody User user) {
		userService.modifyUser(user);
		return user;
	}

}
