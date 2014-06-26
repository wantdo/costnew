package com.wantdo.cost.dao.impl;

import java.sql.SQLException;
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

import com.wantdo.cost.dao.IEditLogDAO;
import com.wantdo.cost.model.EditLog;

/**
 * A data access object (DAO) providing persistence and search support for
 * EditLog entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.EditLog
 * @author MyEclipse Persistence Tools
 */
public class EditLogDAO extends HibernateDaoSupport implements IEditLogDAO{
	private static final Logger log = LoggerFactory.getLogger(EditLogDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String CLASS_ = "class_";
	public static final String MOTHOD = "mothod";
	public static final String CREATETIME = "createtime";
	public static final String LOGLEVEL = "loglevel";
	public static final String MSG = "msg";

	protected void initDao() {
		// do nothing
	}

	public void save(EditLog transientInstance) {
		log.debug("saving EditLog instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EditLog persistentInstance) {
		log.debug("deleting EditLog instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EditLog findById(java.lang.Integer id) {
		log.debug("getting EditLog instance with id: " + id);
		try {
			EditLog instance = (EditLog) getHibernateTemplate().get(
					"com.wantdo.cost.model.EditLog", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EditLog instance) {
		log.debug("finding EditLog instance by example");
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
		log.debug("finding EditLog instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EditLog as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByClass_(Object class_) {
		return findByProperty(CLASS_, class_);
	}

	public List findByMothod(Object mothod) {
		return findByProperty(MOTHOD, mothod);
	}

	public List findByCreatetime(Object createtime) {
		return findByProperty(CREATETIME, createtime);
	}

	public List findByLoglevel(Object loglevel) {
		return findByProperty(LOGLEVEL, loglevel);
	}

	public List findByMsg(Object msg) {
		return findByProperty(MSG, msg);
	}

	/*public List findAll() {
		log.debug("finding all EditLog instances");
		try {
			String queryString = "from EditLog order by logid desc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			//log.error("find all failed", re);
			throw re;
		}
	}*/
	public List findAll(){ 
		List list = getHibernateTemplate().executeFind(new HibernateCallback(){ 
			public Object doInHibernate(Session session) throws HibernateException,SQLException{ 
				Query query = session.createQuery("from EditLog order by logid desc"); 
				query.setFirstResult(0); 
				query.setMaxResults(50); 
				List list = query.list(); 
				return list; 
			} 
		}); 
		return list; 
	} 

	public EditLog merge(EditLog detachedInstance) {
		log.debug("merging EditLog instance");
		try {
			EditLog result = (EditLog) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EditLog instance) {
		log.debug("attaching dirty EditLog instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EditLog instance) {
		log.debug("attaching clean EditLog instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EditLogDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EditLogDAO) ctx.getBean("EditLogDAO");
	}
	
	/** *//** 
	* 分页查询 
	* @param hql 查询的条件 
	* @param offset 开始记录 
	* @param length 一次查询几条记录 
	* @return 
	*/ 
	public List queryForPage(final String hql,final int offset,final int length){ 
		List list = getHibernateTemplate().executeFind(new HibernateCallback(){ 
			public Object doInHibernate(Session session) throws HibernateException,SQLException{ 
				Query query = session.createQuery(hql); 
				query.setFirstResult(offset); 
				query.setMaxResults(length); 
				List list = query.list(); 
				return list; 
			} 
		}); 
		return list; 
	} 


	/** *//** 
	* 查询所有记录数 
	* @return 总记录数 
	*/ 
	public int getAllRowCount(String hql){ 
	return getHibernateTemplate().find(hql).size(); 
	} 
}