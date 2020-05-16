package com.train.service.impl;

import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.mapper.UserMapper;
import com.train.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insertUser(String username, String password) {
		userMapper.insertUser(username, password);
	}
	
	

}
