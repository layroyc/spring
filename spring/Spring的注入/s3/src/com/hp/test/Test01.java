package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.entity.Order;
import com.hp.service.UserService;

public class Test01 {
	@Test
	public void Test1(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		Order order = (Order) ac.getBean("order");
		System.out.println(order);
	}
	
	@Test
	public void Test2(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		UserService us = (UserService) ac.getBean("userService");
		us.save();
	}

}
