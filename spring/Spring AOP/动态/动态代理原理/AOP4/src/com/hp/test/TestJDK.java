package com.hp.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.hp.service.UserService;
import com.hp.service.UserServiceImpl;

public class TestJDK {
	@Test
	public void TestJDK(){
		//ClassLoader:类加载器
		
		/*interfaces:接口    
		 *保证原始类和代理类有相同的方法
		 *如何保证？
		 *实现同一方法
		 **/
		//获取原始类实现的接口
		//①创建原始类对象
		final UserService us = new UserServiceImpl();
		//②获取原始类实现的接口
		Class<?>[] interfaces = us.getClass().getInterfaces();
		InvocationHandler invocationHandler =new InvocationHandler() {
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
		UserService userService =(UserService) Proxy.newProxyInstance(TestJDK.class.getClassLoader(), interfaces, invocationHandler);
		userService.regist("wang", "123456");
		
	}


}
