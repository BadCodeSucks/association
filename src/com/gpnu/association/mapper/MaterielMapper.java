package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.Materiel;


public interface MaterielMapper {
	public void add(Materiel materiel);
	public void delete(int id);
	public Materiel get(int id);
	public void update(Materiel materiel);
	public List<Materiel> list();
	public int count();
}
