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
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		User user = (User) ac.getBean("uu");
		System.out.println(user);
	}
	
	@Test
	public void test02(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		int i = ud.add("源", "123456");
		if(i>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
	@Test
	public void test03(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		int i = ud.delete(2);
		if(i>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	@Test
	public void test04(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		User user = new User(1,"吴","123");
		int i = ud.update(user);
		if(i>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	@Test
	public void test05(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		User user = ud.selectById(1);
		System.out.println(user);
	}
	
	@Test
	public void test06(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		UserDao ud = (UserDao) ac.getBean("userDaoImpl");
		ArrayList<User> list = ud.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
