package com.hp.landlond;

public class LandProxyServiceImpl implements LandLondService{
	//�н�
	@Override
	public void land() {
		// TODO Auto-generated method stub
		//���⹦��
		System.out.println("===����===");
		System.out.println("===���ͻ�����===");
		//�ҷ���
		LandLondService ls = new LandLondServiceImpl();
		ls.land();
	}

}
