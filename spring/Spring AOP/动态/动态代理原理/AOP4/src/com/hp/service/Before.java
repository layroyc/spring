package com.hp.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
//前置通知
public class Before implements MethodBeforeAdvice{
//定义额外功能
	/*
	 * 方法的作用：在原始方法前执行
	 * 
	 * Method me:代表额外功能添加给的原始方法
	 * Object[] args：原始方法调用的实际参数
	 * Object target：代表原始方法所在的原始类构建的原始对象
	 * *
	 */
	@Override
	public void before(Method me, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		//获取原始方法的名字
		System.out.println("原始方法的名字："+me.getName());
		//获取原始方法调用的实际参数
		for (Object arg : args) {
			System.out.println(arg);
		}
		//获取原始对象的类型
		System.out.println(target.getClass());
		//书写额外功能
		System.out.println("我是在原始功能前输出的额外功能");
	}

}
