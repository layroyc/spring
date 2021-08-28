package com.hp.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hp.entity.User;
import com.hp.service.UserService;
//ʹ��Spring�ĵ�Ԫ����
@RunWith(SpringJUnit4ClassRunner.class)
//��������
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestService {
	@Autowired
	//��Ϊ����ע��
	private UserService userService;
	@Test
	public void testregist(){
		int i = userService.regist("��", "123456");
		if(i>0){
			System.out.println("ע��ɹ�");
		}else{
			System.out.println("ע��ʧ��");
		}
	}
	
	@Test
	public void testdel(){
		int i = userService.delete(1);
		if(i>0){
			System.out.println("ɾ���ɹ�");
		}else{
			System.out.println("ɾ��ʧ��");
		}
	}
	
	@Test
	public void testupdate(){
		User user = new User(3,"С��","123");
		int i = userService.update(user);
		if(i>0){
			System.out.println("�޸ĳɹ�");
		}else{
			System.out.println("�޸�ʧ��");
		}
	}
	
	@Test
	public void tselectId(){
		User user = userService.selectById(3);
		System.out.println(user);
	}
	
	@Test
	public void tSelectALL(){
		ArrayList<User> list = userService.selectAll();
		for (User user : list) {
			System.out.println(user);
		}
		
	}

}
