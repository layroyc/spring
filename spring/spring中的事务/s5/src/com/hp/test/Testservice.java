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
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		int i = dao.mregist("Դ", "123456");
		if(i>0){
			System.out.println("��ϲ������ӳɹ�!");
		}else{
			System.out.println("���ʧ��!");
		}
	}
	@Test
	public void Test02(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		int i = dao.mdelete(4);
		if(i>0){
			System.out.println("��ϲ����ɾ���ɹ�!");
		}else{
			System.out.println("ɾ��ʧ��!");
		}
	}
	@Test
	public void Test03(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		User user = new User(1,"Դ��","123");
		int i = dao.mupdate(user);
		if(i>0){
			System.out.println("��ϲ�����޸ĳɹ�!");
		}else{
			System.out.println("�޸�ʧ��!");
		}
	}
	@Test
	public void Test04(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		User user = dao.selectById(3);
		System.out.println(user);
	}
	
	@Test
	public void Test05(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����
		ServiceDao dao = (ServiceDao) ac.getBean("serviceDao");
		ArrayList<User> list= dao.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
	}

}
