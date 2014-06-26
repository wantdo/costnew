package com.wantdo.cost.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wantdo.cost.service.IWspOrdermstService;

public class ShopStatAction extends ActionSupport {
	
	private IWspOrdermstService service;
	private List<Object[]> list;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		list=service.getShopStat();
		System.out.println(list);
		return super.execute();
	}

	public IWspOrdermstService getService() {
		return service;
	}

	public void setService(IWspOrdermstService service) {
		this.service = service;
	}

	public List<Object[]> getList() {
		return list;
	}

	public void setList(List<Object[]> list) {
		this.list = list;
	}
	
}
