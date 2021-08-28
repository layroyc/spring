package com.hp.dynamicproxy;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//额外功能
public class Proxy implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		//书写额外功能
		System.out.println("控制事务");
	}

	

}
