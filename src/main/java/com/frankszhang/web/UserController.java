package com.frankszhang.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.frankszhang.common.po.User;
import com.frankszhang.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userServiceImpl;
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser(User user) {
		
		return "success";
	}
}
