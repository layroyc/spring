package com.hp.service;

import org.springframework.aop.ThrowsAdvice;
//额外功能异常通知
public class Myexception implements ThrowsAdvice{
	/*
	 * 作用：在原始方法产生异常时，运行对应的额外功能
	 * 注意：方法必须固定写死
	 * */
	public void afterThrowing(Exception e) {
		System.out.println("我是原始方法产生的异常");
	}
}
