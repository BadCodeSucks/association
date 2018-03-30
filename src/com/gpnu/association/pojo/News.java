package com.gpnu.association.pojo;

import java.util.Date;

public class News {
	private String id;	//新闻id
	private String title;	//新闻标题
	private String content; //新闻内容
	private Date create_time;  //新闻发布时间
	private String association_id;   //社团id
	private String user_id;	   //新闻发布人Id
	private String state;	   //新闻状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getAssociation_id() {
		return association_id;
	}
	public void setAssociation_id(String association_id) {
		this.association_id = association_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + ", create_time=" + create_time
				+ ", association_id=" + association_id + ", user_id=" + user_id + ", state=" + state + "]";
	}
	
	
}
