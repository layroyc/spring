package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.User;

public interface ServiceDao {
	//����
	int mregist(String username,String password) throws Exception;
	//ɾ��
	int mdelete(int id);
	//�޸�
	int mupdate(User user);
	//����
	User selectById(int id);
	//ȫ��
	ArrayList<User> selectAll();

}
