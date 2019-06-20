package com.ibdata.tdd.user.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class UserLoginServiceTest {
	
	private UserLoginService service;
	
	@Before
	public void setUp() {
		this.service = new UserLoginService();
	}
	
	@Test
	public void shouldLogin() throws Exception {
		
		String id = "junseok";
		String password = "2486";
		
		// 통합
		boolean loginSuccess = service.login(id, password);
		
		assertThat("로그인이 성공한다.", true, is(loginSuccess));
	}
	
	// ID와 PASSWORD가 NUll 이면 Exception을 발생시켜야 한다.
	@Test(expected = Exception.class)
	public void shouldIdAndPasswordIsNullToException() throws Exception {
		
		String id = null;
		String password = "2486";
		
		service.validation(id, password);
	}
	
	// ID와 PASSWORD가 NUll 이면 Exception을 발생시켜야 한다.
	@Test(expected = Exception.class)
	public void shouldIdLengTest() throws Exception {
		
		String id = null;
		
		service.idLengthValidate(id);
	}

}
