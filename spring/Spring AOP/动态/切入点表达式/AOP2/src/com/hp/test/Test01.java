package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.dynamicproxy.OrderService;
import com.hp.dynamicproxy.UserService;

public class Test01 {
	@Test
	public void test01(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		UserService us = (UserService) ac.getBean("userService");
		System.out.println(us.getClass());
		us.regist();
		us.regist("小王");
		us.regist("小源", "123456");
	}
	
	@Test
	public void test02(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		OrderService od = (OrderService) ac.getBean("orderService");
//		System.out.println(od.getClass());
		od.regist();
		od.regist("王");
		od.regist("源", "123456");
	}

}
