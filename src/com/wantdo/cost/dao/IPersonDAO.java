package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.Person;


public interface IPersonDAO {

	public abstract void save(Person transientInstance);

	public abstract Person findById(java.lang.Integer id);

	public abstract List findByUsername(Object username);

	public abstract List findAll();
	
	public abstract boolean checkLogin(Person person);

}