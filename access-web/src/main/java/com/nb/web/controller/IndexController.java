package com.nb.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index/")
public class IndexController {
	
	@RequestMapping(value="{name}")
	public String indexData(@PathVariable String name, HttpServletRequest request){
		return "index";
	}
	
	
}
