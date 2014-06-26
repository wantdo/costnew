package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.WspOrdermst;

public interface IWspOrdermstDAO {

	public abstract void save(WspOrdermst transientInstance);

	public abstract WspOrdermst findById(java.lang.String id);

	public abstract List findByRelid(Object relid);

	public abstract List findByTraceno(Object traceno);
	
	public abstract List findShopStat();
	
	public abstract List<Object[]> findByTracenos(String[] tracenos);
	public List<Object[]> findByTracenosNew();
}