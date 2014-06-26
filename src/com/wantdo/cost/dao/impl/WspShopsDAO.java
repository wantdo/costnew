package com.wantdo.cost.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IWspShopsDAO;
import com.wantdo.cost.model.WspShops;

/**
 * A data access object (DAO) providing persistence and search support for
 * WspShops entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.WspShops
 * @author MyEclipse Persistence Tools
 */
public class WspShopsDAO extends HibernateDaoSupport implements IWspShopsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(WspShopsDAO.class);
	// property constants
	public static final String SYSID = "sysid";
	public static final String SHOPNAME = "shopname";
	public static final String URL = "url";
	public static final String APPKEY = "appkey";
	public static final String SECRET = "secret";
	public static final String LOGINNAME = "loginname";
	public static final String LINKMAN = "linkman";
	public static final String TELEPHONE = "telephone";
	public static final String ITEMLISTID = "itemlistid";
	public static final String ORDERSOURCE = "ordersource";
	public static final String ORDERTYPE = "ordertype";
	public static final String OCODE = "ocode";
	public static final String DEPTNO = "deptno";
	public static final String EMPNO = "empno";
	public static final String OPERATOR = "operator";
	public static final String HUIKUANTYPE = "huikuantype";
	public static final String BILLTYPE = "billtype";
	public static final String CUSTOMSOURCE = "customsource";
	public static final String CUSTOMTYPE = "customtype";
	public static final String CUSTOMGROUP = "customgroup";
	public static final String INVENTORYRATE = "inventoryrate";
	public static final String ORDERCOMP = "ordercomp";
	public static final String CELLPHONE = "cellphone";
	public static final String ZIPCODE = "zipcode";
	public static final String RECADDR = "recaddr";
	public static final String DELIVERADDR = "deliveraddr";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String REGION = "region";
	public static final String BILLTITLE = "billtitle";
	public static final String BILLCONTENT = "billcontent";
	public static final String UIN = "uin";
	public static final String SEC_KEY = "secKey";
	public static final String CUSTOMNO = "customno";
	public static final String LOGISTIC = "logistic";
	public static final String SHOPID = "shopid";
	public static final String SESSION_KEY = "sessionKey";
	public static final String LOGISTICTYPE = "logistictype";
	public static final String ISNOTBACK = "isnotback";
	public static final String ISENABLE = "isenable";
	public static final String HDLOGISTIC = "hdlogistic";
	public static final String DEALERFLAG = "dealerflag";
	public static final String REFRESHTOKEN = "refreshtoken";

	protected void initDao() {
		// do nothing
	}

	
	/* (非 Javadoc) 
	* <p>Title: save</p> 
	* <p>Description: </p> 
	* @param transientInstance 
	* @see com.wantdo.cost.dao.impl.IWspShopsDAO#save(com.wantdo.cost.shops.WspShops) 
	*/ 
	@Override
	public void save(WspShops transientInstance) {
		log.debug("saving WspShops instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(WspShops persistentInstance) {
		log.debug("deleting WspShops instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	
	/* (非 Javadoc) 
	* <p>Title: findById</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see com.wantdo.cost.dao.impl.IWspShopsDAO#findById(java.lang.Integer) 
	*/ 
	@Override
	public WspShops findById(java.lang.Integer id) {
		log.debug("getting WspShops instance with id: " + id);
		try {
			WspShops instance = (WspShops) getHibernateTemplate().get(
					"com.wantdo.cost.model.WspShops", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(WspShops instance) {
		log.debug("finding WspShops instance by example");
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
		log.debug("finding WspShops instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from WspShops as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	
	/* (非 Javadoc) 
	* <p>Title: findBySysid</p> 
	* <p>Description: </p> 
	* @param sysid
	* @return 
	* @see com.wantdo.cost.dao.impl.IWspShopsDAO#findBySysid(java.lang.Object) 
	*/ 
	@Override
	public List findBySysid(Object sysid) {
		return findByProperty(SYSID, sysid);
	}

	
	/* (非 Javadoc) 
	* <p>Title: findByShopname</p> 
	* <p>Description: </p> 
	* @param shopname
	* @return 
	* @see com.wantdo.cost.dao.impl.IWspShopsDAO#findByShopname(java.lang.Object) 
	*/ 
	@Override
	public List findByShopname(Object shopname) {
		return findByProperty(SHOPNAME, shopname);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByAppkey(Object appkey) {
		return findByProperty(APPKEY, appkey);
	}

	public List findBySecret(Object secret) {
		return findByProperty(SECRET, secret);
	}

	public List findByLoginname(Object loginname) {
		return findByProperty(LOGINNAME, loginname);
	}

	public List findByLinkman(Object linkman) {
		return findByProperty(LINKMAN, linkman);
	}

	public List findByTelephone(Object telephone) {
		return findByProperty(TELEPHONE, telephone);
	}

	public List findByItemlistid(Object itemlistid) {
		return findByProperty(ITEMLISTID, itemlistid);
	}

	public List findByOrdersource(Object ordersource) {
		return findByProperty(ORDERSOURCE, ordersource);
	}

	public List findByOrdertype(Object ordertype) {
		return findByProperty(ORDERTYPE, ordertype);
	}

	public List findByOcode(Object ocode) {
		return findByProperty(OCODE, ocode);
	}

	public List findByDeptno(Object deptno) {
		return findByProperty(DEPTNO, deptno);
	}

	public List findByEmpno(Object empno) {
		return findByProperty(EMPNO, empno);
	}

	public List findByOperator(Object operator) {
		return findByProperty(OPERATOR, operator);
	}

	public List findByHuikuantype(Object huikuantype) {
		return findByProperty(HUIKUANTYPE, huikuantype);
	}

	public List findByBilltype(Object billtype) {
		return findByProperty(BILLTYPE, billtype);
	}

	public List findByCustomsource(Object customsource) {
		return findByProperty(CUSTOMSOURCE, customsource);
	}

	public List findByCustomtype(Object customtype) {
		return findByProperty(CUSTOMTYPE, customtype);
	}

	public List findByCustomgroup(Object customgroup) {
		return findByProperty(CUSTOMGROUP, customgroup);
	}

	public List findByInventoryrate(Object inventoryrate) {
		return findByProperty(INVENTORYRATE, inventoryrate);
	}

	public List findByOrdercomp(Object ordercomp) {
		return findByProperty(ORDERCOMP, ordercomp);
	}

	public List findByCellphone(Object cellphone) {
		return findByProperty(CELLPHONE, cellphone);
	}

	public List findByZipcode(Object zipcode) {
		return findByProperty(ZIPCODE, zipcode);
	}

	public List findByRecaddr(Object recaddr) {
		return findByProperty(RECADDR, recaddr);
	}

	public List findByDeliveraddr(Object deliveraddr) {
		return findByProperty(DELIVERADDR, deliveraddr);
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	public List findByCity(Object city) {
		return findByProperty(CITY, city);
	}

	public List findByRegion(Object region) {
		return findByProperty(REGION, region);
	}

	public List findByBilltitle(Object billtitle) {
		return findByProperty(BILLTITLE, billtitle);
	}

	public List findByBillcontent(Object billcontent) {
		return findByProperty(BILLCONTENT, billcontent);
	}

	public List findByUin(Object uin) {
		return findByProperty(UIN, uin);
	}

	public List findBySecKey(Object secKey) {
		return findByProperty(SEC_KEY, secKey);
	}

	public List findByCustomno(Object customno) {
		return findByProperty(CUSTOMNO, customno);
	}

	public List findByLogistic(Object logistic) {
		return findByProperty(LOGISTIC, logistic);
	}

	public List findByShopid(Object shopid) {
		return findByProperty(SHOPID, shopid);
	}

	public List findBySessionKey(Object sessionKey) {
		return findByProperty(SESSION_KEY, sessionKey);
	}

	public List findByLogistictype(Object logistictype) {
		return findByProperty(LOGISTICTYPE, logistictype);
	}

	public List findByIsnotback(Object isnotback) {
		return findByProperty(ISNOTBACK, isnotback);
	}

	public List findByIsenable(Object isenable) {
		return findByProperty(ISENABLE, isenable);
	}

	public List findByHdlogistic(Object hdlogistic) {
		return findByProperty(HDLOGISTIC, hdlogistic);
	}

	public List findByDealerflag(Object dealerflag) {
		return findByProperty(DEALERFLAG, dealerflag);
	}

	public List findByRefreshtoken(Object refreshtoken) {
		return findByProperty(REFRESHTOKEN, refreshtoken);
	}

	public List findAll() {
		log.debug("finding all WspShops instances");
		try {
			String queryString = "from WspShops";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public WspShops merge(WspShops detachedInstance) {
		log.debug("merging WspShops instance");
		try {
			WspShops result = (WspShops) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(WspShops instance) {
		log.debug("attaching dirty WspShops instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(WspShops instance) {
		log.debug("attaching clean WspShops instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IWspShopsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IWspShopsDAO) ctx.getBean("WspShopsDAO");
	}
}