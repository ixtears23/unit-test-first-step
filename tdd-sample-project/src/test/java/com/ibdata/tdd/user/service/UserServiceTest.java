package com.ibdata.tdd.user.service;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ibdata.tdd.user.mapper.UserMapper;
import com.ibdata.tdd.user.service.impl.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@Mock
	private UserMapper userMapper;
	
	@Mock
	private MoneyService moneyService;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	@Before
	public void setUp() {
		when(moneyService.makeMoney()).thenReturn(1000);
	}
	
	@Test
	public void shouldGetMoney() {
		
		int money = userService.getMoney();
		assertThat(money, comparesEqualTo(1000));
	}
	
	@Test
	public void shouldGetUserNameToId() {
		
		String id = "junseok";
		String name = userService.getUserName(id);
		assertThat(name, equalToIgnoringCase("오준석"));
		String id2 = null;
		String name2 = userService.getUserName(id2);
		assertThat(name2, equalToIgnoringCase("오준석"));
	}
	

	@Test
	public void shouldGetAUser() {
		Map<String, Object> map = new HashMap<>();
		map.put("one", "test");
		map.put("two", new ArrayList());
		map.put("three", "test");

		assertThat(map, hasEntry("one", "test"));
		assertThat(map, hasEntry("two", new ArrayList()));
		assertThat(map, hasEntry("three", "test"));

	}
}



