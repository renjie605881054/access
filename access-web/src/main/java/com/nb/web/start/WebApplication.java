package com.nb.web.start;

import org.springframework.boot.SpringApplication;

import com.nb.web.controller.IndexController;

public class WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(IndexController.class, args);
	}
}
