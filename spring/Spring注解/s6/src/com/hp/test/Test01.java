package com.hp.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.dao.UserDao;
import com.hp.entity.User;
import com.hp.service.UserService;

public class Test01 {
	@Test
	public void test01(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		User user = (User) ac.getBean("uu");
		System.out.println(user);
	}
	
	@Test
	public void test02(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		int i = ud.add("Դ", "123456");
		if(i>0){
			System.out.println("��ӳɹ�");
		}else{
			System.out.println("���ʧ��");
		}
	}
	@Test
	public void test03(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		int i = ud.delete(2);
		if(i>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
	}
	@Test
	public void test04(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		User user = new User(1,"��","123");
		int i = ud.update(user);
		if(i>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	@Test
	public void test05(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		User user = ud.selectById(1);
		System.out.println(user);
	}
	
	@Test
	public void test06(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		ArrayList<User> list = ud.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
