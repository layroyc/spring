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
		//ClassLoader:�������
		
		/*interfaces:�ӿ�    
		 *��֤ԭʼ��ʹ���������ͬ�ķ���
		 *��α�֤��
		 *ʵ��ͬһ����
		 **/
		//��ȡԭʼ��ʵ�ֵĽӿ�
		//�ٴ���ԭʼ�����
		final UserService us = new UserServiceImpl();
		//�ڻ�ȡԭʼ��ʵ�ֵĽӿ�
		Class<?>[] interfaces = us.getClass().getInterfaces();
		InvocationHandler invocationHandler =new InvocationHandler() {
			/*����:proxy:�������
			 * 	  method��ԭʼ����
			 * 	  args:ԭʼ�������õ�ʵ�ʲ���
			 * 
			 * */
			//�����ڲ���
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("����ԭʼ����֮ǰִ�еĶ��⹦��");
				Object ret = method.invoke(us, args);
				System.out.println("����ԭʼ����֮��ִ�еĶ��⹦��");
				return ret;//ԭʼ�����ķ���ֵ
			}
		};
		UserService userService =(UserService) Proxy.newProxyInstance(TestJDK.class.getClassLoader(), interfaces, invocationHandler);
		userService.regist("wang", "123456");
		
	}


}
