package com.gpnu.association.pojo;

import java.util.Date;

public class User {
	private int user_id;
	private String user_name; //用户名
	private String account;   //账号
	private String password;  //密码
	private String phone;     //手机号
	private String email; 	  //邮箱
	private String sex;  	  //性别
	private String user_type; //用户角色
	private Date create_time; //创建时间
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", account=" + account + ", password="
				+ password + ", phone=" + phone + ", email=" + email + ", sex=" + sex + ", user_type=" + user_type
				+ ", create_time=" + create_time + "]";
	}
	
	
}
