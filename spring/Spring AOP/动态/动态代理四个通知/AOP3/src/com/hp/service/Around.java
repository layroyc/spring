package com.hp.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//���⹦��   ����֪ͨ
public class Around implements MethodInterceptor{
	/*
	 * ���������ã�ԭʼ����ǰ��ִ�еĶ��⹦��
	 * MethodInvocation mi������ԭʼ�����ķ�װ
	 * return������ԭʼ�����ķ���ֵ
	 * */
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO �Զ����ɵķ������
		System.out.println("����ԭʼ����ִ��ǰ�Ķ��⹦��");
		//ִ��ԭʼ����
		Object ret = mi.proceed();
		System.out.println("����ԭʼ����ִ��֮��Ķ��⹦��");
		return ret;
	}

}
