package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.AssociationAndUser;


public interface AssociationAndUserMapper {
	public void add(AssociationAndUser anu);
	public void delete(int id);
	public AssociationAndUser get(int id);
	public void update(AssociationAndUser anu);
	public List<AssociationAndUser> list();
	public int count();
}
