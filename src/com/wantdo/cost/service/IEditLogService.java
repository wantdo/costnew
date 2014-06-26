package com.wantdo.cost.service;

import java.util.List;

import com.wantdo.cost.model.EditLog;
import com.wantdo.cost.utils.PageBean;

public interface IEditLogService {
	public List findAll() ;
	/** 
	* 分页查询 
	* @param currentPage 当前第几页 
	* @param pageSize 每页大小 
	* @return 封闭了分页信息(包括记录集list)的Bean 
	*/ 
	public PageBean queryForPage(int pageSize,int currentPage); 
}
