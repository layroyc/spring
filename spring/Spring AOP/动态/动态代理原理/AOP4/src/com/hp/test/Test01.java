package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.service.UserService;

public class Test01 {
	@Test
	public void test01(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.regist("王", "123456");
	}

}
