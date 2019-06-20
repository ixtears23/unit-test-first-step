package com.ibdata.tdd.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibdata.tdd.user.service.UserService;
import com.ibdata.tdd.user.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping(value = "/selectUser", method = RequestMethod.GET)
	public User selectUser(User user) {
		
		User selectUser = userService.selectUser(user);
		
		return  selectUser;
	}

}
