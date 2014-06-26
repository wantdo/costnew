package com.wantdo.cost.service;

import java.util.List;

import com.wantdo.cost.model.Person;


public interface IPersonService {
	
	public abstract void save(Person transientInstance);

	public abstract Person getById(java.lang.Integer id);

	public abstract List getByUsername(Object username);

	public abstract List getAll();
	
	public abstract boolean checkLogin(Person person);

}
