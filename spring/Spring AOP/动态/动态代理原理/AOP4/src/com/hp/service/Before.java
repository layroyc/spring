package com.hp.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
//ǰ��֪ͨ
public class Before implements MethodBeforeAdvice{
//������⹦��
	/*
	 * ���������ã���ԭʼ����ǰִ��
	 * 
	 * Method me:������⹦����Ӹ���ԭʼ����
	 * Object[] args��ԭʼ�������õ�ʵ�ʲ���
	 * Object target������ԭʼ�������ڵ�ԭʼ�๹����ԭʼ����
	 * *
	 */
	@Override
	public void before(Method me, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		//��ȡԭʼ����������
		System.out.println("ԭʼ���������֣�"+me.getName());
		//��ȡԭʼ�������õ�ʵ�ʲ���
		for (Object arg : args) {
			System.out.println(arg);
		}
		//��ȡԭʼ���������
		System.out.println(target.getClass());
		//��д���⹦��
		System.out.println("������ԭʼ����ǰ����Ķ��⹦��");
	}

}
