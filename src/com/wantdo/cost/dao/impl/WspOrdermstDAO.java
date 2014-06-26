package com.wantdo.cost.dao.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IWspOrdermstDAO;
import com.wantdo.cost.model.WspOrdermst;

/**
 * A data access object (DAO) providing persistence and search support for
 * WspOrdermst entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.WspOrdermst
 * @author MyEclipse Persistence Tools
 */
public class WspOrdermstDAO extends HibernateDaoSupport implements
		IWspOrdermstDAO {
	private static final Logger log = LoggerFactory
			.getLogger(WspOrdermstDAO.class);
	// property constants
	public static final String SYSID = "sysid";
	public static final String SHOPID = "shopid";
	public static final String ORDSTATUS = "ordstatus";
	public static final String REMARKS = "remarks";
	public static final String SELLERREMARKS = "sellerremarks";
	public static final String TRANNO = "tranno";
	public static final String RELID = "relid";
	public static final String ORDTYPE = "ordtype";
	public static final String PRONO = "prono";
	public static final String CITY = "city";
	public static final String REGION = "region";
	public static final String RECADDR = "recaddr";
	public static final String LINKTEL = "linktel";
	public static final String HANDSET = "handset";
	public static final String ZIPCODE = "zipcode";
	public static final String LINKMAN = "linkman";
	public static final String SHIPCOMP = "shipcomp";
	public static final String ORDERSUM = "ordersum";
	public static final String SHOPDISC = "shopdisc";
	public static final String SYSDISC = "sysdisc";
	public static final String ORDERPAYSUM = "orderpaysum";
	public static final String ORDERFEE = "orderfee";
	public static final String PAYPLAT = "payplat";
	public static final String MEMBERNAME = "membername";
	public static final String MEMBERID = "memberid";
	public static final String BILLTYPE = "billtype";
	public static final String BILLTITLE = "billtitle";
	public static final String BILLCONTENT = "billcontent";
	public static final String BILLAMOUNT = "billamount";
	public static final String ISTRAN = "istran";
	public static final String TRANSNAPSHOT = "transnapshot";
	public static final String EMAIL = "email";
	public static final String BUYERREMARKS = "buyerremarks";
	public static final String SENDTYPE = "sendtype";
	public static final String DELETEFLAG = "deleteflag";
	public static final String HDFLAG = "hdflag";
	public static final String COUPONSUM = "couponsum";
	public static final String DISTRIBUTORTYPE = "distributortype";
	public static final String SOURCEOPT = "sourceopt";
	public static final String DISTRIBUTORID = "distributorid";
	public static final String DEALERFLAG = "dealerflag";
	public static final String DISTRIBUTORNAME = "distributorname";
	public static final String SENDSITE = "sendsite";
	public static final String ATTACHMENT = "attachment";
	public static final String BILLCOMPANY = "billcompany";
	public static final String ORDERSHOULDPAY = "ordershouldpay";

	protected void initDao() {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wantdo.cost.wsp.IWspOrdermstDAO#save(com.wantdo.cost.wsp.WspOrdermst)
	 */
	@Override
	public void save(WspOrdermst transientInstance) {
		log.debug("saving WspOrdermst instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WspOrdermst persistentInstance) {
		log.debug("deleting WspOrdermst instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wantdo.cost.wsp.IWspOrdermstDAO#findById(java.lang.String)
	 */
	@Override
	public WspOrdermst findById(java.lang.String id) {
		log.debug("getting WspOrdermst instance with id: " + id);
		try {
			WspOrdermst instance = (WspOrdermst) getHibernateTemplate().get(
					"com.wantdo.cost.model.WspOrdermst", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WspOrdermst instance) {
		log.debug("finding WspOrdermst instance by example");
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
		log.debug("finding WspOrdermst instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WspOrdermst as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTraceno(Object traceno) {
		try {
			String queryString = "from WspOrdermst wsp,EcEordermst ec,WspShops shops,Province pro"
					+ " where wsp.relid=ec.relid and wsp.shopid=shops.id and "
					+ "substring(ec.province,1,3)=pro.id.provinceno and ec.traceno=? ";
			return getHibernateTemplate().find(queryString, traceno);
		} catch (RuntimeException e) {
			throw e;
		}
	}

	@Override
	public List<Object[]> findByTracenos(String[] tracenos) {
		try {
			String queryString = "from WspOrdermst wsp,EcEordermst ec,WspShops shops,Province pro"
					+ " where wsp.relid=ec.relid and wsp.shopid=shops.id and "
					+ "substring(ec.province,1,3)=pro.id.provinceno and ec.traceno in (:tracenos) ";
			Query query = getSession().createQuery(queryString);
			query.setParameterList("tracenos", tracenos);
			return query.list();
		} catch (RuntimeException e) {
			throw e;
		}

	}

	public List<Object[]> findByTracenosNew() {
		try {
			String queryString = "from Traceno tr,WspOrdermst wsp,EcEordermst ec,WspShops shops,Province pro"
					+ " where wsp.relid=ec.relid and wsp.shopid=shops.id and "
					+ "substring(ec.province,1,3)=pro.id.provinceno and ec.traceno=tr.traceno ";
			Query query = getSession().createQuery(queryString);
			return query.list();
		} catch (RuntimeException e) {
			throw e;	
		}

	}

	public List<Object[]> findShopStat() {
		return getHibernateTemplate().execute(
				new HibernateCallback<List<Object[]>>() {

					@Override
					public List<Object[]> doInHibernate(Session session)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						String queryString = "select shops.id,shops.shopname,sum(wsp.orderpaysum) as totalsum "
								+ "from WspOrdermst wsp, WspShops shops "
								+ "where wsp.shopid=shops.id "
								+ "group by shops.id,shops.shopname "
								+ "order by shops.id asc";
						Query query = session.createQuery(queryString);
						return query.list();
					}
				});
	}

	public List findBySysid(Object sysid) {
		return findByProperty(SYSID, sysid);
	}

	public List findByShopid(Object shopid) {
		return findByProperty(SHOPID, shopid);
	}

	public List findByOrdstatus(Object ordstatus) {
		return findByProperty(ORDSTATUS, ordstatus);
	}

	public List findByRemarks(Object remarks) {
		return findByProperty(REMARKS, remarks);
	}

	public List findBySellerremarks(Object sellerremarks) {
		return findByProperty(SELLERREMARKS, sellerremarks);
	}

	public List findByTranno(Object tranno) {
		return findByProperty(TRANNO, tranno);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wantdo.cost.wsp.IWspOrdermstDAO#findByRelid(java.lang.Object)
	 */
	@Override
	public List findByRelid(Object relid) {
		return findByProperty(RELID, relid);
	}

	public List findByOrdtype(Object ordtype) {
		return findByProperty(ORDTYPE, ordtype);
	}

	public List findByProno(Object prono) {
		return findByProperty(PRONO, prono);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByRegion(Object region) {
		return findByProperty(REGION, region);
	}

	public List findByRecaddr(Object recaddr) {
		return findByProperty(RECADDR, recaddr);
	}

	public List findByLinktel(Object linktel) {
		return findByProperty(LINKTEL, linktel);
	}

	public List findByHandset(Object handset) {
		return findByProperty(HANDSET, handset);
	}

	public List findByZipcode(Object zipcode) {
		return findByProperty(ZIPCODE, zipcode);
	}

	public List findByLinkman(Object linkman) {
		return findByProperty(LINKMAN, linkman);
	}

	public List findByShipcomp(Object shipcomp) {
		return findByProperty(SHIPCOMP, shipcomp);
	}

	public List findByOrdersum(Object ordersum) {
		return findByProperty(ORDERSUM, ordersum);
	}

	public List findByShopdisc(Object shopdisc) {
		return findByProperty(SHOPDISC, shopdisc);
	}

	public List findBySysdisc(Object sysdisc) {
		return findByProperty(SYSDISC, sysdisc);
	}

	public List findByOrderpaysum(Object orderpaysum) {
		return findByProperty(ORDERPAYSUM, orderpaysum);
	}

	public List findByOrderfee(Object orderfee) {
		return findByProperty(ORDERFEE, orderfee);
	}

	public List findByPayplat(Object payplat) {
		return findByProperty(PAYPLAT, payplat);
	}

	public List findByMembername(Object membername) {
		return findByProperty(MEMBERNAME, membername);
	}

	public List findByMemberid(Object memberid) {
		return findByProperty(MEMBERID, memberid);
	}

	public List findByBilltype(Object billtype) {
		return findByProperty(BILLTYPE, billtype);
	}

	public List findByBilltitle(Object billtitle) {
		return findByProperty(BILLTITLE, billtitle);
	}

	public List findByBillcontent(Object billcontent) {
		return findByProperty(BILLCONTENT, billcontent);
	}

	public List findByBillamount(Object billamount) {
		return findByProperty(BILLAMOUNT, billamount);
	}

	public List findByIstran(Object istran) {
		return findByProperty(ISTRAN, istran);
	}

	public List findByTransnapshot(Object transnapshot) {
		return findByProperty(TRANSNAPSHOT, transnapshot);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByBuyerremarks(Object buyerremarks) {
		return findByProperty(BUYERREMARKS, buyerremarks);
	}

	public List findBySendtype(Object sendtype) {
		return findByProperty(SENDTYPE, sendtype);
	}

	public List findByDeleteflag(Object deleteflag) {
		return findByProperty(DELETEFLAG, deleteflag);
	}

	public List findByHdflag(Object hdflag) {
		return findByProperty(HDFLAG, hdflag);
	}

	public List findByCouponsum(Object couponsum) {
		return findByProperty(COUPONSUM, couponsum);
	}

	public List findByDistributortype(Object distributortype) {
		return findByProperty(DISTRIBUTORTYPE, distributortype);
	}

	public List findBySourceopt(Object sourceopt) {
		return findByProperty(SOURCEOPT, sourceopt);
	}

	public List findByDistributorid(Object distributorid) {
		return findByProperty(DISTRIBUTORID, distributorid);
	}

	public List findByDealerflag(Object dealerflag) {
		return findByProperty(DEALERFLAG, dealerflag);
	}

	public List findByDistributorname(Object distributorname) {
		return findByProperty(DISTRIBUTORNAME, distributorname);
	}

	public List findBySendsite(Object sendsite) {
		return findByProperty(SENDSITE, sendsite);
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

	public List findAll() {
		log.debug("finding all WspOrdermst instances");
		try {
			String queryString = "from WspOrdermst";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WspOrdermst merge(WspOrdermst detachedInstance) {
		log.debug("merging WspOrdermst instance");
		try {
			WspOrdermst result = (WspOrdermst) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WspOrdermst instance) {
		log.debug("attaching dirty WspOrdermst instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WspOrdermst instance) {
		log.debug("attaching clean WspOrdermst instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IWspOrdermstDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IWspOrdermstDAO) ctx.getBean("WspOrdermstDAO");
	}

}