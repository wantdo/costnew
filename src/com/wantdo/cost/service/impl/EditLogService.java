package com.wantdo.cost.service.impl;

import java.util.List;

import com.wantdo.cost.dao.IEditLogDAO;
import com.wantdo.cost.model.EditLog;
import com.wantdo.cost.service.IEditLogService;
import com.wantdo.cost.utils.PageBean;


public class EditLogService implements IEditLogService {
	private IEditLogDAO editLogDAO;
	@Override
	public List findAll() {
		return editLogDAO.findAll();
	}


	public IEditLogDAO getEditLogDAO() {
		return editLogDAO;
	}


	public void setEditLogDAO(IEditLogDAO editLogDAO) {
		this.editLogDAO = editLogDAO;
	}


	/** *//** 
	* 分页查询 
	* @param currentPage 当前第几页 
	* @param pageSize 每页大小 
	* @return 封闭了分页信息(包括记录集list)的Bean 
	*/ 
	@Override
	public PageBean queryForPage(int pageSize,int page){ 

	final String hql = "from EditLog";//查询语句 
	int allRow = editLogDAO.getAllRowCount(hql);//总记录数 
	int totalPage = PageBean.countTotalPage(pageSize, allRow);//总页数 
	final int offset = PageBean.countOffset(pageSize, page);//当前页开始记录 
	final int length = pageSize;//每页记录数 
	final int currentPage = PageBean.countCurrentPage(page); 
	List<EditLog> list = editLogDAO.queryForPage(hql,offset, length);//"一页"的记录 

	//把分页信息保存到Bean中 
	PageBean pageBean = new PageBean(); 
	pageBean.setPageSize(pageSize);
	pageBean.setCurrentPage(currentPage); 
	pageBean.setAllRow(allRow); 
	pageBean.setTotalPage(totalPage); 
	pageBean.setList(list); 
	pageBean.init(); 
	return pageBean; 
	}
}
