package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.User;

public interface UserDao {
	//����
	int add(String username,String password);
	//ɾ��
	int delete(int id);
	//�޸�
	int update(User user);
	//����
	User selectById(int id);
	//ȫ��
	ArrayList<User> selectAll();

}
