package com.hp.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {
	@Test
	public void Test01(){
		//׼������Դspring������Դ
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ssm");
		ds.setUsername("root");
		ds.setPassword("1234567");
		//����jdbcTemplate����
		JdbcTemplate jt = new JdbcTemplate();
		//��������Դ
		jt.setDataSource(ds);
		//ִ�в���
		jt.execute("insert into user(username,password) values ('wang','123456')");
	}
	@Test
	public void Test02(){
		//��������
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jd = (JdbcTemplate) ac.getBean("jdbcTemplate");
		jd.execute("insert into user(username,password) values ('wang','1234567')");
	}

}
