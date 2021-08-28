package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.user.User;

public class TextFactory {
	@Test
	public void textFc(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//创建对象
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	//原理
	@Test
	public void FS() throws Exception {
		//获取类对象
		Class userzz = Class.forName("com.hp.user.User");
		//创建类对象
		Object object = userzz.newInstance();
		//强转
		User user = (User) object;
		System.out.println(user+"------");

	}
}
