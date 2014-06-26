package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.Sto;

public interface IStoDAO {
	public List findAll();
	
	public Sto findById(java.lang.Integer id) ;
	
	public void update(Sto updateInstance);
}
