package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.dao.UserDao;
import com.hp.entity.User;
import com.hp.service.UserService;


public class TextFactory {
	@Test
	public void textFc(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//创建对象
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	@Test
	public void textDao(){
		//创建工厂
		ApplicationContext dao = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		UserDao userDao = (UserDao) dao.getBean("userDao"); //接口引用指向实现类对象
		userDao.save();
	}
	@Test
	public void textService(){
		//创建工厂
		ApplicationContext service = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		UserService userService = (UserService) service.getBean("userService"); //接口引用指向实现类对象
		userService.save();
	}
}
