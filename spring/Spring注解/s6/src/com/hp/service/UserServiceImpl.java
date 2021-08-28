package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hp.dao.UserDao;
import com.hp.entity.User;

@Service
@Transactional	//ȫ������ 	�ֲ����õ�����Ȩ����ȫ������
public class UserServiceImpl implements UserService{
	//��Ϊ���Խ��ж�Ӧ��ע��
	@Autowired	//�Զ�ע��   
	private UserDao userDao;
	
	//ע��
	@Override
	public int regist(String username, String password) {
		// TODO Auto-generated method stub
		//����dao�еķ���
		int i = userDao.add(username, password);
		return i;
	}
	//ɾ��
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int i = userDao.delete(id);
		return i;
	}
	//�޸�
	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		int i = userDao.update(user);
		return i;
	}
	//����
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)//��߲�ѯЧ��	�ֲ�����
	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		User user = userDao.selectById(id);
		return user;
	}
	//ȫ��
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)//��߲�ѯЧ��	�ֲ�����
	@Override
	public ArrayList<User> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<User> user = userDao.selectAll();
		return user;
	}

}
