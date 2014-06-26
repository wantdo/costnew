package com.wantdo.cost.model;

import java.util.HashSet;
import java.util.Set;


/**
 * Proname entity. @author MyEclipse Persistence Tools
 */

public class Proname implements java.io.Serializable {

	// Fields

	private Integer id;
	private String province;
	private Set<Sto> sto = new HashSet<Sto>(0);

	// Constructors

	/** default constructor */
	public Proname() {
	}

	/** full constructor */
	public Proname(String province,Set<Sto> sto) {
		this.province = province;
		this.sto = sto;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Set<Sto> getSto() {
		return sto;
	}

	public void setSto(Set<Sto> sto) {
		this.sto = sto;
	}

}