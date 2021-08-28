package com.hp.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.entity.User;
import com.hp.service.ServiceDao;

public class Testservice {
	@Test
	public void Test01(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		int i = dao.mregist("源", "123456");
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
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		int i = dao.mdelete(4);
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
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		User user = new User(1,"源哥","123");
		int i = dao.mupdate(user);
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
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		User user = dao.selectById(3);
		System.out.println(user);
	}
	
	@Test
	public void Test05(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取对象
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		ArrayList<User> list= dao.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
