package com.rpc.java.demo.service.impl;

import com.rpc.java.demo.service.IDemoService;
import com.rpc.java.mvcframework.annotation.RService;

/**
 * 核心业务逻辑
 */
@RService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name + ",from service.";
	}

}
