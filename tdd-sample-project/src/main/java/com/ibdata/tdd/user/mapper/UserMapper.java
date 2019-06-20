package com.ibdata.tdd.user.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ibdata.tdd.user.vo.User;

@Component("com.ibdata.tdd.user.mapper.UserMapper")
public interface UserMapper {
	
	public List<User> selectUserAll();
	public User selectUserOne(String userId);
	public void insertUser(User user);
	public void updateUser(User user);
	
}
