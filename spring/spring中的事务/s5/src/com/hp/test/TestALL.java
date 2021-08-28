package com.hp.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.dao.UserDao;
import com.hp.entity.User;

public class TestALL {
	@Test
	public void Test01(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao dao = (UserDao) ac.getBean("userDao");
		int i = dao.add("源", "123456");
		if(i>0){
			System.out.println("恭喜您，添加成功!");
		}else{
			System.out.println("添加失败!");
		}
	}
	@Test
	public void Test02(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao dao = (UserDao) ac.getBean("userDao");
		int i = dao.delete(2);
		if(i>0){
			System.out.println("恭喜您，删除成功!");
		}else{
			System.out.println("删除失败!");
		}
	}
	@Test
	public void Test03(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao dao = (UserDao) ac.getBean("userDao");
		User user = new User(1,"yuan","123");
		int i = dao.update(user);
		if(i>0){
			System.out.println("恭喜您，修改成功!");
		}else{
			System.out.println("修改失败!");
		}
	}
	@Test
	public void Test04(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao dao = (UserDao) ac.getBean("userDao");
		User user = dao.selectById(2);
		System.out.println(user);
	}
	
	@Test
	public void Test05(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao dao = (UserDao) ac.getBean("userDao");
		ArrayList<User> list= dao.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
