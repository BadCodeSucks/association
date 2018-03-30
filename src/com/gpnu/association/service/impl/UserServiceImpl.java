package com.gpnu.association.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpnu.association.mapper.UserMapper;
import com.gpnu.association.pojo.User;
import com.gpnu.association.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> list() {
		return userMapper.list();
	}

}
