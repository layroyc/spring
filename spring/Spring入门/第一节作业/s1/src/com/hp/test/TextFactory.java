package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.user.User;

public class TextFactory {
	@Test
	public void textFc(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		//��������
		User user = (User) ac.getBean("user");
		System.out.println(user);
	}
	//ԭ��
	@Test
	public void FS() throws Exception {
		//��ȡ�����
		Class userzz = Class.forName("com.hp.user.User");
		//���������
		Object object = userzz.newInstance();
		//ǿת
		User user = (User) object;
		System.out.println(user+"------");

	}
}
