package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.User;

public interface UserMapper {
	public void add(User user);
	public void delete(int id);
	public User get(int id);
	public void update(User user);
	public List<User> list();
	public int count();
	public User findPasswordByAccount(User user);
}
