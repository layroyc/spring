package com.hp.dynamicproxy;
//原始类
public class OrderServiceImpl implements OrderService{
	//原始方法
	@Override
	public void regist() {
		// TODO Auto-generated method stub
		//核心功能
		System.out.println("调用dao层的方法");
	}

	@Override
	public void regist(String username) {
		// TODO 自动生成的方法存根
		//核心功能
		System.out.println("调用dao层的方法,一参");
	}

	@Override
	public void regist(String username, String password) {
		// TODO 自动生成的方法存根
		//核心功能
		System.out.println("调用dao层的方法,两参");
	}

}
