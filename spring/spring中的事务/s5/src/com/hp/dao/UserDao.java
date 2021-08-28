package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserDao {
	//增加
	int add(String username,String password);
	//删除
	int delete(int id);
	//修改
	int update(User user);
	//单查
	User selectById(int id);
	//全查
	ArrayList<User> selectAll();

}
