package com.wantdo.cost.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IEcEordermstDAO;
import com.wantdo.cost.model.EcEordermst;

/**
 * A data access object (DAO) providing persistence and search support for
 * EcEordermst entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.EcEordermst
 * @author MyEclipse Persistence Tools
 */
public class EcEordermstDAO extends HibernateDaoSupport implements IEcEordermstDAO {
	private static final Logger log = LoggerFactory
			.getLogger(EcEordermstDAO.class);
	// property constants
	public static final String ORDERNO = "orderno";
	public static final String CONTRACTNO = "contractno";
	public static final String CONTRACTID = "contractid";
	public static final String RECORDMAN = "recordman";
	public static final String ORDERCOMP = "ordercomp";
	public static final String OCODE = "ocode";
	public static final String RUNDEPT = "rundept";
	public static final String RUNEMP = "runemp";
	public static final String ORDHWSUM = "ordhwsum";
	public static final String ORDERSUM = "ordersum";
	public static final String ORDERDISC = "orderdisc";
	public static final String ORDERTYPE = "ordertype";
	public static final String SALEPRE = "salepre";
	public static final String PAYWAY = "payway";
	public static final String RECCOMP = "reccomp";
	public static final String RECADDR = "recaddr";
	public static final String PAYCOMP = "paycomp";
	public static final String APPFLG = "appflg";
	public static final String APPMAN = "appman";
	public static final String DELIVERADDR = "deliveraddr";
	public static final String PRICEGET = "priceget";
	public static final String QUOTTNO = "quottno";
	public static final String DISCTYPE = "disctype";
	public static final String DISCRATE = "discrate";
	public static final String LAYFLG = "layflg";
	public static final String PRINTFLG = "printflg";
	public static final String SENDFLG = "sendflg";
	public static final String MINVFLG = "minvflg";
	public static final String OVERFLG = "overflg";
	public static final String RECFLG = "recflg";
	public static final String CANCELFLG = "cancelflg";
	public static final String SENDSUM = "sendsum";
	public static final String INVSUM = "invsum";
	public static final String CURTYPE = "curtype";
	public static final String EXCHGRATE = "exchgrate";
	public static final String FORDHWSUM = "fordhwsum";
	public static final String FORDERSUM = "fordersum";
	public static final String FORDERDISC = "forderdisc";
	public static final String FSENDSUM = "fsendsum";
	public static final String FINVSUM = "finvsum";
	public static final String REMARKS = "remarks";
	public static final String ORDSTATUS = "ordstatus";
	public static final String SALECHANNEL = "salechannel";
	public static final String SALETYPE = "saletype";
	public static final String ORDSECSUM = "ordsecsum";
	public static final String FORDSECSUM = "fordsecsum";
	public static final String DISDATA = "disdata";
	public static final String USERCOMP = "usercomp";
	public static final String USERNAME = "username";
	public static final String ORDERPRI = "orderpri";
	public static final String CUSTOCODE = "custocode";
	public static final String RELREQID = "relreqid";
	public static final String LASTSUM = "lastsum";
	public static final String FLASTSUM = "flastsum";
	public static final String CONVFLG = "convflg";
	public static final String DOCFROM = "docfrom";
	public static final String RELID = "relid";
	public static final String RELNO = "relno";
	public static final String BASEINFO = "baseinfo";
	public static final String SPECINFO = "specinfo";
	public static final String CHANTYPE = "chantype";
	public static final String ACCOCODE = "accocode";
	public static final String REGION = "region";
	public static final String SPECIALSUM = "specialsum";
	public static final String SPECIALAPPLYSUM = "specialapplysum";
	public static final String MOVEUPSUM = "moveupsum";
	public static final String MOVEUPORDERSUM = "moveupordersum";
	public static final String ADDSUM = "addsum";
	public static final String ADDORDERSUM = "addordersum";
	public static final String EORDERPROP = "eorderprop";
	public static final String PACTREBATE = "pactrebate";
	public static final String REMARKSS = "remarkss";
	public static final String SENDADDRTYPE = "sendaddrtype";
	public static final String APPINFO = "appinfo";
	public static final String APPREMARKS = "appremarks";
	public static final String WSPUSERID = "wspuserid";
	public static final String NGAPPFLG = "ngappflg";
	public static final String FORDERFEE = "forderfee";
	public static final String ORDERFEE = "orderfee";
	public static final String PAYLINKMAN = "paylinkman";
	public static final String PAYLINKTEL = "paylinktel";
	public static final String PAYCOMPANY = "paycompany";
	public static final String PAYADDRESS = "payaddress";
	public static final String PAYTAXNO = "paytaxno";
	public static final String PAYBANKNO = "paybankno";
	public static final String ATTRGRPID = "attrgrpid";
	public static final String OWERATE = "owerate";
	public static final String SHIPTYPE = "shiptype";
	public static final String PRDTGROUP = "prdtgroup";
	public static final String PERMONEY = "permoney";
	public static final String TOTALQTY = "totalqty";
	public static final String TOTALFQTY = "totalfqty";
	public static final String PAYMENTTYPE = "paymenttype";
	public static final String ORDERSUMJF = "ordersumjf";
	public static final String RETURNJF = "returnjf";
	public static final String ORDERQTY = "orderqty";
	public static final String ORDERJF = "orderjf";
	public static final String SUPPLYNO = "supplyno";
	public static final String ZIPCODE = "zipcode";
	public static final String SHIPCOMP = "shipcomp";
	public static final String LINKMAN = "linkman";
	public static final String LINKTEL = "linktel";
	public static final String HANDSET = "handset";
	public static final String EPAYWAY = "epayway";
	public static final String JDDELIVERYTYPE = "jddeliverytype";
	public static final String JDSENDERSITE = "jdsendersite";
	public static final String JDNOTICEBEFORE = "jdnoticebefore";
	public static final String JDSTOCKCENTER = "jdstockcenter";
	public static final String JDPAYWAY = "jdpayway";
	public static final String TELEPHONE = "telephone";
	public static final String MOBILEPHONE = "mobilephone";
	public static final String BILLTITLE = "billtitle";
	public static final String BILLAMOUNT = "billamount";
	public static final String BILLTYPE = "billtype";
	public static final String BILLCONTENT = "billcontent";
	public static final String APPORTIONFLG = "apportionflg";
	public static final String CITY = "city";
	public static final String PROVINCE = "province";
	public static final String PAYFLAG = "payflag";
	public static final String GROUPNO = "groupno";
	public static final String DELETEFLAG = "deleteflag";
	public static final String HANGFLAG = "hangflag";
	public static final String CUSTOMFLAG = "customflag";
	public static final String NATION = "nation";
	public static final String COUNTY = "county";
	public static final String PAYNATION = "paynation";
	public static final String PAYPROVINCE = "payprovince";
	public static final String PAYCITY = "paycity";
	public static final String PAYCOUNTY = "paycounty";
	public static final String PAYZIPCODE = "payzipcode";
	public static final String PAYHANDSET = "payhandset";
	public static final String PAYID = "payid";
	public static final String PAYNAME = "payname";
	public static final String DT_ID = "dtId";
	public static final String DT_NAME = "dtName";
	public static final String PRICE = "price";
	public static final String REDUCEAMOUNT = "reduceamount";
	public static final String BUYERREMARKS = "buyerremarks";
	public static final String SELLERREMARKS = "sellerremarks";
	public static final String ONECODE = "onecode";
	public static final String SHOPID = "shopid";
	public static final String SYSID = "sysid";
	public static final String CITYREGION = "cityregion";
	public static final String FEE = "fee";
	public static final String PAYPLATFORMID = "payplatformid";
	public static final String ANAYLSISFLG = "anaylsisflg";
	public static final String LACKFLG = "lackflg";
	public static final String TRACENO = "traceno";
	public static final String DEFWHOUSE = "defwhouse";
	public static final String PACKITEMNO = "packitemno";
	public static final String PACKATTRVALID = "packattrvalid";
	public static final String BUYERID = "buyerid";
	public static final String BUYERNICK = "buyernick";
	public static final String PRINTMAN = "printman";
	public static final String APPMANNAME = "appmanname";
	public static final String PRINTMANNAME = "printmanname";
	public static final String STOCKFLG = "stockflg";
	public static final String PRINTCOUNT = "printcount";
	public static final String SENDMAN = "sendman";
	public static final String HDFLAG = "hdflag";
	public static final String EXPORTFLAG = "exportflag";
	public static final String ISSETSERIES = "issetseries";
	public static final String EPRINTFLG = "eprintflg";
	public static final String EPRINTMAN = "eprintman";
	public static final String EPRINTMANNAME = "eprintmanname";
	public static final String EPRINTCOUNT = "eprintcount";
	public static final String TRANSMAN = "transman";
	public static final String ISWRITEBACKFLG = "iswritebackflg";
	public static final String VALIDFLAG = "validflag";
	public static final String DEALERFLAG = "dealerflag";
	public static final String SPLITFLAG = "splitflag";
	public static final String MERGEFLAG = "mergeflag";
	public static final String SOURCEOPT = "sourceopt";
	public static final String COUPONSUM = "couponsum";
	public static final String ORDERFROM = "orderfrom";
	public static final String DISTRIBUTORID = "distributorid";
	public static final String DISTRIBUTORNICK = "distributornick";
	public static final String SENDSITE = "sendsite";
	public static final String SENDTYPE = "sendtype";
	public static final String RETURNFLAG = "returnflag";
	public static final String ORDERCONFIRM = "orderconfirm";
	public static final String LOGISTICCONFIRM = "logisticconfirm";
	public static final String ACTUALORDERFEE = "actualorderfee";
	public static final String DEFSHELF = "defshelf";
	public static final String SUPPLIERNO = "supplierno";
	public static final String PURCHASEFLAG = "purchaseflag";
	public static final String PRINTEXPORTFLAG = "printexportflag";
	public static final String GOODSENDTYPE = "goodsendtype";
	public static final String ATTACHMENT = "attachment";
	public static final String BILLCOMPANY = "billcompany";
	public static final String ORDERSHOULDPAY = "ordershouldpay";
	public static final String PLATFORMDISC = "platformdisc";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see com.wantdo.cost.ec.IEcEordermstDAO#save(com.wantdo.cost.ec.EcEordermst)
	 */
	@Override
	public void save(EcEordermst transientInstance) {
		log.debug("saving EcEordermst instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EcEordermst persistentInstance) {
		log.debug("deleting EcEordermst instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.wantdo.cost.ec.IEcEordermstDAO#findById(java.lang.String)
	 */
	@Override
	public EcEordermst findById(java.lang.String id) {
		log.debug("getting EcEordermst instance with id: " + id);
		try {
			EcEordermst instance = (EcEordermst) getHibernateTemplate().get(
					"com.wantdo.cost.model.EcEordermst", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EcEordermst instance) {
		log.debug("finding EcEordermst instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EcEordermst instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EcEordermst as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderno(Object orderno) {
		return findByProperty(ORDERNO, orderno);
	}

	public List findByContractno(Object contractno) {
		return findByProperty(CONTRACTNO, contractno);
	}

	public List findByContractid(Object contractid) {
		return findByProperty(CONTRACTID, contractid);
	}

	public List findByRecordman(Object recordman) {
		return findByProperty(RECORDMAN, recordman);
	}

	public List findByOrdercomp(Object ordercomp) {
		return findByProperty(ORDERCOMP, ordercomp);
	}

	public List findByOcode(Object ocode) {
		return findByProperty(OCODE, ocode);
	}

	public List findByRundept(Object rundept) {
		return findByProperty(RUNDEPT, rundept);
	}

	public List findByRunemp(Object runemp) {
		return findByProperty(RUNEMP, runemp);
	}

	public List findByOrdhwsum(Object ordhwsum) {
		return findByProperty(ORDHWSUM, ordhwsum);
	}

	public List findByOrdersum(Object ordersum) {
		return findByProperty(ORDERSUM, ordersum);
	}

	public List findByOrderdisc(Object orderdisc) {
		return findByProperty(ORDERDISC, orderdisc);
	}

	public List findByOrdertype(Object ordertype) {
		return findByProperty(ORDERTYPE, ordertype);
	}

	public List findBySalepre(Object salepre) {
		return findByProperty(SALEPRE, salepre);
	}

	public List findByPayway(Object payway) {
		return findByProperty(PAYWAY, payway);
	}

	public List findByReccomp(Object reccomp) {
		return findByProperty(RECCOMP, reccomp);
	}

	public List findByRecaddr(Object recaddr) {
		return findByProperty(RECADDR, recaddr);
	}

	public List findByPaycomp(Object paycomp) {
		return findByProperty(PAYCOMP, paycomp);
	}

	public List findByAppflg(Object appflg) {
		return findByProperty(APPFLG, appflg);
	}

	public List findByAppman(Object appman) {
		return findByProperty(APPMAN, appman);
	}

	public List findByDeliveraddr(Object deliveraddr) {
		return findByProperty(DELIVERADDR, deliveraddr);
	}

	public List findByPriceget(Object priceget) {
		return findByProperty(PRICEGET, priceget);
	}

	public List findByQuottno(Object quottno) {
		return findByProperty(QUOTTNO, quottno);
	}

	public List findByDisctype(Object disctype) {
		return findByProperty(DISCTYPE, disctype);
	}

	public List findByDiscrate(Object discrate) {
		return findByProperty(DISCRATE, discrate);
	}

	public List findByLayflg(Object layflg) {
		return findByProperty(LAYFLG, layflg);
	}

	public List findByPrintflg(Object printflg) {
		return findByProperty(PRINTFLG, printflg);
	}

	public List findBySendflg(Object sendflg) {
		return findByProperty(SENDFLG, sendflg);
	}

	public List findByMinvflg(Object minvflg) {
		return findByProperty(MINVFLG, minvflg);
	}

	public List findByOverflg(Object overflg) {
		return findByProperty(OVERFLG, overflg);
	}

	public List findByRecflg(Object recflg) {
		return findByProperty(RECFLG, recflg);
	}

	public List findByCancelflg(Object cancelflg) {
		return findByProperty(CANCELFLG, cancelflg);
	}

	public List findBySendsum(Object sendsum) {
		return findByProperty(SENDSUM, sendsum);
	}

	public List findByInvsum(Object invsum) {
		return findByProperty(INVSUM, invsum);
	}

	public List findByCurtype(Object curtype) {
		return findByProperty(CURTYPE, curtype);
	}

	public List findByExchgrate(Object exchgrate) {
		return findByProperty(EXCHGRATE, exchgrate);
	}

	public List findByFordhwsum(Object fordhwsum) {
		return findByProperty(FORDHWSUM, fordhwsum);
	}

	public List findByFordersum(Object fordersum) {
		return findByProperty(FORDERSUM, fordersum);
	}

	public List findByForderdisc(Object forderdisc) {
		return findByProperty(FORDERDISC, forderdisc);
	}

	public List findByFsendsum(Object fsendsum) {
		return findByProperty(FSENDSUM, fsendsum);
	}

	public List findByFinvsum(Object finvsum) {
		return findByProperty(FINVSUM, finvsum);
	}

	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List findByOrdstatus(Object ordstatus) {
		return findByProperty(ORDSTATUS, ordstatus);
	}

	public List findBySalechannel(Object salechannel) {
		return findByProperty(SALECHANNEL, salechannel);
	}

	public List findBySaletype(Object saletype) {
		return findByProperty(SALETYPE, saletype);
	}

	public List findByOrdsecsum(Object ordsecsum) {
		return findByProperty(ORDSECSUM, ordsecsum);
	}

	public List findByFordsecsum(Object fordsecsum) {
		return findByProperty(FORDSECSUM, fordsecsum);
	}

	public List findByDisdata(Object disdata) {
		return findByProperty(DISDATA, disdata);
	}

	public List findByUsercomp(Object usercomp) {
		return findByProperty(USERCOMP, usercomp);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByOrderpri(Object orderpri) {
		return findByProperty(ORDERPRI, orderpri);
	}

	public List findByCustocode(Object custocode) {
		return findByProperty(CUSTOCODE, custocode);
	}

	public List findByRelreqid(Object relreqid) {
		return findByProperty(RELREQID, relreqid);
	}

	public List findByLastsum(Object lastsum) {
		return findByProperty(LASTSUM, lastsum);
	}

	public List findByFlastsum(Object flastsum) {
		return findByProperty(FLASTSUM, flastsum);
	}

	public List findByConvflg(Object convflg) {
		return findByProperty(CONVFLG, convflg);
	}

	public List findByDocfrom(Object docfrom) {
		return findByProperty(DOCFROM, docfrom);
	}

	/* (non-Javadoc)
	 * @see com.wantdo.cost.model.IEcEordermstDAO#findByRelid(java.lang.Object)
	 */
	@Override
	public List findByRelid(Object relid) {
		return findByProperty(RELID, relid);
	}

	public List findByRelno(Object relno) {
		return findByProperty(RELNO, relno);
	}

	public List findByBaseinfo(Object baseinfo) {
		return findByProperty(BASEINFO, baseinfo);
	}

	public List findBySpecinfo(Object specinfo) {
		return findByProperty(SPECINFO, specinfo);
	}

	public List findByChantype(Object chantype) {
		return findByProperty(CHANTYPE, chantype);
	}

	public List findByAccocode(Object accocode) {
		return findByProperty(ACCOCODE, accocode);
	}

	public List findByRegion(Object region) {
		return findByProperty(REGION, region);
	}

	public List findBySpecialsum(Object specialsum) {
		return findByProperty(SPECIALSUM, specialsum);
	}

	public List findBySpecialapplysum(Object specialapplysum) {
		return findByProperty(SPECIALAPPLYSUM, specialapplysum);
	}

	public List findByMoveupsum(Object moveupsum) {
		return findByProperty(MOVEUPSUM, moveupsum);
	}

	public List findByMoveupordersum(Object moveupordersum) {
		return findByProperty(MOVEUPORDERSUM, moveupordersum);
	}

	public List findByAddsum(Object addsum) {
		return findByProperty(ADDSUM, addsum);
	}

	public List findByAddordersum(Object addordersum) {
		return findByProperty(ADDORDERSUM, addordersum);
	}

	public List findByEorderprop(Object eorderprop) {
		return findByProperty(EORDERPROP, eorderprop);
	}

	public List findByPactrebate(Object pactrebate) {
		return findByProperty(PACTREBATE, pactrebate);
	}

	public List findByRemarkss(Object remarkss) {
		return findByProperty(REMARKSS, remarkss);
	}

	public List findBySendaddrtype(Object sendaddrtype) {
		return findByProperty(SENDADDRTYPE, sendaddrtype);
	}

	public List findByAppinfo(Object appinfo) {
		return findByProperty(APPINFO, appinfo);
	}

	public List findByAppremarks(Object appremarks) {
		return findByProperty(APPREMARKS, appremarks);
	}

	public List findByWspuserid(Object wspuserid) {
		return findByProperty(WSPUSERID, wspuserid);
	}

	public List findByNgappflg(Object ngappflg) {
		return findByProperty(NGAPPFLG, ngappflg);
	}

	public List findByForderfee(Object forderfee) {
		return findByProperty(FORDERFEE, forderfee);
	}

	public List findByOrderfee(Object orderfee) {
		return findByProperty(ORDERFEE, orderfee);
	}

	public List findByPaylinkman(Object paylinkman) {
		return findByProperty(PAYLINKMAN, paylinkman);
	}

	public List findByPaylinktel(Object paylinktel) {
		return findByProperty(PAYLINKTEL, paylinktel);
	}

	public List findByPaycompany(Object paycompany) {
		return findByProperty(PAYCOMPANY, paycompany);
	}

	public List findByPayaddress(Object payaddress) {
		return findByProperty(PAYADDRESS, payaddress);
	}

	public List findByPaytaxno(Object paytaxno) {
		return findByProperty(PAYTAXNO, paytaxno);
	}

	public List findByPaybankno(Object paybankno) {
		return findByProperty(PAYBANKNO, paybankno);
	}

	public List findByAttrgrpid(Object attrgrpid) {
		return findByProperty(ATTRGRPID, attrgrpid);
	}

	public List findByOwerate(Object owerate) {
		return findByProperty(OWERATE, owerate);
	}

	public List findByShiptype(Object shiptype) {
		return findByProperty(SHIPTYPE, shiptype);
	}

	public List findByPrdtgroup(Object prdtgroup) {
		return findByProperty(PRDTGROUP, prdtgroup);
	}

	public List findByPermoney(Object permoney) {
		return findByProperty(PERMONEY, permoney);
	}

	public List findByTotalqty(Object totalqty) {
		return findByProperty(TOTALQTY, totalqty);
	}

	public List findByTotalfqty(Object totalfqty) {
		return findByProperty(TOTALFQTY, totalfqty);
	}

	public List findByPaymenttype(Object paymenttype) {
		return findByProperty(PAYMENTTYPE, paymenttype);
	}

	public List findByOrdersumjf(Object ordersumjf) {
		return findByProperty(ORDERSUMJF, ordersumjf);
	}

	public List findByReturnjf(Object returnjf) {
		return findByProperty(RETURNJF, returnjf);
	}

	public List findByOrderqty(Object orderqty) {
		return findByProperty(ORDERQTY, orderqty);
	}

	public List findByOrderjf(Object orderjf) {
		return findByProperty(ORDERJF, orderjf);
	}

	public List findBySupplyno(Object supplyno) {
		return findByProperty(SUPPLYNO, supplyno);
	}

	public List findByZipcode(Object zipcode) {
		return findByProperty(ZIPCODE, zipcode);
	}

	public List findByShipcomp(Object shipcomp) {
		return findByProperty(SHIPCOMP, shipcomp);
	}

	public List findByLinkman(Object linkman) {
		return findByProperty(LINKMAN, linkman);
	}

	public List findByLinktel(Object linktel) {
		return findByProperty(LINKTEL, linktel);
	}

	public List findByHandset(Object handset) {
		return findByProperty(HANDSET, handset);
	}

	public List findByEpayway(Object epayway) {
		return findByProperty(EPAYWAY, epayway);
	}

	public List findByJddeliverytype(Object jddeliverytype) {
		return findByProperty(JDDELIVERYTYPE, jddeliverytype);
	}

	public List findByJdsendersite(Object jdsendersite) {
		return findByProperty(JDSENDERSITE, jdsendersite);
	}

	public List findByJdnoticebefore(Object jdnoticebefore) {
		return findByProperty(JDNOTICEBEFORE, jdnoticebefore);
	}

	public List findByJdstockcenter(Object jdstockcenter) {
		return findByProperty(JDSTOCKCENTER, jdstockcenter);
	}

	public List findByJdpayway(Object jdpayway) {
		return findByProperty(JDPAYWAY, jdpayway);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByMobilephone(Object mobilephone) {
		return findByProperty(MOBILEPHONE, mobilephone);
	}

	public List findByBilltitle(Object billtitle) {
		return findByProperty(BILLTITLE, billtitle);
	}

	public List findByBillamount(Object billamount) {
		return findByProperty(BILLAMOUNT, billamount);
	}

	public List findByBilltype(Object billtype) {
		return findByProperty(BILLTYPE, billtype);
	}

	public List findByBillcontent(Object billcontent) {
		return findByProperty(BILLCONTENT, billcontent);
	}

	public List findByApportionflg(Object apportionflg) {
		return findByProperty(APPORTIONFLG, apportionflg);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByPayflag(Object payflag) {
		return findByProperty(PAYFLAG, payflag);
	}

	public List findByGroupno(Object groupno) {
		return findByProperty(GROUPNO, groupno);
	}

	public List findByDeleteflag(Object deleteflag) {
		return findByProperty(DELETEFLAG, deleteflag);
	}

	public List findByHangflag(Object hangflag) {
		return findByProperty(HANGFLAG, hangflag);
	}

	public List findByCustomflag(Object customflag) {
		return findByProperty(CUSTOMFLAG, customflag);
	}

	public List findByNation(Object nation) {
		return findByProperty(NATION, nation);
	}

	public List findByCounty(Object county) {
		return findByProperty(COUNTY, county);
	}

	public List findByPaynation(Object paynation) {
		return findByProperty(PAYNATION, paynation);
	}

	public List findByPayprovince(Object payprovince) {
		return findByProperty(PAYPROVINCE, payprovince);
	}

	public List findByPaycity(Object paycity) {
		return findByProperty(PAYCITY, paycity);
	}

	public List findByPaycounty(Object paycounty) {
		return findByProperty(PAYCOUNTY, paycounty);
	}

	public List findByPayzipcode(Object payzipcode) {
		return findByProperty(PAYZIPCODE, payzipcode);
	}

	public List findByPayhandset(Object payhandset) {
		return findByProperty(PAYHANDSET, payhandset);
	}

	public List findByPayid(Object payid) {
		return findByProperty(PAYID, payid);
	}

	public List findByPayname(Object payname) {
		return findByProperty(PAYNAME, payname);
	}

	public List findByDtId(Object dtId) {
		return findByProperty(DT_ID, dtId);
	}

	public List findByDtName(Object dtName) {
		return findByProperty(DT_NAME, dtName);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findByReduceamount(Object reduceamount) {
		return findByProperty(REDUCEAMOUNT, reduceamount);
	}

	public List findByBuyerremarks(Object buyerremarks) {
		return findByProperty(BUYERREMARKS, buyerremarks);
	}

	public List findBySellerremarks(Object sellerremarks) {
		return findByProperty(SELLERREMARKS, sellerremarks);
	}

	public List findByOnecode(Object onecode) {
		return findByProperty(ONECODE, onecode);
	}

	public List findByShopid(Object shopid) {
		return findByProperty(SHOPID, shopid);
	}

	public List findBySysid(Object sysid) {
		return findByProperty(SYSID, sysid);
	}

	public List findByCityregion(Object cityregion) {
		return findByProperty(CITYREGION, cityregion);
	}

	public List findByFee(Object fee) {
		return findByProperty(FEE, fee);
	}

	public List findByPayplatformid(Object payplatformid) {
		return findByProperty(PAYPLATFORMID, payplatformid);
	}

	public List findByAnaylsisflg(Object anaylsisflg) {
		return findByProperty(ANAYLSISFLG, anaylsisflg);
	}

	public List findByLackflg(Object lackflg) {
		return findByProperty(LACKFLG, lackflg);
	}

	public List findByTraceno(Object traceno) {
		return findByProperty(TRACENO, traceno);
	}

	public List findByDefwhouse(Object defwhouse) {
		return findByProperty(DEFWHOUSE, defwhouse);
	}

	public List findByPackitemno(Object packitemno) {
		return findByProperty(PACKITEMNO, packitemno);
	}

	public List findByPackattrvalid(Object packattrvalid) {
		return findByProperty(PACKATTRVALID, packattrvalid);
	}

	public List findByBuyerid(Object buyerid) {
		return findByProperty(BUYERID, buyerid);
	}

	public List findByBuyernick(Object buyernick) {
		return findByProperty(BUYERNICK, buyernick);
	}

	public List findByPrintman(Object printman) {
		return findByProperty(PRINTMAN, printman);
	}

	public List findByAppmanname(Object appmanname) {
		return findByProperty(APPMANNAME, appmanname);
	}

	public List findByPrintmanname(Object printmanname) {
		return findByProperty(PRINTMANNAME, printmanname);
	}

	public List findByStockflg(Object stockflg) {
		return findByProperty(STOCKFLG, stockflg);
	}

	public List findByPrintcount(Object printcount) {
		return findByProperty(PRINTCOUNT, printcount);
	}

	public List findBySendman(Object sendman) {
		return findByProperty(SENDMAN, sendman);
	}

	public List findByHdflag(Object hdflag) {
		return findByProperty(HDFLAG, hdflag);
	}

	public List findByExportflag(Object exportflag) {
		return findByProperty(EXPORTFLAG, exportflag);
	}

	public List findByIssetseries(Object issetseries) {
		return findByProperty(ISSETSERIES, issetseries);
	}

	public List findByEprintflg(Object eprintflg) {
		return findByProperty(EPRINTFLG, eprintflg);
	}

	public List findByEprintman(Object eprintman) {
		return findByProperty(EPRINTMAN, eprintman);
	}

	public List findByEprintmanname(Object eprintmanname) {
		return findByProperty(EPRINTMANNAME, eprintmanname);
	}

	public List findByEprintcount(Object eprintcount) {
		return findByProperty(EPRINTCOUNT, eprintcount);
	}

	public List findByTransman(Object transman) {
		return findByProperty(TRANSMAN, transman);
	}

	public List findByIswritebackflg(Object iswritebackflg) {
		return findByProperty(ISWRITEBACKFLG, iswritebackflg);
	}

	public List findByValidflag(Object validflag) {
		return findByProperty(VALIDFLAG, validflag);
	}

	public List findByDealerflag(Object dealerflag) {
		return findByProperty(DEALERFLAG, dealerflag);
	}

	public List findBySplitflag(Object splitflag) {
		return findByProperty(SPLITFLAG, splitflag);
	}

	public List findByMergeflag(Object mergeflag) {
		return findByProperty(MERGEFLAG, mergeflag);
	}

	public List findBySourceopt(Object sourceopt) {
		return findByProperty(SOURCEOPT, sourceopt);
	}

	public List findByCouponsum(Object couponsum) {
		return findByProperty(COUPONSUM, couponsum);
	}

	public List findByOrderfrom(Object orderfrom) {
		return findByProperty(ORDERFROM, orderfrom);
	}

	public List findByDistributorid(Object distributorid) {
		return findByProperty(DISTRIBUTORID, distributorid);
	}

	public List findByDistributornick(Object distributornick) {
		return findByProperty(DISTRIBUTORNICK, distributornick);
	}

	public List findBySendsite(Object sendsite) {
		return findByProperty(SENDSITE, sendsite);
	}

	public List findBySendtype(Object sendtype) {
		return findByProperty(SENDTYPE, sendtype);
	}

	public List findByReturnflag(Object returnflag) {
		return findByProperty(RETURNFLAG, returnflag);
	}

	public List findByOrderconfirm(Object orderconfirm) {
		return findByProperty(ORDERCONFIRM, orderconfirm);
	}

	public List findByLogisticconfirm(Object logisticconfirm) {
		return findByProperty(LOGISTICCONFIRM, logisticconfirm);
	}

	public List findByActualorderfee(Object actualorderfee) {
		return findByProperty(ACTUALORDERFEE, actualorderfee);
	}

	public List findByDefshelf(Object defshelf) {
		return findByProperty(DEFSHELF, defshelf);
	}

	public List findBySupplierno(Object supplierno) {
		return findByProperty(SUPPLIERNO, supplierno);
	}

	public List findByPurchaseflag(Object purchaseflag) {
		return findByProperty(PURCHASEFLAG, purchaseflag);
	}

	public List findByPrintexportflag(Object printexportflag) {
		return findByProperty(PRINTEXPORTFLAG, printexportflag);
	}

	public List findByGoodsendtype(Object goodsendtype) {
		return findByProperty(GOODSENDTYPE, goodsendtype);
	}

	public List findByAttachment(Object attachment) {
		return findByProperty(ATTACHMENT, attachment);
	}

	public List findByBillcompany(Object billcompany) {
		return findByProperty(BILLCOMPANY, billcompany);
	}

	public List findByOrdershouldpay(Object ordershouldpay) {
		return findByProperty(ORDERSHOULDPAY, ordershouldpay);
	}

	public List findByPlatformdisc(Object platformdisc) {
		return findByProperty(PLATFORMDISC, platformdisc);
	}

	public List findAll() {
		log.debug("finding all EcEordermst instances");
		try {
			String queryString = "from EcEordermst";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EcEordermst merge(EcEordermst detachedInstance) {
		log.debug("merging EcEordermst instance");
		try {
			EcEordermst result = (EcEordermst) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EcEordermst instance) {
		log.debug("attaching dirty EcEordermst instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EcEordermst instance) {
		log.debug("attaching clean EcEordermst instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IEcEordermstDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IEcEordermstDAO) ctx.getBean("EcEordermstDAO");
	}
}