package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface ServiceDao {
	//����
	int regist(String username,String password);
	//ɾ��
	int delete(int id);
	//�޸�
	int update(User user);
	//����
	User selectById(int id);
	//ȫ��
	ArrayList<User> selectAll();

}
