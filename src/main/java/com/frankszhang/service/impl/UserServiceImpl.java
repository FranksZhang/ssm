package com.frankszhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;
import com.frankszhang.service.UserService;
import com.frankszhang.service.base.impl.BaseServiceImpl;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	
}
