package com.nb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nb.web.dao.UserDao;
import com.nb.web.entity.User;
import com.nb.web.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//@Autowired
	//private UserService UserService;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value="/data")
	public String indexData(String name) {
		//User user = UserService.getUserById("1");
		User user = userDao.getUserById("1");
		return "user:" + user;
	}
	
	/*@ExceptionHandler(RuntimeException.class)
    public String exceptionHandler() {
        return "错误----";
    }*/
}
