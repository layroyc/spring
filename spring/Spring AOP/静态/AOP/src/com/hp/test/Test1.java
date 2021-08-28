package com.hp.test;

import org.junit.Test;

import com.hp.landlond.LandLondService;
import com.hp.landlond.LandProxyServiceImpl;

public class Test1 {
	@Test
	public void test01(){
		//ÕÒ·¿¶«
		LandLondService ls = new LandProxyServiceImpl();
		ls.land();
	}

}
