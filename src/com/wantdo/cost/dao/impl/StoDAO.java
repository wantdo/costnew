package com.wantdo.cost.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IStoDAO;
import com.wantdo.cost.model.Sto;

/**
 * A data access object (DAO) providing persistence and search support for Sto
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.wantdo.cost.model.Sto
 * @author MyEclipse Persistence Tools
 */
public class StoDAO extends HibernateDaoSupport implements IStoDAO{
	private static final Logger log = LoggerFactory.getLogger(StoDAO.class);
	// property constants
	public static final String PROVINCEID = "provinceid";
	public static final String FIRST_WEIGHT = "firstWeight";
	public static final String FIRST_PRICE = "firstPrice";
	public static final String SEC_PRICE = "secPrice";

	protected void initDao() {
		// do nothing
	}

	public void save(Sto transientInstance) {
		log.debug("saving Sto instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sto persistentInstance) {
		log.debug("deleting Sto instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	@Override
	public void update(Sto updateInstance) {
		log.debug("updating Sto instance");
        try {
            getHibernateTemplate().update(updateInstance);
            log.debug("update successful");
        } catch (RuntimeException re) {
            log.error("update failed", re);
            throw re;
        }
	}

	public Sto findById(java.lang.Integer id) {
		log.debug("getting Sto instance with id: " + id);
		try {
			Sto instance = (Sto) getHibernateTemplate().get(
					"com.wantdo.cost.model.Sto", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sto instance) {
		log.debug("finding Sto instance by example");
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
		log.debug("finding Sto instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sto as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProvinceid(Object provinceid) {
		return findByProperty(PROVINCEID, provinceid);
	}

	public List findByFirstWeight(Object firstWeight) {
		return findByProperty(FIRST_WEIGHT, firstWeight);
	}

	public List findByFirstPrice(Object firstPrice) {
		return findByProperty(FIRST_PRICE, firstPrice);
	}

	public List findBySecPrice(Object secPrice) {
		return findByProperty(SEC_PRICE, secPrice);
	}

	public List findAll() {
		log.debug("finding all Sto instances");
		try {
			String queryString = "from Sto";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sto merge(Sto detachedInstance) {
		log.debug("merging Sto instance");
		try {
			Sto result = (Sto) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sto instance) {
		log.debug("attaching dirty Sto instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sto instance) {
		log.debug("attaching clean Sto instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static StoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (StoDAO) ctx.getBean("StoDAO");
	}
}