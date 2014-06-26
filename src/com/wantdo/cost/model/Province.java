package com.wantdo.cost.model;

import java.sql.Timestamp;


/**
 * Province entity. @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private ProvinceId id;
	private String prvcname;
	private String prvcnameE;
	private String domainame;
	private String teleNo;
	private Timestamp verdtm;

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** minimal constructor */
	public Province(ProvinceId id) {
		this.id = id;
	}

	/** full constructor */
	public Province(ProvinceId id, String prvcname, String prvcnameE,
			String domainame, String teleNo, Timestamp verdtm) {
		this.id = id;
		this.prvcname = prvcname;
		this.prvcnameE = prvcnameE;
		this.domainame = domainame;
		this.teleNo = teleNo;
		this.verdtm = verdtm;
	}

	// Property accessors

	public ProvinceId getId() {
		return this.id;
	}

	public void setId(ProvinceId id) {
		this.id = id;
	}

	public String getPrvcname() {
		return this.prvcname;
	}

	public void setPrvcname(String prvcname) {
		this.prvcname = prvcname;
	}

	public String getPrvcnameE() {
		return this.prvcnameE;
	}

	public void setPrvcnameE(String prvcnameE) {
		this.prvcnameE = prvcnameE;
	}

	public String getDomainame() {
		return this.domainame;
	}

	public void setDomainame(String domainame) {
		this.domainame = domainame;
	}

	public String getTeleNo() {
		return this.teleNo;
	}

	public void setTeleNo(String teleNo) {
		this.teleNo = teleNo;
	}

	public Timestamp getVerdtm() {
		return this.verdtm;
	}

	public void setVerdtm(Timestamp verdtm) {
		this.verdtm = verdtm;
	}

}