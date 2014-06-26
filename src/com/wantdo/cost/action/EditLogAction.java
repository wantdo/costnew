package com.wantdo.cost.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wantdo.cost.model.EditLog;
import com.wantdo.cost.service.IEditLogService;
import com.wantdo.cost.utils.PageBean;

public class EditLogAction extends ActionSupport{
	private List<EditLog> proList;
	private IEditLogService editLogService;
	//private int page;//第几页 
	//private PageBean pageBean;//包含分布信息的bean 
	public EditLogAction(){
		super();
		proList = new ArrayList<EditLog>();
	}
	@Override
	public String execute() throws Exception {
		proList = editLogService.findAll();
		//this.pageBean = editLogService.queryForPage(2, page);//分页的pageBean,参数pageSize表示每页显示记录数,page为当前页 
		return SUCCESS;
		
	}
	public List<EditLog> getProList() {
		return proList;
	}
	public void setProList(List<EditLog> proList) {
		this.proList = proList;
	}
	public IEditLogService getEditLogService() {
		return editLogService;
	}
	public void setEditLogService(IEditLogService editLogService) {
		this.editLogService = editLogService;
	}
	

	/*public int getPage() { 
	return page; 
	} 

	public void setPage(int page) {//若URL中无此参数,会默认为第1页 
	this.page = page; 
	} 

	public PageBean getPageBean() { 
	return pageBean; 
	} 

	public void setPageBean(PageBean pageBean) { 
	this.pageBean = pageBean; 
	}*/
}
