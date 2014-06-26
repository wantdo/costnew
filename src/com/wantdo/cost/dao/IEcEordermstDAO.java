package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.EcEordermst;

public interface IEcEordermstDAO {

	public abstract void save(EcEordermst transientInstance);

	public abstract EcEordermst findById(java.lang.String id);

	public abstract List findByRelid(Object relid);

}