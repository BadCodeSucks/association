package com.gpnu.association.mapper;

import java.util.List;

import com.gpnu.association.pojo.Event;


public interface EventMapper {
	public void add(Event event);
	public void delete(int id);
	public Event get(int id);
	public void update(Event event);
	public List<Event> list();
	public int count();
}
