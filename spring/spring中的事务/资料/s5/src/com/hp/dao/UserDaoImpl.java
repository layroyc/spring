package com.hp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hp.entity.User;

public class UserDaoImpl implements UserDao{

	//作为属性进行对应的注入
	private JdbcTemplate jdbcTemplate;
	//为属性提供set方法
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int add(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "insert into user(username,password) values (?,?)";
		int i = jdbcTemplate.update(sql, username,password);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from user where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		String sql = "update user set username=?,password=? where id=?";
		int i = jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getId());
		return i;
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from user where id=?";
		/*RowMapper<User> rowMapper = new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				//ResultSet:处理结果集 查询到的数据
				User user = new User(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3)
						);
				return user;
			}
			
		};
		User us = jdbcTemplate.queryForObject(sql, rowMapper,id);*/
		User us = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
		return us;
	}

	@Override
	public ArrayList<User> selectAll() {
		// TODO Auto-generated method stub
		String sql = "select * from user";
		ArrayList<User> list = (ArrayList<User>) jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class) );
		return list;
	}

}
