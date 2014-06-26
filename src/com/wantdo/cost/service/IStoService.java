package com.wantdo.cost.service;

import java.util.List;

import com.wantdo.cost.model.Sto;

public interface IStoService {
	public List findAll();
	
	public void save(Sto saveInstance);
	
	public void delete(Sto deleteInstance);
	
	public void update(Sto updateInstance);
	
	public Sto findById(Integer id);
}
