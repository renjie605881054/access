package com.nb.web.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import com.nb.web.common.BaseDao;
import com.nb.web.entity.User;

@Service
public interface UserDao extends BaseDao<User>{
	
	@Select("select * from user where userId = #{userId}")
    public User getUserById(String userId);
}
