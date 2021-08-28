package com.hp.service;

import java.util.ArrayList;

import com.hp.dao.UserDao;
import com.hp.entity.User;

public class ServiceDaoImpl implements ServiceDao{
	//作为属性进行对应的注入
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int regist(String username, String password) {
		// TODO 自动生成的方法存根
		//调用dao层的添加方法
		int i = userDao.add(username, password);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO 自动生成的方法存根
		//调用dao层的删除方法
		int i = userDao.delete(id);
		return i;
	}

	@Override
	public int update(User user) {
		// TODO 自动生成的方法存根
		//调用dao层的修改方法
		int i = userDao.update(user);
		return i;
	}

	@Override
	public User selectById(int id) {
		// TODO 自动生成的方法存根
		//调用dao层的单查方法
		User user = userDao.selectById(id);
		return user;
	}

	@Override
	public ArrayList<User> selectAll() {
		// TODO 自动生成的方法存根
		//调用dao层的全查方法
		ArrayList<User> user = userDao.selectAll();
		return user;
	}

}
