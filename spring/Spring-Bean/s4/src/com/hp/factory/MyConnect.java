package com.hp.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.FactoryBean;

public class MyConnect implements FactoryBean<Connection>{

	@Override
	public Connection getObject() throws Exception {
		// TODO Auto-generated method stub
		//加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zz1", "root", "root");
		return conn;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Connection.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
