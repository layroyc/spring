package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.entity.Order;
import com.hp.service.UserService;

public class Test01 {
	@Test
	public void Test1(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		Order order = (Order) ac.getBean("order");
		System.out.println(order);
	}
	
	@Test
	public void Test2(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		UserService us = (UserService) ac.getBean("userService");
		us.save();
	}

}
