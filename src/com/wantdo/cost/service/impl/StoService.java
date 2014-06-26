package com.wantdo.cost.service.impl;

import java.util.List;

import com.wantdo.cost.dao.IStoDAO;
import com.wantdo.cost.model.Sto;
import com.wantdo.cost.service.IStoService;


public class StoService implements IStoService {
	private IStoDAO stoDAO;
	@Override
	public List findAll() {
		//System.out.println("--------------------");
		return stoDAO.findAll();
	}
	
	@Override
	public void save(Sto saveInstance) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(Sto deleteInstance) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Sto updateInstance) {
		stoDAO.update(updateInstance);
		
	}
	@Override
	public Sto findById(Integer id) {
		//System.out.println("------------------->findById");
		return stoDAO.findById(id);
	}
	
	public IStoDAO getStoDAO() {
		return stoDAO;
	}
	public void setStoDAO(IStoDAO stoDAO) {
		this.stoDAO = stoDAO;
	}

}
