package com.hp.entity;

public class Order {
	private Integer id;
	private String ordername;
	private String desc;
	public Order(Integer id, String ordername, String desc) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.desc = desc;
	}
	public Order() {
		super();
		System.out.println("’‚¿Ô «Order");
		// TODO Auto-generated constructor stub
	}
	
	
}
