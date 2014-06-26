package com.wantdo.cost.model;

/**
 * ProvinceId entity. @author MyEclipse Persistence Tools
 */

public class ProvinceId implements java.io.Serializable {

	// Fields

	private String nationno;
	private String provinceno;

	// Constructors

	/** default constructor */
	public ProvinceId() {
	}

	/** full constructor */
	public ProvinceId(String nationno, String provinceno) {
		this.nationno = nationno;
		this.provinceno = provinceno;
	}

	// Property accessors

	public String getNationno() {
		return this.nationno;
	}

	public void setNationno(String nationno) {
		this.nationno = nationno;
	}

	public String getProvinceno() {
		return this.provinceno;
	}

	public void setProvinceno(String provinceno) {
		this.provinceno = provinceno;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProvinceId))
			return false;
		ProvinceId castOther = (ProvinceId) other;

		return ((this.getNationno() == castOther.getNationno()) || (this
				.getNationno() != null && castOther.getNationno() != null && this
				.getNationno().equals(castOther.getNationno())))
				&& ((this.getProvinceno() == castOther.getProvinceno()) || (this
						.getProvinceno() != null
						&& castOther.getProvinceno() != null && this
						.getProvinceno().equals(castOther.getProvinceno())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNationno() == null ? 0 : this.getNationno().hashCode());
		result = 37
				* result
				+ (getProvinceno() == null ? 0 : this.getProvinceno()
						.hashCode());
		return result;
	}

}