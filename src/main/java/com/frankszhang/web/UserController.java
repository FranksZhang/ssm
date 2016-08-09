package com.frankszhang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frankszhang.common.po.User;
import com.frankszhang.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		
		return "";
	}
}
