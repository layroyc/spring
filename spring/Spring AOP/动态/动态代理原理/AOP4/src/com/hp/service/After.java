package com.hp.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//����֪ͨ
public class After implements AfterReturningAdvice{
	/*
	 * ���������ã����⹦����ԭʼ����֮��ִ��
	 * ret:����ԭʼ�����ķ���ֵ
	 * Method mi�����⹦����Ӹ���ԭʼ����
	 * args:ԭʼ�������õ�ʵ�ʲ���
	 * target��ԭʼ����
	 * */
	@Override
	public void afterReturning(Object ret, Method mi, Object[] args, Object target) throws Throwable {
		/*// TODO �Զ����ɵķ������
		//��ȡԭʼ�����ķ���ֵ����
		System.out.println("����ֵ��"+ret);
		//��ȡԭʼ����������
		System.out.println("ԭʼ���������֣�"+mi.getName());
		//��ȡԭʼ�������õ�ʵ�ʲ���
		for (Object arg : args) {
			System.out.println(arg);
		}
		//��ȡԭʼ���������
		System.out.println(target.getClass());*/
		System.out.println("���Ǻ��Ĺ���֮��ִ�еĶ��⹦��");
	}

}
