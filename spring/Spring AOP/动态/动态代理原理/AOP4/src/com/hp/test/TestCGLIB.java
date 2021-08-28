package com.hp.test;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

import com.hp.service.UserService;
import com.hp.service.UserServiceImpl;

public class TestCGLIB {
	@Test
	public void TestCGLIB() {
		//创建原始类对象
		final UserService us = new UserServiceImpl();
		//额外功能
		InvocationHandler invocationHandler = new InvocationHandler() {
			/*参数:proxy:代理对象
			 * 	  method：原始方法
			 * 	  args:原始方法调用的实际参数
			 * 
			 * */
			//匿名内部类
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("我是原始方法之前执行的额外功能");
				Object ret = method.invoke(us, args);
				System.out.println("我是原始方法之后执行的额外功能");
				return ret;//原始方法的返回值
			}
		};
		//借助Enhancer对象 创建动态代理对象
		Enhancer enhancer = new Enhancer();
		//设置类加载器
		enhancer.setClassLoader(TestCGLIB.class.getClassLoader());
		/*保证原始类和代理类有相同的方法:
		 * ①：实现相同的接口
		 * ②：使原始类作为代理类的父类
		 * */
		enhancer.setSuperclass(us.getClass());
		//给原始类添加额外功能
		enhancer.setCallback(invocationHandler);
		//构建动态代理对象
		UserService user = (UserService) enhancer.create();
		//调用
		user.regist("王源", "123456");
		
	}

}
