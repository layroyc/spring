package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface ServiceDao {
	//增加
	int mregist(String username,String password) throws Exception;
	//删除
	int mdelete(int id);
	//修改
	int mupdate(User user);
	//单查
	User selectById(int id);
	//全查
	ArrayList<User> selectAll();

}
