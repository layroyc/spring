package com.hp.service;

import com.hp.dao.UserDao;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	@Override
	public void save() {
		// TODO Auto-generated method stub
		userDao.save();
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
