package com.hp.service;

import org.springframework.aop.ThrowsAdvice;
//���⹦���쳣֪ͨ
public class Myexception implements ThrowsAdvice{
	/*
	 * ���ã���ԭʼ���������쳣ʱ�����ж�Ӧ�Ķ��⹦��
	 * ע�⣺��������̶�д��
	 * */
	public void afterThrowing(Exception e) {
		System.out.println("����ԭʼ�����������쳣");
	}
}
