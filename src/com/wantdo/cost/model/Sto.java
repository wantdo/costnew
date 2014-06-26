package com.wantdo.cost.model;


/**
 * Sto entity. @author MyEclipse Persistence Tools
 */

public class Sto implements java.io.Serializable {

	// Fields

	private Integer id;
	private Double firstWeight;
	private Double firstPrice;
	private Double secPrice;
	private Proname proname;
	private Integer retention;

	// Constructors

	/** default constructor */
	public Sto() {
	}

	/** full constructor */
	public Sto(Proname proname, Double firstWeight, Double firstPrice,
			Double secPrice,Integer retention) {
		this.proname = proname;
		this.firstWeight = firstWeight;
		this.firstPrice = firstPrice;
		this.secPrice = secPrice;
		this.retention = retention;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getFirstWeight() {
		return this.firstWeight;
	}

	public void setFirstWeight(Double firstWeight) {
		this.firstWeight = firstWeight;
	}

	public Double getFirstPrice() {
		return this.firstPrice;
	}

	public void setFirstPrice(Double firstPrice) {
		this.firstPrice = firstPrice;
	}

	public Double getSecPrice() {
		return this.secPrice;
	}

	public void setSecPrice(Double secPrice) {
		this.secPrice = secPrice;
	}

	public Proname getProname() {
		return proname;
	}

	public void setProname(Proname proname) {
		this.proname = proname;
	}

	public Integer getRetention() {
		return retention;
	}

	public void setRetention(Integer retention) {
		this.retention = retention;
	}

}