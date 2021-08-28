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
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//��������
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	@Test
	public void textDao(){
		//��������
		ApplicationContext dao = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		UserDao userDao = (UserDao) dao.getBean("userDao"); //�ӿ�����ָ��ʵ�������
		userDao.save();
	}
	@Test
	public void textService(){
		//��������
		ApplicationContext service = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		UserService userService = (UserService) service.getBean("userService"); //�ӿ�����ָ��ʵ�������
		userService.save();
	}
}
