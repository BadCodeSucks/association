package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.Association;


public interface AssociationMapper {
	public void add(Association association);
	public void delete(int id);
	public Association get(int id);
	public void update(Association association);
	public List<Association> list();
	public int count();
}
