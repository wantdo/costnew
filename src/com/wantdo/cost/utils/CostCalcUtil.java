package com.wantdo.cost.utils;

import java.util.ArrayList;
import java.util.List;

import com.wantdo.cost.model.Express;
import com.wantdo.cost.service.IPronameService;
import com.wantdo.cost.service.IStoService;
import com.wantdo.cost.service.impl.PronameService;
import com.wantdo.cost.service.impl.StoService;

public class CostCalcUtil {

	private List<Express> list;

	private IPronameService pronameService;
	private IStoService stoService;

	public CostCalcUtil() {	
		
	}

	public List<Express> getList() {
		return list;
	}

	public void setList(List<Express> list) {
		this.list = list;
	}

	public IPronameService getPronameService() {

		return pronameService;
	}

	public void setPronameService(IPronameService pronameService) {

		this.pronameService = pronameService;
	}

	public IStoService getStoService() {
		return stoService;
	}

	public void setStoService(IStoService stoService) {
		this.stoService = stoService;
	}

	public void acquisition() {
		list=new ArrayList<Express>();
		String provice = null;
		double firstWeight = 0.0;
		double firstPrice = 0.0;
		double secondPrice = 0.0;

		for (int i = 1; i <= 31; i++) {
			provice = pronameService.findById(i).getProvince();

			firstWeight = stoService.findById(i).getFirstWeight();
			firstPrice = stoService.findById(i).getFirstPrice();
			secondPrice = stoService.findById(i).getSecPrice();

			list.add(new Express(provice, firstWeight, firstPrice, secondPrice));

		}

	}
	

	public double getCostByProno(String prono) {
	//	acquisition();
		if (prono != null) {
			for (int i = 0; i < list.size(); ++i) {
				if (prono.contains(list.get(i).getProno())) {
				//	System.out.println(list.get(i).toString());
					return list.get(i).getFirstPrice();
				}
			}
		}
		return 0.0;
	}

	public double getCostByProno(String prono, Double weight) {
		//acquisition();
		if (prono != null) {
			for (int i = 0; i < list.size(); ++i) {
				Express express = list.get(i);
				if (prono.contains(express.getProno())) {
				//	System.out.println(express.toString() + "weight:" + weight);
					if (weight <= express.getFirst()) {
						return express.getFirstPrice();
					} else {
				//		System.out.println(express.getFirst());
						// 判断向上取整还是四舍五入
						if (stoService.findById(i).getRetention() == 2) {
							// if (express.getFirst()==3.0) {
							return express.getFirstPrice()
									+ Math.ceil(weight - express.getFirst())
									* express.getSecPrice();
						} else {
							return Math.round(express.getFirstPrice()
									+ (weight - express.getFirst())
									* express.getSecPrice());
						}
					}
				}
			}
		}
		return 0.0;
	}

}
