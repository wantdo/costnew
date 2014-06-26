package com.wantdo.cost.model;

/**
 * WspShops entity. @author MyEclipse Persistence Tools
 */

public class WspShops implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer sysid;
	private String shopname;
	private String url;
	private String appkey;
	private String secret;
	private String loginname;
	private String linkman;
	private String telephone;
	private String itemlistid;
	private String ordersource;
	private String ordertype;
	private String ocode;
	private String deptno;
	private String empno;
	private String operator;
	private String huikuantype;
	private String billtype;
	private String customsource;
	private String customtype;
	private String customgroup;
	private String inventoryrate;
	private String ordercomp;
	private String cellphone;
	private String zipcode;
	private String recaddr;
	private String deliveraddr;
	private String province;
	private String city;
	private String region;
	private String billtitle;
	private String billcontent;
	private Integer uin;
	private String secKey;
	private String customno;
	private String logistic;
	private String shopid;
	private String sessionKey;
	private String logistictype;
	private String isnotback;
	private String isenable;
	private String hdlogistic;
	private String dealerflag;
	private String refreshtoken;

	// Constructors

	/** default constructor */
	public WspShops() {
	}

	/** full constructor */
	public WspShops(Integer sysid, String shopname, String url, String appkey,
			String secret, String loginname, String linkman, String telephone,
			String itemlistid, String ordersource, String ordertype,
			String ocode, String deptno, String empno, String operator,
			String huikuantype, String billtype, String customsource,
			String customtype, String customgroup, String inventoryrate,
			String ordercomp, String cellphone, String zipcode, String recaddr,
			String deliveraddr, String province, String city, String region,
			String billtitle, String billcontent, Integer uin, String secKey,
			String customno, String logistic, String shopid, String sessionKey,
			String logistictype, String isnotback, String isenable,
			String hdlogistic, String dealerflag, String refreshtoken) {
		this.sysid = sysid;
		this.shopname = shopname;
		this.url = url;
		this.appkey = appkey;
		this.secret = secret;
		this.loginname = loginname;
		this.linkman = linkman;
		this.telephone = telephone;
		this.itemlistid = itemlistid;
		this.ordersource = ordersource;
		this.ordertype = ordertype;
		this.ocode = ocode;
		this.deptno = deptno;
		this.empno = empno;
		this.operator = operator;
		this.huikuantype = huikuantype;
		this.billtype = billtype;
		this.customsource = customsource;
		this.customtype = customtype;
		this.customgroup = customgroup;
		this.inventoryrate = inventoryrate;
		this.ordercomp = ordercomp;
		this.cellphone = cellphone;
		this.zipcode = zipcode;
		this.recaddr = recaddr;
		this.deliveraddr = deliveraddr;
		this.province = province;
		this.city = city;
		this.region = region;
		this.billtitle = billtitle;
		this.billcontent = billcontent;
		this.uin = uin;
		this.secKey = secKey;
		this.customno = customno;
		this.logistic = logistic;
		this.shopid = shopid;
		this.sessionKey = sessionKey;
		this.logistictype = logistictype;
		this.isnotback = isnotback;
		this.isenable = isenable;
		this.hdlogistic = hdlogistic;
		this.dealerflag = dealerflag;
		this.refreshtoken = refreshtoken;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSysid() {
		return this.sysid;
	}

	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

	public String getShopname() {
		return this.shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getItemlistid() {
		return this.itemlistid;
	}

	public void setItemlistid(String itemlistid) {
		this.itemlistid = itemlistid;
	}

	public String getOrdersource() {
		return this.ordersource;
	}

	public void setOrdersource(String ordersource) {
		this.ordersource = ordersource;
	}

	public String getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getOcode() {
		return this.ocode;
	}

	public void setOcode(String ocode) {
		this.ocode = ocode;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getEmpno() {
		return this.empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getHuikuantype() {
		return this.huikuantype;
	}

	public void setHuikuantype(String huikuantype) {
		this.huikuantype = huikuantype;
	}

	public String getBilltype() {
		return this.billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getCustomsource() {
		return this.customsource;
	}

	public void setCustomsource(String customsource) {
		this.customsource = customsource;
	}

	public String getCustomtype() {
		return this.customtype;
	}

	public void setCustomtype(String customtype) {
		this.customtype = customtype;
	}

	public String getCustomgroup() {
		return this.customgroup;
	}

	public void setCustomgroup(String customgroup) {
		this.customgroup = customgroup;
	}

	public String getInventoryrate() {
		return this.inventoryrate;
	}

	public void setInventoryrate(String inventoryrate) {
		this.inventoryrate = inventoryrate;
	}

	public String getOrdercomp() {
		return this.ordercomp;
	}

	public void setOrdercomp(String ordercomp) {
		this.ordercomp = ordercomp;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRecaddr() {
		return this.recaddr;
	}

	public void setRecaddr(String recaddr) {
		this.recaddr = recaddr;
	}

	public String getDeliveraddr() {
		return this.deliveraddr;
	}

	public void setDeliveraddr(String deliveraddr) {
		this.deliveraddr = deliveraddr;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getBilltitle() {
		return this.billtitle;
	}

	public void setBilltitle(String billtitle) {
		this.billtitle = billtitle;
	}

	public String getBillcontent() {
		return this.billcontent;
	}

	public void setBillcontent(String billcontent) {
		this.billcontent = billcontent;
	}

	public Integer getUin() {
		return this.uin;
	}

	public void setUin(Integer uin) {
		this.uin = uin;
	}

	public String getSecKey() {
		return this.secKey;
	}

	public void setSecKey(String secKey) {
		this.secKey = secKey;
	}

	public String getCustomno() {
		return this.customno;
	}

	public void setCustomno(String customno) {
		this.customno = customno;
	}

	public String getLogistic() {
		return this.logistic;
	}

	public void setLogistic(String logistic) {
		this.logistic = logistic;
	}

	public String getShopid() {
		return this.shopid;
	}

	public void setShopid(String shopid) {
		this.shopid = shopid;
	}

	public String getSessionKey() {
		return this.sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getLogistictype() {
		return this.logistictype;
	}

	public void setLogistictype(String logistictype) {
		this.logistictype = logistictype;
	}

	public String getIsnotback() {
		return this.isnotback;
	}

	public void setIsnotback(String isnotback) {
		this.isnotback = isnotback;
	}

	public String getIsenable() {
		return this.isenable;
	}

	public void setIsenable(String isenable) {
		this.isenable = isenable;
	}

	public String getHdlogistic() {
		return this.hdlogistic;
	}

	public void setHdlogistic(String hdlogistic) {
		this.hdlogistic = hdlogistic;
	}

	public String getDealerflag() {
		return this.dealerflag;
	}

	public void setDealerflag(String dealerflag) {
		this.dealerflag = dealerflag;
	}

	public String getRefreshtoken() {
		return this.refreshtoken;
	}

	public void setRefreshtoken(String refreshtoken) {
		this.refreshtoken = refreshtoken;
	}

}