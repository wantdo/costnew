package com.wantdo.cost.model;

import java.sql.Timestamp;

/**
 * WspOrdermst entity. @author MyEclipse Persistence Tools
 */

public class WspOrdermst implements java.io.Serializable {

	// Fields

	private String mstid;
	private Integer sysid;
	private Integer shopid;
	private Timestamp recorddate;
	private String ordstatus;
	private String remarks;
	private String sellerremarks;
	private String tranno;
	private String relid;
	private String ordtype;
	private String prono;
	private String city;
	private String region;
	private String recaddr;
	private String linktel;
	private String handset;
	private String zipcode;
	private String linkman;
	private String shipcomp;
	private Double ordersum;
	private Double shopdisc;
	private Double sysdisc;
	private Double orderpaysum;
	private Double orderfee;
	private String payplat;
	private String membername;
	private String memberid;
	private String billtype;
	private String billtitle;
	private String billcontent;
	private Double billamount;
	private String istran;
	private String transnapshot;
	private String email;
	private Timestamp orderdate;
	private String buyerremarks;
	private String sendtype;
	private String deleteflag;
	private String hdflag;
	private Double couponsum;
	private Timestamp verdtm;
	private String distributortype;
	private String sourceopt;
	private String distributorid;
	private String dealerflag;
	private String distributorname;
	private String sendsite;
	private String attachment;
	private String billcompany;
	private Double ordershouldpay;

	// Constructors

	/** default constructor */
	public WspOrdermst() {
	}

	/** full constructor */
	public WspOrdermst(Integer sysid, Integer shopid, Timestamp recorddate,
			String ordstatus, String remarks, String sellerremarks,
			String tranno, String relid, String ordtype, String prono,
			String city, String region, String recaddr, String linktel,
			String handset, String zipcode, String linkman, String shipcomp,
			Double ordersum, Double shopdisc, Double sysdisc,
			Double orderpaysum, Double orderfee, String payplat,
			String membername, String memberid, String billtype,
			String billtitle, String billcontent, Double billamount,
			String istran, String transnapshot, String email,
			Timestamp orderdate, String buyerremarks, String sendtype,
			String deleteflag, String hdflag, Double couponsum,
			Timestamp verdtm, String distributortype, String sourceopt,
			String distributorid, String dealerflag, String distributorname,
			String sendsite, String attachment, String billcompany,
			Double ordershouldpay) {
		this.sysid = sysid;
		this.shopid = shopid;
		this.recorddate = recorddate;
		this.ordstatus = ordstatus;
		this.remarks = remarks;
		this.sellerremarks = sellerremarks;
		this.tranno = tranno;
		this.relid = relid;
		this.ordtype = ordtype;
		this.prono = prono;
		this.city = city;
		this.region = region;
		this.recaddr = recaddr;
		this.linktel = linktel;
		this.handset = handset;
		this.zipcode = zipcode;
		this.linkman = linkman;
		this.shipcomp = shipcomp;
		this.ordersum = ordersum;
		this.shopdisc = shopdisc;
		this.sysdisc = sysdisc;
		this.orderpaysum = orderpaysum;
		this.orderfee = orderfee;
		this.payplat = payplat;
		this.membername = membername;
		this.memberid = memberid;
		this.billtype = billtype;
		this.billtitle = billtitle;
		this.billcontent = billcontent;
		this.billamount = billamount;
		this.istran = istran;
		this.transnapshot = transnapshot;
		this.email = email;
		this.orderdate = orderdate;
		this.buyerremarks = buyerremarks;
		this.sendtype = sendtype;
		this.deleteflag = deleteflag;
		this.hdflag = hdflag;
		this.couponsum = couponsum;
		this.verdtm = verdtm;
		this.distributortype = distributortype;
		this.sourceopt = sourceopt;
		this.distributorid = distributorid;
		this.dealerflag = dealerflag;
		this.distributorname = distributorname;
		this.sendsite = sendsite;
		this.attachment = attachment;
		this.billcompany = billcompany;
		this.ordershouldpay = ordershouldpay;
	}

	// Property accessors

	public String getMstid() {
		return this.mstid;
	}

	public void setMstid(String mstid) {
		this.mstid = mstid;
	}

	public Integer getSysid() {
		return this.sysid;
	}

	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

	public Integer getShopid() {
		return this.shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public Timestamp getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}

	public String getOrdstatus() {
		return this.ordstatus;
	}

	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSellerremarks() {
		return this.sellerremarks;
	}

	public void setSellerremarks(String sellerremarks) {
		this.sellerremarks = sellerremarks;
	}

	public String getTranno() {
		return this.tranno;
	}

	public void setTranno(String tranno) {
		this.tranno = tranno;
	}

	public String getRelid() {
		return this.relid;
	}

	public void setRelid(String relid) {
		this.relid = relid;
	}

	public String getOrdtype() {
		return this.ordtype;
	}

	public void setOrdtype(String ordtype) {
		this.ordtype = ordtype;
	}

	public String getProno() {
		return this.prono;
	}

	public void setProno(String prono) {
		this.prono = prono;
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

	public String getRecaddr() {
		return this.recaddr;
	}

	public void setRecaddr(String recaddr) {
		this.recaddr = recaddr;
	}

	public String getLinktel() {
		return this.linktel;
	}

	public void setLinktel(String linktel) {
		this.linktel = linktel;
	}

	public String getHandset() {
		return this.handset;
	}

	public void setHandset(String handset) {
		this.handset = handset;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getShipcomp() {
		return this.shipcomp;
	}

	public void setShipcomp(String shipcomp) {
		this.shipcomp = shipcomp;
	}

	public Double getOrdersum() {
		return this.ordersum;
	}

	public void setOrdersum(Double ordersum) {
		this.ordersum = ordersum;
	}

	public Double getShopdisc() {
		return this.shopdisc;
	}

	public void setShopdisc(Double shopdisc) {
		this.shopdisc = shopdisc;
	}

	public Double getSysdisc() {
		return this.sysdisc;
	}

	public void setSysdisc(Double sysdisc) {
		this.sysdisc = sysdisc;
	}

	public Double getOrderpaysum() {
		return this.orderpaysum;
	}

	public void setOrderpaysum(Double orderpaysum) {
		this.orderpaysum = orderpaysum;
	}

	public Double getOrderfee() {
		return this.orderfee;
	}

	public void setOrderfee(Double orderfee) {
		this.orderfee = orderfee;
	}

	public String getPayplat() {
		return this.payplat;
	}

	public void setPayplat(String payplat) {
		this.payplat = payplat;
	}

	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberid() {
		return this.memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getBilltype() {
		return this.billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
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

	public Double getBillamount() {
		return this.billamount;
	}

	public void setBillamount(Double billamount) {
		this.billamount = billamount;
	}

	public String getIstran() {
		return this.istran;
	}

	public void setIstran(String istran) {
		this.istran = istran;
	}

	public String getTransnapshot() {
		return this.transnapshot;
	}

	public void setTransnapshot(String transnapshot) {
		this.transnapshot = transnapshot;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}

	public String getBuyerremarks() {
		return this.buyerremarks;
	}

	public void setBuyerremarks(String buyerremarks) {
		this.buyerremarks = buyerremarks;
	}

	public String getSendtype() {
		return this.sendtype;
	}

	public void setSendtype(String sendtype) {
		this.sendtype = sendtype;
	}

	public String getDeleteflag() {
		return this.deleteflag;
	}

	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}

	public String getHdflag() {
		return this.hdflag;
	}

	public void setHdflag(String hdflag) {
		this.hdflag = hdflag;
	}

	public Double getCouponsum() {
		return this.couponsum;
	}

	public void setCouponsum(Double couponsum) {
		this.couponsum = couponsum;
	}

	public Timestamp getVerdtm() {
		return this.verdtm;
	}

	public void setVerdtm(Timestamp verdtm) {
		this.verdtm = verdtm;
	}

	public String getDistributortype() {
		return this.distributortype;
	}

	public void setDistributortype(String distributortype) {
		this.distributortype = distributortype;
	}

	public String getSourceopt() {
		return this.sourceopt;
	}

	public void setSourceopt(String sourceopt) {
		this.sourceopt = sourceopt;
	}

	public String getDistributorid() {
		return this.distributorid;
	}

	public void setDistributorid(String distributorid) {
		this.distributorid = distributorid;
	}

	public String getDealerflag() {
		return this.dealerflag;
	}

	public void setDealerflag(String dealerflag) {
		this.dealerflag = dealerflag;
	}

	public String getDistributorname() {
		return this.distributorname;
	}

	public void setDistributorname(String distributorname) {
		this.distributorname = distributorname;
	}

	public String getSendsite() {
		return this.sendsite;
	}

	public void setSendsite(String sendsite) {
		this.sendsite = sendsite;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getBillcompany() {
		return this.billcompany;
	}

	public void setBillcompany(String billcompany) {
		this.billcompany = billcompany;
	}

	public Double getOrdershouldpay() {
		return this.ordershouldpay;
	}

	public void setOrdershouldpay(Double ordershouldpay) {
		this.ordershouldpay = ordershouldpay;
	}

}