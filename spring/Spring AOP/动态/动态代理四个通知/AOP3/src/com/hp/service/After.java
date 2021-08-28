package com.hp.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
//后置通知
public class After implements AfterReturningAdvice{
	/*
	 * 方法的作用：额外功能在原始方法之后执行
	 * ret:代表原始方法的返回值
	 * Method mi：额外功能添加给的原始方法
	 * args:原始方法调用的实际参数
	 * target：原始对象
	 * */
	@Override
	public void afterReturning(Object ret, Method mi, Object[] args, Object target) throws Throwable {
		/*// TODO 自动生成的方法存根
		//获取原始方法的返回值类型
		System.out.println("返回值："+ret);
		//获取原始方法的名字
		System.out.println("原始方法的名字："+mi.getName());
		//获取原始方法调用的实际参数
		for (Object arg : args) {
			System.out.println(arg);
		}
		//获取原始对象的类型
		System.out.println(target.getClass());*/
		System.out.println("我是核心功能之后执行的额外功能");
	}

}
