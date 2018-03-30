package com.gpnu.association.pojo;

import java.util.Date;

public class Event {
	private int id; 	//活动Id
	private String title;  //活动标题
	private String content; //活动内容
	private int association_id; //社团id
	private int user_id;	//申请人id
	private Date create_time; //活动申请时间
	private Date begin_time;	//活动开始时间
	private Date end_time;	   //活动结束时间
	private String state;	  //活动状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getBegin_time() {
		return begin_time;
	}
	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", content=" + content + ", association_id=" + association_id
				+ ", user_id=" + user_id + ", create_time=" + create_time + ", begin_time=" + begin_time + ", end_time="
				+ end_time + ", state=" + state + "]";
	}
	
	
}
