package com.wantdo.cost.service;

import java.util.List;

import com.wantdo.cost.model.Traceno;

public interface ITracenoService {
	public void save(Traceno transientInstance);
	public Traceno findById(java.lang.Integer id);
	public void delete(Traceno persistentInstance);
	public void saveTracenos(String[] tracenos);
	public void deleteTableData();
}
