package com.hp.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//额外功能   环绕通知
public class Around implements MethodInterceptor{
	/*
	 * 方法的作用：原始方法前后都执行的额外功能
	 * MethodInvocation mi：代表原始方法的封装
	 * return：返回原始方法的返回值
	 * */
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println("我是原始方法执行前的额外功能");
		//执行原始方法
		Object ret = mi.proceed();
		System.out.println("我是原始方法执行之后的额外功能");
		return ret;
	}

}
