package com.wantdo.cost.dao;

import java.util.List;

import com.wantdo.cost.model.EditLog;

public interface IEditLogDAO {
	public List findAll() ;
	/** *//** 
	* 分页查询 
	* @param hql 查询的条件 
	* @param offset 开始记录 
	* @param length 一次查询几条记录 
	* @return 
	*/ 
	public List queryForPage(final String hql,final int offset,final int length); 

	/** *//** 
	* 查询所有记录数 
	* @param hql 查询的条件 
	* @return 总记录数 
	*/ 
	public int getAllRowCount(String hql); 
}
