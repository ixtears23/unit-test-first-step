package com.ibdata.tdd.user.service;

public class UserLoginService {

	public boolean login(String id, String password) throws Exception {
		
		return true;
	}

	public void validation(String id, String password) throws Exception {
		
		if (id == null) {
			throw new Exception("ID가 Null 입니다.");
		}
		
		if (password == null) {
			throw new Exception("PASSWORD가 Null 입니다.");
		}
		
	}

	public void idLengthValidate(String id) {
		
		if (id.length() > 4 || id.length() < 10) {
			
		}
		
	}

}

