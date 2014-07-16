package com.wantdo.cost.utils;

import java.util.ArrayList;
import java.util.List;

import com.wantdo.cost.model.Express;
import com.wantdo.cost.model.Proname;
import com.wantdo.cost.model.Sto;
import com.wantdo.cost.service.IPronameService;
import com.wantdo.cost.service.IStoService;
import com.wantdo.cost.service.impl.PronameService;
import com.wantdo.cost.service.impl.StoService;

public class CostCalcUtil {

	private List<Sto> list;

	private IPronameService pronameService;
	private IStoService stoService;

	public CostCalcUtil() {

	}

	public List<Sto> getList() {
		return list;
	}

	public void setList(List<Sto> list) {
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
		list = new ArrayList<Sto>();
		String provice = null;
		double firstWeight = 0.0;
		double firstPrice = 0.0;
		double secondPrice = 0.0;
		int retention = 1;

		for (int i = 1; i <= 31; i++) {
			provice = pronameService.findById(i).getProvince();
			Proname proname = new Proname(i,provice);
			firstWeight = stoService.findById(i).getFirstWeight();
			firstPrice = stoService.findById(i).getFirstPrice();
			secondPrice = stoService.findById(i).getSecPrice();
			retention = stoService.findById(i).getRetention();

			list.add(new Sto(proname, firstWeight, firstPrice, secondPrice,
					retention));

		}

	}

	public double getCostByProno(String prono) {
		if (prono != null) {
			for (int i = 0; i < list.size(); ++i) {
				if (prono.contains(list.get(i).getProname().getProvince())) {
					return list.get(i).getFirstPrice();
				}
			}
		}
		return 0.0;
	}

	public double getCostByProno(String prono, Double weight) {
		if (prono != null) {
			for (int i = 0; i < list.size(); ++i) {
				Sto sto = list.get(i);
				if (prono.contains(sto.getProname().getProvince())) {
					if (weight <= sto.getFirstWeight()) {
						return sto.getFirstPrice();
					} else {
						// 判断向上取整还是四舍五入
						if (sto.getRetention() == 2) {
							return sto.getFirstPrice()
									+ Math.ceil(weight - sto.getFirstWeight())
									* sto.getSecPrice();
						} else {
							System.out.println(Math.round(sto.getFirstPrice()
									+ (weight - sto.getFirstWeight())
									* sto.getSecPrice()));
							return Math.round(sto.getFirstPrice()
									+ (weight - sto.getFirstWeight())
									* sto.getSecPrice());
						}
					}
				}
			}
		}
		return 0.0;
	}

}
