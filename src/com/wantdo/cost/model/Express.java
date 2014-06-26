package com.wantdo.cost.model;

public class Express {
	
	private String prono;
	private Double first;
	private Double firstPrice;
	private Double secPrice;
	
	public Express() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Express(String prono, Double first, Double firstPrice,
			Double secPrice) {
		super();
		this.prono = prono;
		this.first = first;
		this.firstPrice = firstPrice;
		this.secPrice = secPrice;
	}

	public String getProno() {
		return prono;
	}

	public void setProno(String prono) {
		this.prono = prono;
	}

	public Double getFirst() {
		return first;
	}

	public void setFirst(Double first) {
		this.first = first;
	}

	public Double getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(Double firstPrice) {
		this.firstPrice = firstPrice;
	}

	public Double getSecPrice() {
		return secPrice;
	}

	public void setSecPrice(Double secPrice) {
		this.secPrice = secPrice;
	}

	@Override
	public String toString() {
		return "Express [prono=" + prono + ", first=" + first + ", firstPrice="
				+ firstPrice + ", secPrice=" + secPrice + "]";
	}
	
	

	
}
