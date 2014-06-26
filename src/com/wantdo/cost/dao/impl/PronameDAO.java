package com.wantdo.cost.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IPronameDAO;
import com.wantdo.cost.model.Proname;

/**
 * A data access object (DAO) providing persistence and search support for
 * Proname entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.Proname
 * @author MyEclipse Persistence Tools
 */
public class PronameDAO extends HibernateDaoSupport implements IPronameDAO{
	private static final Logger log = LoggerFactory.getLogger(PronameDAO.class);
	// property constants
	public static final String PROVINCE = "province";

	protected void initDao() {
		// do nothing
	}

	public void save(Proname transientInstance) {
		log.debug("saving Proname instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Proname persistentInstance) {
		log.debug("deleting Proname instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Proname findById(java.lang.Integer id) {
		log.debug("getting Proname instance with id: " + id);
		try {
			Proname instance = (Proname) getHibernateTemplate().get(
					"com.wantdo.cost.model.Proname", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Proname instance) {
		log.debug("finding Proname instance by example");
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
		log.debug("finding Proname instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Proname as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByProvince(Object province) {
		return findByProperty(PROVINCE, province);
	}

	/*public List findAll() {
		System.out.println("-------------------------DAO");
		log.debug("finding all Proname instances");
		try {
			String queryString = "from Proname";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}*/
	public List findAll(){
    	HibernateCallback callback=new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				Query queryObject = session.createQuery("from Proname");
				List<Proname>list= queryObject.list();			
				return list;
			}
		};
    	return (List) getHibernateTemplate().execute(callback);
    }

	public Proname merge(Proname detachedInstance) {
		log.debug("merging Proname instance");
		try {
			Proname result = (Proname) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Proname instance) {
		log.debug("attaching dirty Proname instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Proname instance) {
		log.debug("attaching clean Proname instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PronameDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PronameDAO) ctx.getBean("PronameDAO");
	}
}