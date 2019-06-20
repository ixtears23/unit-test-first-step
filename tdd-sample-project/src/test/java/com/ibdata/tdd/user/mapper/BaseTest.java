package com.ibdata.tdd.user.mapper;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BaseTest {

	private UserMapper userMapper = Mockito.mock(UserMapper.class);
	
	
	@Before
	public void setUp() {
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
