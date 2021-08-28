package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hp.dao.UserDao;
import com.hp.entity.User;

@Service
@Transactional	//全局配置 	局部配置的优先权大于全局配置
public class UserServiceImpl implements UserService{
	//作为属性进行对应的注入
	@Autowired	//自动注入   
	private UserDao userDao;
	
	//注册
	@Override
	public int regist(String username, String password) {
		// TODO Auto-generated method stub
		//调用dao中的方法
		int i = userDao.add(username, password);
		return i;
	}
	//删除
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int i = userDao.delete(id);
		return i;
	}
	//修改
	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		int i = userDao.update(user);
		return i;
	}
	//单查
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)//提高查询效率	局部配置
	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		User user = userDao.selectById(id);
		return user;
	}
	//全查
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)//提高查询效率	局部配置
	@Override
	public ArrayList<User> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<User> user = userDao.selectAll();
		return user;
	}

}
