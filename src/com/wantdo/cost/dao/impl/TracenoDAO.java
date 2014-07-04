package com.wantdo.cost.dao.impl;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.ITracenoDAO;
import com.wantdo.cost.model.Traceno;

/**
 * A data access object (DAO) providing persistence and search support for
 * Traceno entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.Traceno
 * @author MyEclipse Persistence Tools
 */
public class TracenoDAO extends HibernateDaoSupport implements ITracenoDAO {
	private static final Logger log = LoggerFactory.getLogger(TracenoDAO.class);
	// property constants
	public static final String TRACENO = "traceno";

	protected void initDao() {
		// do nothing
	}

	public void save(Traceno transientInstance) {
		log.debug("saving Traceno instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	// 批量存储
	public void saveTracenos(String[] tracenos) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		try {
			for (int i = 0; i < tracenos.length; i++) {
				Traceno traceno = new Traceno();
				traceno.setTraceno(tracenos[i]); 
				session.save(traceno);

				if (i % 30 == 0) {
					session.flush();
					session.clear();
				}
			}
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseSession(session);
		}

	}

	public void delete(Traceno persistentInstance) {
		log.debug("deleting Traceno instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	// 删除表中所有的记录
	public void deleteTableData() { // 删除表中所有数据
		String queryString = "delete Traceno where 1=1";
		Session session = getSession();
		Transaction tx = session.beginTransaction();

		try {
			Query query = session.createQuery(queryString);
			query.executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			releaseSession(session);
		}

	}

	public Traceno findById(java.lang.Integer id) {
		log.debug("getting Traceno instance with id: " + id);
		try {
			Traceno instance = (Traceno) getHibernateTemplate().get(
					"com.wantdo.cost.model.Traceno", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Traceno instance) {
		log.debug("finding Traceno instance by example");
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
		log.debug("finding Traceno instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Traceno as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTraceno(Object traceno) {
		return findByProperty(TRACENO, traceno);
	}

	public List findAll() {
		log.debug("finding all Traceno instances");
		try {
			String queryString = "from Traceno";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Traceno merge(Traceno detachedInstance) {
		log.debug("merging Traceno instance");
		try {
			Traceno result = (Traceno) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Traceno instance) {
		log.debug("attaching dirty Traceno instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Traceno instance) {
		log.debug("attaching clean Traceno instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TracenoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TracenoDAO) ctx.getBean("TracenoDAO");
	}
}