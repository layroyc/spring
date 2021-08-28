package com.hp.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hp.entity.User;
import com.hp.service.UserService;
//使用Spring的单元测试
@RunWith(SpringJUnit4ClassRunner.class)
//创建工厂
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestService {
	@Autowired
	//作为属性注入
	private UserService userService;
	@Test
	public void testregist(){
		int i = userService.regist("王", "123456");
		if(i>0){
			System.out.println("注册成功");
		}else{
			System.out.println("注册失败");
		}
	}
	
	@Test
	public void testdel(){
		int i = userService.delete(1);
		if(i>0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void testupdate(){
		User user = new User(3,"小刘","123");
		int i = userService.update(user);
		if(i>0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
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
