package com.frankszhang.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frankszhang.common.po.User;
import com.frankszhang.dao.UserMapper;
import com.frankszhang.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	@Resource
	private UserMapper userMapper;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		int result = userService.insert(user);
		System.out.println("result=" + result);
		return "success";
	}
	
	@RequestMapping("/testLogger")
	public String testLogger() {
		if(logger.isDebugEnabled()) {
			logger.debug("I think it's ok!");
		}
		return "success";
	}
	
}
