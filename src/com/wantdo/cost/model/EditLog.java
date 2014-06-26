package com.wantdo.cost.model;

/**
 * EditLog entity. @author MyEclipse Persistence Tools
 */

public class EditLog implements java.io.Serializable {

	// Fields

	private Integer logid;
	private String username;
	private String class_;
	private String mothod;
	private String createtime;
	private String loglevel;
	private String msg;

	// Constructors

	/** default constructor */
	public EditLog() {
	}

	/** full constructor */
	public EditLog(String username, String class_, String mothod,
			String createtime, String loglevel, String msg) {
		this.username = username;
		this.class_ = class_;
		this.mothod = mothod;
		this.createtime = createtime;
		this.loglevel = loglevel;
		this.msg = msg;
	}

	// Property accessors

	public Integer getLogid() {
		return this.logid;
	}

	public void setLogid(Integer logid) {
		this.logid = logid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getMothod() {
		return this.mothod;
	}

	public void setMothod(String mothod) {
		this.mothod = mothod;
	}

	public String getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getLoglevel() {
		return this.loglevel;
	}

	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}