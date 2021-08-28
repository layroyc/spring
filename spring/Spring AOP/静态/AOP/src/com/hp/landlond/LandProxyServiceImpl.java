package com.hp.landlond;

public class LandProxyServiceImpl implements LandLondService{
	//中介
	@Override
	public void land() {
		// TODO Auto-generated method stub
		//额外功能
		System.out.println("===打广告===");
		System.out.println("===带客户看房===");
		//找房东
		LandLondService ls = new LandLondServiceImpl();
		ls.land();
	}

}
