package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.News;


public interface NewsMapper {
	public void add(News news);
	public void delete(int id);
	public News get(int id);
	public void update(News news);
	public List<News> list();
	public int count();
}
