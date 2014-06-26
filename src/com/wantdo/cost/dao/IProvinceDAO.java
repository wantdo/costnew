package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.Province;

public interface IProvinceDAO {

	public abstract void save(Province transientInstance);

	public abstract List findByPrvcname(Object prvcname);

}