package com.hp.test;

import java.sql.Connection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hp.entity.Order;
import com.hp.factory.MyConnect;

public class Text01 {
	@Test
	public void Testa(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		MyConnect conn = (MyConnect) ac.getBean("&conn");
		System.out.println(conn);
	}
	
	@Test
	public void Testb(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		Connection conn = (Connection) ac.getBean("conn");
		System.out.println(conn);
	}
	
	@Test
	public void Testc(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//创建对象
		Order order = (Order) ac.getBean("order");
		Order order2 = (Order) ac.getBean("order");
		System.out.println(order);
		System.out.println(order2);
	}
	
	@Test
	public void Testd(){
		//创建工厂
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
}
