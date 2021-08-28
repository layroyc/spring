package com.hp.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class User {
	private String id;
	private String username;
	private String password;
	
	private String[] array;//数组类型
	
	private ArrayList<String> list;//list集合
	
	private Set<String> set;//set集合类型
	
	private Map<String,String> map;//map类型
	
	private Properties props;//特殊的map集合，键值的类型都是String
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", 用户名=" + username + ", 密码="
				+ password + ", array=" + Arrays.toString(array) + ", list="
				+ list + ", set=" + set + ", map=" + map + ", props=" + props
				+ "]";
	}
	
}
