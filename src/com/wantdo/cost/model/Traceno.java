package com.wantdo.cost.model;

/**
 * Traceno entity. @author MyEclipse Persistence Tools
 */

public class Traceno implements java.io.Serializable {

	// Fields

	private Integer id;
	private String traceno;

	// Constructors

	/** default constructor */
	public Traceno() {
	}

	/** full constructor */
	public Traceno(String traceno) {
		this.traceno = traceno;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTraceno() {
		return this.traceno;
	}

	public void setTraceno(String traceno) {
		this.traceno = traceno;
	}

}