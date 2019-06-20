package com.ibdata.tdd.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibdata.tdd.user.mapper.UserMapper;
import com.ibdata.tdd.user.service.MoneyService;
import com.ibdata.tdd.user.service.UserService;
import com.ibdata.tdd.user.vo.User;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MoneyService moneyService;
	
//	@Autowired
//	public UserServiceImpl(UserMapper userMapper, MoneyService moneyService) {
//		this.userMapper = userMapper;
//		this.moneyService = moneyService;
//	}

	@Override
	public List<User> selectUsers(User user) {
		return userMapper.selectUserAll();
	}

	@Override
	public User selectUser(User user) {
		return userMapper.selectUserOne(user.getId());
	}

	@Override
	public User saveUser(User user) {
		
		userMapper.insertUser(user);
		userMapper.updateUser(user);
		
		return user;
	}

	public int getMoney() {
		return moneyService.makeMoney();
	}

	public String getUserName(String id) {
		return "오준석";
	}


}
