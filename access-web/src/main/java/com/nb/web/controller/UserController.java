package com.nb.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/data")
	public String indexData(@RequestParam String name) {
		int i = 1/0;
		System.out.println(i);
		return "index user";
	}
	
	/*@ExceptionHandler(RuntimeException.class)
    public String exceptionHandler() {
        return "错误----";
    }*/
}
