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
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		MyConnect conn = (MyConnect) ac.getBean("&conn");
		System.out.println(conn);
	}
	
	@Test
	public void Testb(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		Connection conn = (Connection) ac.getBean("conn");
		System.out.println(conn);
	}
	
	@Test
	public void Testc(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��������
		Order order = (Order) ac.getBean("order");
		Order order2 = (Order) ac.getBean("order");
		System.out.println(order);
		System.out.println(order2);
	}
	
	@Test
	public void Testd(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
}
