package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.dynamicproxy.OrderService;
import com.hp.dynamicproxy.UserService;

public class Test01 {
	@Test
	public void test01(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		UserService us = (UserService) ac.getBean("userService");
		System.out.println(us.getClass());
		us.regist();
		us.regist("С��");
		us.regist("СԴ", "123456");
	}
	
	@Test
	public void test02(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		OrderService od = (OrderService) ac.getBean("orderService");
//		System.out.println(od.getClass());
		od.regist();
		od.regist("��");
		od.regist("Դ", "123456");
	}

}
