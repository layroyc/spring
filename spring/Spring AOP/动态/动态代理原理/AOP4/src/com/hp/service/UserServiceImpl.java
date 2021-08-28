package com.hp.service;
//原始方法
public class UserServiceImpl implements UserService{
	//原始类
	@Override
	public int regist(String username, String password) {
		// TODO Auto-generated method stub
		//核心功能
		System.out.println("这里是调用dao层的注册方法");
		/*throw new RuntimeException("我是异常");*/
		return 666;
	}

}
