package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface ServiceDao {
	//增加
	int regist(String username,String password);
	//删除
	int delete(int id);
	//修改
	int update(User user);
	//单查
	User selectById(int id);
	//全查
	ArrayList<User> selectAll();

}
