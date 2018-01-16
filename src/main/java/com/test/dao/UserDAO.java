package com.test.dao;

import org.apache.ibatis.annotations.Mapper;

import com.test.vo.User;

@Mapper
public interface UserDAO {

	void insertUser(User user);
	
}
