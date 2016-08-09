package com.frankszhang.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frankszhang.common.po.User;
import com.frankszhang.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/addUser")
	public String addUser(User user) {
		int result = userService.insert(user);
		System.out.println("result=" + result);
		return "success";
	}
}
