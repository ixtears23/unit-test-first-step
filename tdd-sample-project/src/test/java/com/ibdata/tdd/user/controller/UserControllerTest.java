package com.ibdata.tdd.user.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ibdata.tdd.user.service.UserService;
import com.ibdata.tdd.user.vo.User;

public class UserControllerTest {
	
//	@InjectMocks
//	private MockMvc mockMvc;
	
	@Mock
	private UserService userService;
	
//	@InjectMocks
//	@Spy
	@Mock
	private UserController userController;
	
	@Mock
	List<String> mockedList;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
//		mockMvc = MockMvcBuilders.standaloneSetup(new UserController(userService)).build();
	}
	
	
//	@Test
//	public void injectionTest() throws Exception {
//		mockMvc.perform(get("/user/selectUser")
//						.param("id", "003"))
//			.andDo(print())
//		.andExpect(status().isOk());
//	}
	
	@Test
	public void userServiceTest() {
		
		User user = new User();
		User user2 = new User();
		
		when(userController.selectUser(user2)).thenReturn(user2);
		doReturn(user2).when(userController).selectUser(user2);
		
	}
	
	@Test
	public void whenNotUseMockAnnotation_thenCorrect() {
		
		mockedList.add("one");
		Mockito.verify(mockedList).add("one");
		assertThat(0, is(mockedList.size()));
		
		Mockito.when(mockedList.size()).thenReturn(100);
		assertThat(100, is(mockedList.size()));
	}
	

}
