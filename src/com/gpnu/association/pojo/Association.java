package com.gpnu.association.pojo;

import java.util.Arrays;

public class Association {
	private int association_id; //社团id
	private String name;		//社团名称
	private byte[] brief_introduction;  //社团简介
	private String state; 	    //社团状态
	public int getAssociation_id() {
		return association_id;
	}
	public void setAssociation_id(int association_id) {
		this.association_id = association_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getBrief_introduction() {
		return brief_introduction;
	}
	public void setBrief_introduction(byte[] brief_introduction) {
		this.brief_introduction = brief_introduction;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Association [association_id=" + association_id + ", name=" + name + ", brief_introduction="
				+ Arrays.toString(brief_introduction) + ", state=" + state + "]";
	}
	
	
}
