package com.hp.dynamicproxy;
//ԭʼ��
public class OrderServiceImpl implements OrderService{
	//ԭʼ����
	@Override
	public void regist() {
		// TODO Auto-generated method stub
		//���Ĺ���
		System.out.println("����dao��ķ���");
	}

	@Override
	public void regist(String username) {
		// TODO �Զ����ɵķ������
		//���Ĺ���
		System.out.println("����dao��ķ���,һ��");
	}

	@Override
	public void regist(String username, String password) {
		// TODO �Զ����ɵķ������
		//���Ĺ���
		System.out.println("����dao��ķ���,����");
	}

}
