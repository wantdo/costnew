package com.wantdo.cost.model;

import java.sql.Timestamp;

/**
 * EcEordermst entity. @author MyEclipse Persistence Tools
 */

public class EcEordermst implements java.io.Serializable {

	// Fields

	private String orderid;
	private String orderno;
	private String contractno;
	private String contractid;
	private Timestamp recorddate;
	private String recordman;
	private String ordercomp;
	private String ocode;
	private String rundept;
	private String runemp;
	private Double ordhwsum;
	private Double ordersum;
	private Double orderdisc;
	private String ordertype;
	private String salepre;
	private String payway;
	private String reccomp;
	private String recaddr;
	private String paycomp;
	private Short appflg;
	private String appman;
	private Timestamp appdate;
	private String deliveraddr;
	private Timestamp deliverdate;
	private Timestamp effectdate;
	private Short priceget;
	private String quottno;
	private Short disctype;
	private Double discrate;
	private Short layflg;
	private Short printflg;
	private Short sendflg;
	private Short minvflg;
	private Short overflg;
	private Short recflg;
	private Short cancelflg;
	private Double sendsum;
	private Double invsum;
	private String curtype;
	private Double exchgrate;
	private Double fordhwsum;
	private Double fordersum;
	private Double forderdisc;
	private Double fsendsum;
	private Double finvsum;
	private String remarks;
	private Short ordstatus;
	private String salechannel;
	private String saletype;
	private Double ordsecsum;
	private Double fordsecsum;
	private Short disdata;
	private Timestamp verdtm;
	private String usercomp;
	private String username;
	private String orderpri;
	private String custocode;
	private String relreqid;
	private Double lastsum;
	private Double flastsum;
	private Short convflg;
	private String docfrom;
	private String relid;
	private String relno;
	private String baseinfo;
	private String specinfo;
	private String chantype;
	private String accocode;
	private Timestamp fallindate;
	private String region;
	private Double specialsum;
	private Double specialapplysum;
	private Double moveupsum;
	private Double moveupordersum;
	private Double addsum;
	private Double addordersum;
	private String eorderprop;
	private Double pactrebate;
	private String remarkss;
	private String sendaddrtype;
	private String appinfo;
	private String appremarks;
	private Integer wspuserid;
	private String ngappflg;
	private Double forderfee;
	private Double orderfee;
	private String paylinkman;
	private String paylinktel;
	private String paycompany;
	private String payaddress;
	private String paytaxno;
	private String paybankno;
	private String attrgrpid;
	private Double owerate;
	private String shiptype;
	private String prdtgroup;
	private Double permoney;
	private Double totalqty;
	private Double totalfqty;
	private Integer paymenttype;
	private Double ordersumjf;
	private Double returnjf;
	private Timestamp paydate;
	private Integer orderqty;
	private Double orderjf;
	private String supplyno;
	private String zipcode;
	private String shipcomp;
	private String linkman;
	private String linktel;
	private String handset;
	private Integer epayway;
	private String jddeliverytype;
	private String jdsendersite;
	private String jdnoticebefore;
	private String jdstockcenter;
	private String jdpayway;
	private String telephone;
	private String mobilephone;
	private String billtitle;
	private Double billamount;
	private String billtype;
	private String billcontent;
	private String apportionflg;
	private String city;
	private String province;
	private Integer payflag;
	private String groupno;
	private String deleteflag;
	private Timestamp deletedate;
	private String hangflag;
	private String customflag;
	private String nation;
	private String county;
	private String paynation;
	private String payprovince;
	private String paycity;
	private String paycounty;
	private String payzipcode;
	private String payhandset;
	private Integer payid;
	private String payname;
	private Integer dtId;
	private String dtName;
	private Double price;
	private Double reduceamount;
	private String buyerremarks;
	private String sellerremarks;
	private Timestamp relcreatetime;
	private Integer onecode;
	private Integer shopid;
	private String sysid;
	private String cityregion;
	private Double fee;
	private Integer payplatformid;
	private String anaylsisflg;
	private Timestamp orderdate;
	private String lackflg;
	private String traceno;
	private String defwhouse;
	private String packitemno;
	private String packattrvalid;
	private String buyerid;
	private String buyernick;
	private Timestamp printdate;
	private Timestamp stocktime;
	private String printman;
	private String appmanname;
	private String printmanname;
	private String stockflg;
	private Timestamp stockdate;
	private Integer printcount;
	private String sendman;
	private Timestamp sendtime;
	private String hdflag;
	private String exportflag;
	private String issetseries;
	private Short eprintflg;
	private String eprintman;
	private String eprintmanname;
	private Integer eprintcount;
	private Timestamp eprintdate;
	private String transman;
	private String iswritebackflg;
	private String validflag;
	private String dealerflag;
	private String splitflag;
	private String mergeflag;
	private String sourceopt;
	private Double couponsum;
	private String orderfrom;
	private Integer distributorid;
	private String distributornick;
	private String sendsite;
	private String sendtype;
	private String returnflag;
	private String orderconfirm;
	private String logisticconfirm;
	private Double actualorderfee;
	private String defshelf;
	private String supplierno;
	private String purchaseflag;
	private String printexportflag;
	private String goodsendtype;
	private String attachment;
	private String billcompany;
	private Double ordershouldpay;
	private Double platformdisc;

	// Constructors

	/** default constructor */
	public EcEordermst() {
	}

	/** full constructor */
	public EcEordermst(String orderno, String contractno, String contractid,
			Timestamp recorddate, String recordman, String ordercomp,
			String ocode, String rundept, String runemp, Double ordhwsum,
			Double ordersum, Double orderdisc, String ordertype,
			String salepre, String payway, String reccomp, String recaddr,
			String paycomp, Short appflg, String appman, Timestamp appdate,
			String deliveraddr, Timestamp deliverdate, Timestamp effectdate,
			Short priceget, String quottno, Short disctype, Double discrate,
			Short layflg, Short printflg, Short sendflg, Short minvflg,
			Short overflg, Short recflg, Short cancelflg, Double sendsum,
			Double invsum, String curtype, Double exchgrate, Double fordhwsum,
			Double fordersum, Double forderdisc, Double fsendsum,
			Double finvsum, String remarks, Short ordstatus,
			String salechannel, String saletype, Double ordsecsum,
			Double fordsecsum, Short disdata, Timestamp verdtm,
			String usercomp, String username, String orderpri,
			String custocode, String relreqid, Double lastsum, Double flastsum,
			Short convflg, String docfrom, String relid, String relno,
			String baseinfo, String specinfo, String chantype, String accocode,
			Timestamp fallindate, String region, Double specialsum,
			Double specialapplysum, Double moveupsum, Double moveupordersum,
			Double addsum, Double addordersum, String eorderprop,
			Double pactrebate, String remarkss, String sendaddrtype,
			String appinfo, String appremarks, Integer wspuserid,
			String ngappflg, Double forderfee, Double orderfee,
			String paylinkman, String paylinktel, String paycompany,
			String payaddress, String paytaxno, String paybankno,
			String attrgrpid, Double owerate, String shiptype,
			String prdtgroup, Double permoney, Double totalqty,
			Double totalfqty, Integer paymenttype, Double ordersumjf,
			Double returnjf, Timestamp paydate, Integer orderqty,
			Double orderjf, String supplyno, String zipcode, String shipcomp,
			String linkman, String linktel, String handset, Integer epayway,
			String jddeliverytype, String jdsendersite, String jdnoticebefore,
			String jdstockcenter, String jdpayway, String telephone,
			String mobilephone, String billtitle, Double billamount,
			String billtype, String billcontent, String apportionflg,
			String city, String province, Integer payflag, String groupno,
			String deleteflag, Timestamp deletedate, String hangflag,
			String customflag, String nation, String county, String paynation,
			String payprovince, String paycity, String paycounty,
			String payzipcode, String payhandset, Integer payid,
			String payname, Integer dtId, String dtName, Double price,
			Double reduceamount, String buyerremarks, String sellerremarks,
			Timestamp relcreatetime, Integer onecode, Integer shopid,
			String sysid, String cityregion, Double fee, Integer payplatformid,
			String anaylsisflg, Timestamp orderdate, String lackflg,
			String traceno, String defwhouse, String packitemno,
			String packattrvalid, String buyerid, String buyernick,
			Timestamp printdate, Timestamp stocktime, String printman,
			String appmanname, String printmanname, String stockflg,
			Timestamp stockdate, Integer printcount, String sendman,
			Timestamp sendtime, String hdflag, String exportflag,
			String issetseries, Short eprintflg, String eprintman,
			String eprintmanname, Integer eprintcount, Timestamp eprintdate,
			String transman, String iswritebackflg, String validflag,
			String dealerflag, String splitflag, String mergeflag,
			String sourceopt, Double couponsum, String orderfrom,
			Integer distributorid, String distributornick, String sendsite,
			String sendtype, String returnflag, String orderconfirm,
			String logisticconfirm, Double actualorderfee, String defshelf,
			String supplierno, String purchaseflag, String printexportflag,
			String goodsendtype, String attachment, String billcompany,
			Double ordershouldpay, Double platformdisc) {
		this.orderno = orderno;
		this.contractno = contractno;
		this.contractid = contractid;
		this.recorddate = recorddate;
		this.recordman = recordman;
		this.ordercomp = ordercomp;
		this.ocode = ocode;
		this.rundept = rundept;
		this.runemp = runemp;
		this.ordhwsum = ordhwsum;
		this.ordersum = ordersum;
		this.orderdisc = orderdisc;
		this.ordertype = ordertype;
		this.salepre = salepre;
		this.payway = payway;
		this.reccomp = reccomp;
		this.recaddr = recaddr;
		this.paycomp = paycomp;
		this.appflg = appflg;
		this.appman = appman;
		this.appdate = appdate;
		this.deliveraddr = deliveraddr;
		this.deliverdate = deliverdate;
		this.effectdate = effectdate;
		this.priceget = priceget;
		this.quottno = quottno;
		this.disctype = disctype;
		this.discrate = discrate;
		this.layflg = layflg;
		this.printflg = printflg;
		this.sendflg = sendflg;
		this.minvflg = minvflg;
		this.overflg = overflg;
		this.recflg = recflg;
		this.cancelflg = cancelflg;
		this.sendsum = sendsum;
		this.invsum = invsum;
		this.curtype = curtype;
		this.exchgrate = exchgrate;
		this.fordhwsum = fordhwsum;
		this.fordersum = fordersum;
		this.forderdisc = forderdisc;
		this.fsendsum = fsendsum;
		this.finvsum = finvsum;
		this.remarks = remarks;
		this.ordstatus = ordstatus;
		this.salechannel = salechannel;
		this.saletype = saletype;
		this.ordsecsum = ordsecsum;
		this.fordsecsum = fordsecsum;
		this.disdata = disdata;
		this.verdtm = verdtm;
		this.usercomp = usercomp;
		this.username = username;
		this.orderpri = orderpri;
		this.custocode = custocode;
		this.relreqid = relreqid;
		this.lastsum = lastsum;
		this.flastsum = flastsum;
		this.convflg = convflg;
		this.docfrom = docfrom;
		this.relid = relid;
		this.relno = relno;
		this.baseinfo = baseinfo;
		this.specinfo = specinfo;
		this.chantype = chantype;
		this.accocode = accocode;
		this.fallindate = fallindate;
		this.region = region;
		this.specialsum = specialsum;
		this.specialapplysum = specialapplysum;
		this.moveupsum = moveupsum;
		this.moveupordersum = moveupordersum;
		this.addsum = addsum;
		this.addordersum = addordersum;
		this.eorderprop = eorderprop;
		this.pactrebate = pactrebate;
		this.remarkss = remarkss;
		this.sendaddrtype = sendaddrtype;
		this.appinfo = appinfo;
		this.appremarks = appremarks;
		this.wspuserid = wspuserid;
		this.ngappflg = ngappflg;
		this.forderfee = forderfee;
		this.orderfee = orderfee;
		this.paylinkman = paylinkman;
		this.paylinktel = paylinktel;
		this.paycompany = paycompany;
		this.payaddress = payaddress;
		this.paytaxno = paytaxno;
		this.paybankno = paybankno;
		this.attrgrpid = attrgrpid;
		this.owerate = owerate;
		this.shiptype = shiptype;
		this.prdtgroup = prdtgroup;
		this.permoney = permoney;
		this.totalqty = totalqty;
		this.totalfqty = totalfqty;
		this.paymenttype = paymenttype;
		this.ordersumjf = ordersumjf;
		this.returnjf = returnjf;
		this.paydate = paydate;
		this.orderqty = orderqty;
		this.orderjf = orderjf;
		this.supplyno = supplyno;
		this.zipcode = zipcode;
		this.shipcomp = shipcomp;
		this.linkman = linkman;
		this.linktel = linktel;
		this.handset = handset;
		this.epayway = epayway;
		this.jddeliverytype = jddeliverytype;
		this.jdsendersite = jdsendersite;
		this.jdnoticebefore = jdnoticebefore;
		this.jdstockcenter = jdstockcenter;
		this.jdpayway = jdpayway;
		this.telephone = telephone;
		this.mobilephone = mobilephone;
		this.billtitle = billtitle;
		this.billamount = billamount;
		this.billtype = billtype;
		this.billcontent = billcontent;
		this.apportionflg = apportionflg;
		this.city = city;
		this.province = province;
		this.payflag = payflag;
		this.groupno = groupno;
		this.deleteflag = deleteflag;
		this.deletedate = deletedate;
		this.hangflag = hangflag;
		this.customflag = customflag;
		this.nation = nation;
		this.county = county;
		this.paynation = paynation;
		this.payprovince = payprovince;
		this.paycity = paycity;
		this.paycounty = paycounty;
		this.payzipcode = payzipcode;
		this.payhandset = payhandset;
		this.payid = payid;
		this.payname = payname;
		this.dtId = dtId;
		this.dtName = dtName;
		this.price = price;
		this.reduceamount = reduceamount;
		this.buyerremarks = buyerremarks;
		this.sellerremarks = sellerremarks;
		this.relcreatetime = relcreatetime;
		this.onecode = onecode;
		this.shopid = shopid;
		this.sysid = sysid;
		this.cityregion = cityregion;
		this.fee = fee;
		this.payplatformid = payplatformid;
		this.anaylsisflg = anaylsisflg;
		this.orderdate = orderdate;
		this.lackflg = lackflg;
		this.traceno = traceno;
		this.defwhouse = defwhouse;
		this.packitemno = packitemno;
		this.packattrvalid = packattrvalid;
		this.buyerid = buyerid;
		this.buyernick = buyernick;
		this.printdate = printdate;
		this.stocktime = stocktime;
		this.printman = printman;
		this.appmanname = appmanname;
		this.printmanname = printmanname;
		this.stockflg = stockflg;
		this.stockdate = stockdate;
		this.printcount = printcount;
		this.sendman = sendman;
		this.sendtime = sendtime;
		this.hdflag = hdflag;
		this.exportflag = exportflag;
		this.issetseries = issetseries;
		this.eprintflg = eprintflg;
		this.eprintman = eprintman;
		this.eprintmanname = eprintmanname;
		this.eprintcount = eprintcount;
		this.eprintdate = eprintdate;
		this.transman = transman;
		this.iswritebackflg = iswritebackflg;
		this.validflag = validflag;
		this.dealerflag = dealerflag;
		this.splitflag = splitflag;
		this.mergeflag = mergeflag;
		this.sourceopt = sourceopt;
		this.couponsum = couponsum;
		this.orderfrom = orderfrom;
		this.distributorid = distributorid;
		this.distributornick = distributornick;
		this.sendsite = sendsite;
		this.sendtype = sendtype;
		this.returnflag = returnflag;
		this.orderconfirm = orderconfirm;
		this.logisticconfirm = logisticconfirm;
		this.actualorderfee = actualorderfee;
		this.defshelf = defshelf;
		this.supplierno = supplierno;
		this.purchaseflag = purchaseflag;
		this.printexportflag = printexportflag;
		this.goodsendtype = goodsendtype;
		this.attachment = attachment;
		this.billcompany = billcompany;
		this.ordershouldpay = ordershouldpay;
		this.platformdisc = platformdisc;
	}

	// Property accessors

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOrderno() {
		return this.orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getContractno() {
		return this.contractno;
	}

	public void setContractno(String contractno) {
		this.contractno = contractno;
	}

	public String getContractid() {
		return this.contractid;
	}

	public void setContractid(String contractid) {
		this.contractid = contractid;
	}

	public Timestamp getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Timestamp recorddate) {
		this.recorddate = recorddate;
	}

	public String getRecordman() {
		return this.recordman;
	}

	public void setRecordman(String recordman) {
		this.recordman = recordman;
	}

	public String getOrdercomp() {
		return this.ordercomp;
	}

	public void setOrdercomp(String ordercomp) {
		this.ordercomp = ordercomp;
	}

	public String getOcode() {
		return this.ocode;
	}

	public void setOcode(String ocode) {
		this.ocode = ocode;
	}

	public String getRundept() {
		return this.rundept;
	}

	public void setRundept(String rundept) {
		this.rundept = rundept;
	}

	public String getRunemp() {
		return this.runemp;
	}

	public void setRunemp(String runemp) {
		this.runemp = runemp;
	}

	public Double getOrdhwsum() {
		return this.ordhwsum;
	}

	public void setOrdhwsum(Double ordhwsum) {
		this.ordhwsum = ordhwsum;
	}

	public Double getOrdersum() {
		return this.ordersum;
	}

	public void setOrdersum(Double ordersum) {
		this.ordersum = ordersum;
	}

	public Double getOrderdisc() {
		return this.orderdisc;
	}

	public void setOrderdisc(Double orderdisc) {
		this.orderdisc = orderdisc;
	}

	public String getOrdertype() {
		return this.ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public String getSalepre() {
		return this.salepre;
	}

	public void setSalepre(String salepre) {
		this.salepre = salepre;
	}

	public String getPayway() {
		return this.payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getReccomp() {
		return this.reccomp;
	}

	public void setReccomp(String reccomp) {
		this.reccomp = reccomp;
	}

	public String getRecaddr() {
		return this.recaddr;
	}

	public void setRecaddr(String recaddr) {
		this.recaddr = recaddr;
	}

	public String getPaycomp() {
		return this.paycomp;
	}

	public void setPaycomp(String paycomp) {
		this.paycomp = paycomp;
	}

	public Short getAppflg() {
		return this.appflg;
	}

	public void setAppflg(Short appflg) {
		this.appflg = appflg;
	}

	public String getAppman() {
		return this.appman;
	}

	public void setAppman(String appman) {
		this.appman = appman;
	}

	public Timestamp getAppdate() {
		return this.appdate;
	}

	public void setAppdate(Timestamp appdate) {
		this.appdate = appdate;
	}

	public String getDeliveraddr() {
		return this.deliveraddr;
	}

	public void setDeliveraddr(String deliveraddr) {
		this.deliveraddr = deliveraddr;
	}

	public Timestamp getDeliverdate() {
		return this.deliverdate;
	}

	public void setDeliverdate(Timestamp deliverdate) {
		this.deliverdate = deliverdate;
	}

	public Timestamp getEffectdate() {
		return this.effectdate;
	}

	public void setEffectdate(Timestamp effectdate) {
		this.effectdate = effectdate;
	}

	public Short getPriceget() {
		return this.priceget;
	}

	public void setPriceget(Short priceget) {
		this.priceget = priceget;
	}

	public String getQuottno() {
		return this.quottno;
	}

	public void setQuottno(String quottno) {
		this.quottno = quottno;
	}

	public Short getDisctype() {
		return this.disctype;
	}

	public void setDisctype(Short disctype) {
		this.disctype = disctype;
	}

	public Double getDiscrate() {
		return this.discrate;
	}

	public void setDiscrate(Double discrate) {
		this.discrate = discrate;
	}

	public Short getLayflg() {
		return this.layflg;
	}

	public void setLayflg(Short layflg) {
		this.layflg = layflg;
	}

	public Short getPrintflg() {
		return this.printflg;
	}

	public void setPrintflg(Short printflg) {
		this.printflg = printflg;
	}

	public Short getSendflg() {
		return this.sendflg;
	}

	public void setSendflg(Short sendflg) {
		this.sendflg = sendflg;
	}

	public Short getMinvflg() {
		return this.minvflg;
	}

	public void setMinvflg(Short minvflg) {
		this.minvflg = minvflg;
	}

	public Short getOverflg() {
		return this.overflg;
	}

	public void setOverflg(Short overflg) {
		this.overflg = overflg;
	}

	public Short getRecflg() {
		return this.recflg;
	}

	public void setRecflg(Short recflg) {
		this.recflg = recflg;
	}

	public Short getCancelflg() {
		return this.cancelflg;
	}

	public void setCancelflg(Short cancelflg) {
		this.cancelflg = cancelflg;
	}

	public Double getSendsum() {
		return this.sendsum;
	}

	public void setSendsum(Double sendsum) {
		this.sendsum = sendsum;
	}

	public Double getInvsum() {
		return this.invsum;
	}

	public void setInvsum(Double invsum) {
		this.invsum = invsum;
	}

	public String getCurtype() {
		return this.curtype;
	}

	public void setCurtype(String curtype) {
		this.curtype = curtype;
	}

	public Double getExchgrate() {
		return this.exchgrate;
	}

	public void setExchgrate(Double exchgrate) {
		this.exchgrate = exchgrate;
	}

	public Double getFordhwsum() {
		return this.fordhwsum;
	}

	public void setFordhwsum(Double fordhwsum) {
		this.fordhwsum = fordhwsum;
	}

	public Double getFordersum() {
		return this.fordersum;
	}

	public void setFordersum(Double fordersum) {
		this.fordersum = fordersum;
	}

	public Double getForderdisc() {
		return this.forderdisc;
	}

	public void setForderdisc(Double forderdisc) {
		this.forderdisc = forderdisc;
	}

	public Double getFsendsum() {
		return this.fsendsum;
	}

	public void setFsendsum(Double fsendsum) {
		this.fsendsum = fsendsum;
	}

	public Double getFinvsum() {
		return this.finvsum;
	}

	public void setFinvsum(Double finvsum) {
		this.finvsum = finvsum;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Short getOrdstatus() {
		return this.ordstatus;
	}

	public void setOrdstatus(Short ordstatus) {
		this.ordstatus = ordstatus;
	}

	public String getSalechannel() {
		return this.salechannel;
	}

	public void setSalechannel(String salechannel) {
		this.salechannel = salechannel;
	}

	public String getSaletype() {
		return this.saletype;
	}

	public void setSaletype(String saletype) {
		this.saletype = saletype;
	}

	public Double getOrdsecsum() {
		return this.ordsecsum;
	}

	public void setOrdsecsum(Double ordsecsum) {
		this.ordsecsum = ordsecsum;
	}

	public Double getFordsecsum() {
		return this.fordsecsum;
	}

	public void setFordsecsum(Double fordsecsum) {
		this.fordsecsum = fordsecsum;
	}

	public Short getDisdata() {
		return this.disdata;
	}

	public void setDisdata(Short disdata) {
		this.disdata = disdata;
	}

	public Timestamp getVerdtm() {
		return this.verdtm;
	}

	public void setVerdtm(Timestamp verdtm) {
		this.verdtm = verdtm;
	}

	public String getUsercomp() {
		return this.usercomp;
	}

	public void setUsercomp(String usercomp) {
		this.usercomp = usercomp;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOrderpri() {
		return this.orderpri;
	}

	public void setOrderpri(String orderpri) {
		this.orderpri = orderpri;
	}

	public String getCustocode() {
		return this.custocode;
	}

	public void setCustocode(String custocode) {
		this.custocode = custocode;
	}

	public String getRelreqid() {
		return this.relreqid;
	}

	public void setRelreqid(String relreqid) {
		this.relreqid = relreqid;
	}

	public Double getLastsum() {
		return this.lastsum;
	}

	public void setLastsum(Double lastsum) {
		this.lastsum = lastsum;
	}

	public Double getFlastsum() {
		return this.flastsum;
	}

	public void setFlastsum(Double flastsum) {
		this.flastsum = flastsum;
	}

	public Short getConvflg() {
		return this.convflg;
	}

	public void setConvflg(Short convflg) {
		this.convflg = convflg;
	}

	public String getDocfrom() {
		return this.docfrom;
	}

	public void setDocfrom(String docfrom) {
		this.docfrom = docfrom;
	}

	public String getRelid() {
		return this.relid;
	}

	public void setRelid(String relid) {
		this.relid = relid;
	}

	public String getRelno() {
		return this.relno;
	}

	public void setRelno(String relno) {
		this.relno = relno;
	}

	public String getBaseinfo() {
		return this.baseinfo;
	}

	public void setBaseinfo(String baseinfo) {
		this.baseinfo = baseinfo;
	}

	public String getSpecinfo() {
		return this.specinfo;
	}

	public void setSpecinfo(String specinfo) {
		this.specinfo = specinfo;
	}

	public String getChantype() {
		return this.chantype;
	}

	public void setChantype(String chantype) {
		this.chantype = chantype;
	}

	public String getAccocode() {
		return this.accocode;
	}

	public void setAccocode(String accocode) {
		this.accocode = accocode;
	}

	public Timestamp getFallindate() {
		return this.fallindate;
	}

	public void setFallindate(Timestamp fallindate) {
		this.fallindate = fallindate;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Double getSpecialsum() {
		return this.specialsum;
	}

	public void setSpecialsum(Double specialsum) {
		this.specialsum = specialsum;
	}

	public Double getSpecialapplysum() {
		return this.specialapplysum;
	}

	public void setSpecialapplysum(Double specialapplysum) {
		this.specialapplysum = specialapplysum;
	}

	public Double getMoveupsum() {
		return this.moveupsum;
	}

	public void setMoveupsum(Double moveupsum) {
		this.moveupsum = moveupsum;
	}

	public Double getMoveupordersum() {
		return this.moveupordersum;
	}

	public void setMoveupordersum(Double moveupordersum) {
		this.moveupordersum = moveupordersum;
	}

	public Double getAddsum() {
		return this.addsum;
	}

	public void setAddsum(Double addsum) {
		this.addsum = addsum;
	}

	public Double getAddordersum() {
		return this.addordersum;
	}

	public void setAddordersum(Double addordersum) {
		this.addordersum = addordersum;
	}

	public String getEorderprop() {
		return this.eorderprop;
	}

	public void setEorderprop(String eorderprop) {
		this.eorderprop = eorderprop;
	}

	public Double getPactrebate() {
		return this.pactrebate;
	}

	public void setPactrebate(Double pactrebate) {
		this.pactrebate = pactrebate;
	}

	public String getRemarkss() {
		return this.remarkss;
	}

	public void setRemarkss(String remarkss) {
		this.remarkss = remarkss;
	}

	public String getSendaddrtype() {
		return this.sendaddrtype;
	}

	public void setSendaddrtype(String sendaddrtype) {
		this.sendaddrtype = sendaddrtype;
	}

	public String getAppinfo() {
		return this.appinfo;
	}

	public void setAppinfo(String appinfo) {
		this.appinfo = appinfo;
	}

	public String getAppremarks() {
		return this.appremarks;
	}

	public void setAppremarks(String appremarks) {
		this.appremarks = appremarks;
	}

	public Integer getWspuserid() {
		return this.wspuserid;
	}

	public void setWspuserid(Integer wspuserid) {
		this.wspuserid = wspuserid;
	}

	public String getNgappflg() {
		return this.ngappflg;
	}

	public void setNgappflg(String ngappflg) {
		this.ngappflg = ngappflg;
	}

	public Double getForderfee() {
		return this.forderfee;
	}

	public void setForderfee(Double forderfee) {
		this.forderfee = forderfee;
	}

	public Double getOrderfee() {
		return this.orderfee;
	}

	public void setOrderfee(Double orderfee) {
		this.orderfee = orderfee;
	}

	public String getPaylinkman() {
		return this.paylinkman;
	}

	public void setPaylinkman(String paylinkman) {
		this.paylinkman = paylinkman;
	}

	public String getPaylinktel() {
		return this.paylinktel;
	}

	public void setPaylinktel(String paylinktel) {
		this.paylinktel = paylinktel;
	}

	public String getPaycompany() {
		return this.paycompany;
	}

	public void setPaycompany(String paycompany) {
		this.paycompany = paycompany;
	}

	public String getPayaddress() {
		return this.payaddress;
	}

	public void setPayaddress(String payaddress) {
		this.payaddress = payaddress;
	}

	public String getPaytaxno() {
		return this.paytaxno;
	}

	public void setPaytaxno(String paytaxno) {
		this.paytaxno = paytaxno;
	}

	public String getPaybankno() {
		return this.paybankno;
	}

	public void setPaybankno(String paybankno) {
		this.paybankno = paybankno;
	}

	public String getAttrgrpid() {
		return this.attrgrpid;
	}

	public void setAttrgrpid(String attrgrpid) {
		this.attrgrpid = attrgrpid;
	}

	public Double getOwerate() {
		return this.owerate;
	}

	public void setOwerate(Double owerate) {
		this.owerate = owerate;
	}

	public String getShiptype() {
		return this.shiptype;
	}

	public void setShiptype(String shiptype) {
		this.shiptype = shiptype;
	}

	public String getPrdtgroup() {
		return this.prdtgroup;
	}

	public void setPrdtgroup(String prdtgroup) {
		this.prdtgroup = prdtgroup;
	}

	public Double getPermoney() {
		return this.permoney;
	}

	public void setPermoney(Double permoney) {
		this.permoney = permoney;
	}

	public Double getTotalqty() {
		return this.totalqty;
	}

	public void setTotalqty(Double totalqty) {
		this.totalqty = totalqty;
	}

	public Double getTotalfqty() {
		return this.totalfqty;
	}

	public void setTotalfqty(Double totalfqty) {
		this.totalfqty = totalfqty;
	}

	public Integer getPaymenttype() {
		return this.paymenttype;
	}

	public void setPaymenttype(Integer paymenttype) {
		this.paymenttype = paymenttype;
	}

	public Double getOrdersumjf() {
		return this.ordersumjf;
	}

	public void setOrdersumjf(Double ordersumjf) {
		this.ordersumjf = ordersumjf;
	}

	public Double getReturnjf() {
		return this.returnjf;
	}

	public void setReturnjf(Double returnjf) {
		this.returnjf = returnjf;
	}

	public Timestamp getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Timestamp paydate) {
		this.paydate = paydate;
	}

	public Integer getOrderqty() {
		return this.orderqty;
	}

	public void setOrderqty(Integer orderqty) {
		this.orderqty = orderqty;
	}

	public Double getOrderjf() {
		return this.orderjf;
	}

	public void setOrderjf(Double orderjf) {
		this.orderjf = orderjf;
	}

	public String getSupplyno() {
		return this.supplyno;
	}

	public void setSupplyno(String supplyno) {
		this.supplyno = supplyno;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getShipcomp() {
		return this.shipcomp;
	}

	public void setShipcomp(String shipcomp) {
		this.shipcomp = shipcomp;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
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

	public Integer getEpayway() {
		return this.epayway;
	}

	public void setEpayway(Integer epayway) {
		this.epayway = epayway;
	}

	public String getJddeliverytype() {
		return this.jddeliverytype;
	}

	public void setJddeliverytype(String jddeliverytype) {
		this.jddeliverytype = jddeliverytype;
	}

	public String getJdsendersite() {
		return this.jdsendersite;
	}

	public void setJdsendersite(String jdsendersite) {
		this.jdsendersite = jdsendersite;
	}

	public String getJdnoticebefore() {
		return this.jdnoticebefore;
	}

	public void setJdnoticebefore(String jdnoticebefore) {
		this.jdnoticebefore = jdnoticebefore;
	}

	public String getJdstockcenter() {
		return this.jdstockcenter;
	}

	public void setJdstockcenter(String jdstockcenter) {
		this.jdstockcenter = jdstockcenter;
	}

	public String getJdpayway() {
		return this.jdpayway;
	}

	public void setJdpayway(String jdpayway) {
		this.jdpayway = jdpayway;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getBilltitle() {
		return this.billtitle;
	}

	public void setBilltitle(String billtitle) {
		this.billtitle = billtitle;
	}

	public Double getBillamount() {
		return this.billamount;
	}

	public void setBillamount(Double billamount) {
		this.billamount = billamount;
	}

	public String getBilltype() {
		return this.billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getBillcontent() {
		return this.billcontent;
	}

	public void setBillcontent(String billcontent) {
		this.billcontent = billcontent;
	}

	public String getApportionflg() {
		return this.apportionflg;
	}

	public void setApportionflg(String apportionflg) {
		this.apportionflg = apportionflg;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public Integer getPayflag() {
		return this.payflag;
	}

	public void setPayflag(Integer payflag) {
		this.payflag = payflag;
	}

	public String getGroupno() {
		return this.groupno;
	}

	public void setGroupno(String groupno) {
		this.groupno = groupno;
	}

	public String getDeleteflag() {
		return this.deleteflag;
	}

	public void setDeleteflag(String deleteflag) {
		this.deleteflag = deleteflag;
	}

	public Timestamp getDeletedate() {
		return this.deletedate;
	}

	public void setDeletedate(Timestamp deletedate) {
		this.deletedate = deletedate;
	}

	public String getHangflag() {
		return this.hangflag;
	}

	public void setHangflag(String hangflag) {
		this.hangflag = hangflag;
	}

	public String getCustomflag() {
		return this.customflag;
	}

	public void setCustomflag(String customflag) {
		this.customflag = customflag;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPaynation() {
		return this.paynation;
	}

	public void setPaynation(String paynation) {
		this.paynation = paynation;
	}

	public String getPayprovince() {
		return this.payprovince;
	}

	public void setPayprovince(String payprovince) {
		this.payprovince = payprovince;
	}

	public String getPaycity() {
		return this.paycity;
	}

	public void setPaycity(String paycity) {
		this.paycity = paycity;
	}

	public String getPaycounty() {
		return this.paycounty;
	}

	public void setPaycounty(String paycounty) {
		this.paycounty = paycounty;
	}

	public String getPayzipcode() {
		return this.payzipcode;
	}

	public void setPayzipcode(String payzipcode) {
		this.payzipcode = payzipcode;
	}

	public String getPayhandset() {
		return this.payhandset;
	}

	public void setPayhandset(String payhandset) {
		this.payhandset = payhandset;
	}

	public Integer getPayid() {
		return this.payid;
	}

	public void setPayid(Integer payid) {
		this.payid = payid;
	}

	public String getPayname() {
		return this.payname;
	}

	public void setPayname(String payname) {
		this.payname = payname;
	}

	public Integer getDtId() {
		return this.dtId;
	}

	public void setDtId(Integer dtId) {
		this.dtId = dtId;
	}

	public String getDtName() {
		return this.dtName;
	}

	public void setDtName(String dtName) {
		this.dtName = dtName;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getReduceamount() {
		return this.reduceamount;
	}

	public void setReduceamount(Double reduceamount) {
		this.reduceamount = reduceamount;
	}

	public String getBuyerremarks() {
		return this.buyerremarks;
	}

	public void setBuyerremarks(String buyerremarks) {
		this.buyerremarks = buyerremarks;
	}

	public String getSellerremarks() {
		return this.sellerremarks;
	}

	public void setSellerremarks(String sellerremarks) {
		this.sellerremarks = sellerremarks;
	}

	public Timestamp getRelcreatetime() {
		return this.relcreatetime;
	}

	public void setRelcreatetime(Timestamp relcreatetime) {
		this.relcreatetime = relcreatetime;
	}

	public Integer getOnecode() {
		return this.onecode;
	}

	public void setOnecode(Integer onecode) {
		this.onecode = onecode;
	}

	public Integer getShopid() {
		return this.shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public String getSysid() {
		return this.sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}

	public String getCityregion() {
		return this.cityregion;
	}

	public void setCityregion(String cityregion) {
		this.cityregion = cityregion;
	}

	public Double getFee() {
		return this.fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Integer getPayplatformid() {
		return this.payplatformid;
	}

	public void setPayplatformid(Integer payplatformid) {
		this.payplatformid = payplatformid;
	}

	public String getAnaylsisflg() {
		return this.anaylsisflg;
	}

	public void setAnaylsisflg(String anaylsisflg) {
		this.anaylsisflg = anaylsisflg;
	}

	public Timestamp getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}

	public String getLackflg() {
		return this.lackflg;
	}

	public void setLackflg(String lackflg) {
		this.lackflg = lackflg;
	}

	public String getTraceno() {
		return this.traceno;
	}

	public void setTraceno(String traceno) {
		this.traceno = traceno;
	}

	public String getDefwhouse() {
		return this.defwhouse;
	}

	public void setDefwhouse(String defwhouse) {
		this.defwhouse = defwhouse;
	}

	public String getPackitemno() {
		return this.packitemno;
	}

	public void setPackitemno(String packitemno) {
		this.packitemno = packitemno;
	}

	public String getPackattrvalid() {
		return this.packattrvalid;
	}

	public void setPackattrvalid(String packattrvalid) {
		this.packattrvalid = packattrvalid;
	}

	public String getBuyerid() {
		return this.buyerid;
	}

	public void setBuyerid(String buyerid) {
		this.buyerid = buyerid;
	}

	public String getBuyernick() {
		return this.buyernick;
	}

	public void setBuyernick(String buyernick) {
		this.buyernick = buyernick;
	}

	public Timestamp getPrintdate() {
		return this.printdate;
	}

	public void setPrintdate(Timestamp printdate) {
		this.printdate = printdate;
	}

	public Timestamp getStocktime() {
		return this.stocktime;
	}

	public void setStocktime(Timestamp stocktime) {
		this.stocktime = stocktime;
	}

	public String getPrintman() {
		return this.printman;
	}

	public void setPrintman(String printman) {
		this.printman = printman;
	}

	public String getAppmanname() {
		return this.appmanname;
	}

	public void setAppmanname(String appmanname) {
		this.appmanname = appmanname;
	}

	public String getPrintmanname() {
		return this.printmanname;
	}

	public void setPrintmanname(String printmanname) {
		this.printmanname = printmanname;
	}

	public String getStockflg() {
		return this.stockflg;
	}

	public void setStockflg(String stockflg) {
		this.stockflg = stockflg;
	}

	public Timestamp getStockdate() {
		return this.stockdate;
	}

	public void setStockdate(Timestamp stockdate) {
		this.stockdate = stockdate;
	}

	public Integer getPrintcount() {
		return this.printcount;
	}

	public void setPrintcount(Integer printcount) {
		this.printcount = printcount;
	}

	public String getSendman() {
		return this.sendman;
	}

	public void setSendman(String sendman) {
		this.sendman = sendman;
	}

	public Timestamp getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
	}

	public String getHdflag() {
		return this.hdflag;
	}

	public void setHdflag(String hdflag) {
		this.hdflag = hdflag;
	}

	public String getExportflag() {
		return this.exportflag;
	}

	public void setExportflag(String exportflag) {
		this.exportflag = exportflag;
	}

	public String getIssetseries() {
		return this.issetseries;
	}

	public void setIssetseries(String issetseries) {
		this.issetseries = issetseries;
	}

	public Short getEprintflg() {
		return this.eprintflg;
	}

	public void setEprintflg(Short eprintflg) {
		this.eprintflg = eprintflg;
	}

	public String getEprintman() {
		return this.eprintman;
	}

	public void setEprintman(String eprintman) {
		this.eprintman = eprintman;
	}

	public String getEprintmanname() {
		return this.eprintmanname;
	}

	public void setEprintmanname(String eprintmanname) {
		this.eprintmanname = eprintmanname;
	}

	public Integer getEprintcount() {
		return this.eprintcount;
	}

	public void setEprintcount(Integer eprintcount) {
		this.eprintcount = eprintcount;
	}

	public Timestamp getEprintdate() {
		return this.eprintdate;
	}

	public void setEprintdate(Timestamp eprintdate) {
		this.eprintdate = eprintdate;
	}

	public String getTransman() {
		return this.transman;
	}

	public void setTransman(String transman) {
		this.transman = transman;
	}

	public String getIswritebackflg() {
		return this.iswritebackflg;
	}

	public void setIswritebackflg(String iswritebackflg) {
		this.iswritebackflg = iswritebackflg;
	}

	public String getValidflag() {
		return this.validflag;
	}

	public void setValidflag(String validflag) {
		this.validflag = validflag;
	}

	public String getDealerflag() {
		return this.dealerflag;
	}

	public void setDealerflag(String dealerflag) {
		this.dealerflag = dealerflag;
	}

	public String getSplitflag() {
		return this.splitflag;
	}

	public void setSplitflag(String splitflag) {
		this.splitflag = splitflag;
	}

	public String getMergeflag() {
		return this.mergeflag;
	}

	public void setMergeflag(String mergeflag) {
		this.mergeflag = mergeflag;
	}

	public String getSourceopt() {
		return this.sourceopt;
	}

	public void setSourceopt(String sourceopt) {
		this.sourceopt = sourceopt;
	}

	public Double getCouponsum() {
		return this.couponsum;
	}

	public void setCouponsum(Double couponsum) {
		this.couponsum = couponsum;
	}

	public String getOrderfrom() {
		return this.orderfrom;
	}

	public void setOrderfrom(String orderfrom) {
		this.orderfrom = orderfrom;
	}

	public Integer getDistributorid() {
		return this.distributorid;
	}

	public void setDistributorid(Integer distributorid) {
		this.distributorid = distributorid;
	}

	public String getDistributornick() {
		return this.distributornick;
	}

	public void setDistributornick(String distributornick) {
		this.distributornick = distributornick;
	}

	public String getSendsite() {
		return this.sendsite;
	}

	public void setSendsite(String sendsite) {
		this.sendsite = sendsite;
	}

	public String getSendtype() {
		return this.sendtype;
	}

	public void setSendtype(String sendtype) {
		this.sendtype = sendtype;
	}

	public String getReturnflag() {
		return this.returnflag;
	}

	public void setReturnflag(String returnflag) {
		this.returnflag = returnflag;
	}

	public String getOrderconfirm() {
		return this.orderconfirm;
	}

	public void setOrderconfirm(String orderconfirm) {
		this.orderconfirm = orderconfirm;
	}

	public String getLogisticconfirm() {
		return this.logisticconfirm;
	}

	public void setLogisticconfirm(String logisticconfirm) {
		this.logisticconfirm = logisticconfirm;
	}

	public Double getActualorderfee() {
		return this.actualorderfee;
	}

	public void setActualorderfee(Double actualorderfee) {
		this.actualorderfee = actualorderfee;
	}

	public String getDefshelf() {
		return this.defshelf;
	}

	public void setDefshelf(String defshelf) {
		this.defshelf = defshelf;
	}

	public String getSupplierno() {
		return this.supplierno;
	}

	public void setSupplierno(String supplierno) {
		this.supplierno = supplierno;
	}

	public String getPurchaseflag() {
		return this.purchaseflag;
	}

	public void setPurchaseflag(String purchaseflag) {
		this.purchaseflag = purchaseflag;
	}

	public String getPrintexportflag() {
		return this.printexportflag;
	}

	public void setPrintexportflag(String printexportflag) {
		this.printexportflag = printexportflag;
	}

	public String getGoodsendtype() {
		return this.goodsendtype;
	}

	public void setGoodsendtype(String goodsendtype) {
		this.goodsendtype = goodsendtype;
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

	public Double getPlatformdisc() {
		return this.platformdisc;
	}

	public void setPlatformdisc(Double platformdisc) {
		this.platformdisc = platformdisc;
	}

}