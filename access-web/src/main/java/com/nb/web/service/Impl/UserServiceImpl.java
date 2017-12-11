package com.nb.web.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nb.web.dao.UserDao;
import com.nb.web.entity.User;
import com.nb.web.service.UserService;

@Service
public class UserServiceImpl{
	@Autowired
	private UserDao userDao;
	
	public User getUserById(String userId) {
		return userDao.getUserById(userId);
	}

}
