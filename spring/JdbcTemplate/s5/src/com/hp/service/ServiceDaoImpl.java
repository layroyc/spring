package com.hp.service;

import java.util.ArrayList;

import com.hp.dao.UserDao;
import com.hp.entity.User;

public class ServiceDaoImpl implements ServiceDao{
	//��Ϊ���Խ��ж�Ӧ��ע��
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int regist(String username, String password) {
		// TODO �Զ����ɵķ������
		//����dao�����ӷ���
		int i = userDao.add(username, password);
		return i;
	}

	@Override
	public int delete(int id) {
		// TODO �Զ����ɵķ������
		//����dao���ɾ������
		int i = userDao.delete(id);
		return i;
	}

	@Override
	public int update(User user) {
		// TODO �Զ����ɵķ������
		//����dao����޸ķ���
		int i = userDao.update(user);
		return i;
	}

	@Override
	public User selectById(int id) {
		// TODO �Զ����ɵķ������
		//����dao��ĵ��鷽��
		User user = userDao.selectById(id);
		return user;
	}

	@Override
	public ArrayList<User> selectAll() {
		// TODO �Զ����ɵķ������
		//����dao���ȫ�鷽��
		ArrayList<User> user = userDao.selectAll();
		return user;
	}

}
