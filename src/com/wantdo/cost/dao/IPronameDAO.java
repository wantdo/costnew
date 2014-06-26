package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.Proname;

public interface IPronameDAO {
	public List findAll() ;

	public Proname findById(java.lang.Integer id);
}
