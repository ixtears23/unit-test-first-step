package com.ibdata.tdd.user.service.impl;

import org.springframework.stereotype.Service;

import com.ibdata.tdd.user.service.MoneyService;

@Service
public class MoneyServiceImpl implements MoneyService {

	@Override
	public int makeMoney() {
		return 1000;
	}

	
}
