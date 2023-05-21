package com.hrilke.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hrilke.project.mapper")
public class PhotoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoProjectApplication.class, args);
	}


}
