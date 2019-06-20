package com.ibdata.tdd.user.service;

import java.util.List;

import com.ibdata.tdd.user.vo.User;

public interface UserService {

	public List<User> selectUsers(User user);
	public User selectUser(User user);
	public User saveUser(User user);
}
