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
		//����ԭʼ�����
		final UserService us = new UserServiceImpl();
		//���⹦��
		InvocationHandler invocationHandler = new InvocationHandler() {
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
		//����Enhancer���� ������̬�������
		Enhancer enhancer = new Enhancer();
		//�����������
		enhancer.setClassLoader(TestCGLIB.class.getClassLoader());
		/*��֤ԭʼ��ʹ���������ͬ�ķ���:
		 * �٣�ʵ����ͬ�Ľӿ�
		 * �ڣ�ʹԭʼ����Ϊ������ĸ���
		 * */
		enhancer.setSuperclass(us.getClass());
		//��ԭʼ����Ӷ��⹦��
		enhancer.setCallback(invocationHandler);
		//������̬�������
		UserService user = (UserService) enhancer.create();
		//����
		user.regist("��Դ", "123456");
		
	}

}
