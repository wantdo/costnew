package com.wantdo.cost.service;

import java.util.List;

import com.wantdo.cost.model.Proname;
import com.wantdo.cost.model.Sto;

public interface IPronameService {
	public List findAll();

	public Proname findById(int id);
	
}
