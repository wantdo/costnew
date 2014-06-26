package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.WspShops;

public interface IWspShopsDAO {

	public abstract void save(WspShops transientInstance);

	public abstract WspShops findById(java.lang.Integer id);

	public abstract List findBySysid(Object sysid);

	public abstract List findByShopname(Object shopname);

}