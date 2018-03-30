package com.gpnu.association.pojo;

public class AssociationAndUser {
	private int id; 			 //社团成员关系表id
	private int association_id;  //社团id
	private int user_id;		 //成员id
	private String user_type; 	 //成员角色
	private String user_state;   //成员状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAssociation_id() {
		return association_id;
	}
	public void setAssociation_id(int association_id) {
		this.association_id = association_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	@Override
	public String toString() {
		return "AssociationAndUser [id=" + id + ", association_id=" + association_id + ", user_id=" + user_id
				+ ", user_type=" + user_type + ", user_state=" + user_state + "]";
	}
	
	
}
