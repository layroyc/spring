package com.hp.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hp.entity.User;

@Repository	//创建Dao接口实现类对象
public class UserDaoImpl implements UserDao{
	//作为属性进行对应的注入
	@Autowired	//自动注入   	且不需要set方法
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int add(String username, String password) {
		// TODO Auto-generated method stub
		String sql="insert into user(username,password) values(?,?)";
		int i = jdbcTemplate.update(sql, username,password);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from user where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		String sql = "update user set username=?,password=? where id=?";
		int i = jdbcTemplate.update(sql, user.getUsername(),user.getPassword(),user.getId());
		return i;
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from user where id=?";
		User us = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
		return us;
	}

	@Override
	public ArrayList<User> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from user";
		ArrayList<User> list = (ArrayList<User>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

}
