package com.hrilke.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.SessionScope;

import com.hrilke.project.beans.User;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@MapperScan("com.hrilke.project.mapper")

public class PhotoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoProjectApplication.class, args);
	}

	@Bean
	@Qualifier("loginUser")
	@SessionScope
	public User loginUser(HttpSession session) {
		session.setMaxInactiveInterval(5);
		return new User();
	}

}
