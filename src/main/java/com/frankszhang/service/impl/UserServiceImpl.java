package com.frankszhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;
import com.frankszhang.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int insert(User record) {
		return userMapper.insert(record);
	}
}
