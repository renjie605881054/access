package com.nb.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class IndexController {
	
	@RequestMapping(value="/")
	public String indexData() {
		return "index";
	}
}
