package com.wantdo.cost.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wantdo.cost.dao.IPersonDAO;
import com.wantdo.cost.model.Person;


/**
 * A data access object (DAO) providing persistence and search support for
 * Person entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.wantdo.cost.model.domain.Person
 * @author MyEclipse Persistence Tools
 */
public class PersonDAO extends HibernateDaoSupport implements IPersonDAO {
	private static final Logger log = LoggerFactory.getLogger(PersonDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";

	protected void initDao() {
		// do nothing
	}

	
	/* (非 Javadoc) 
	* <p>Title: save</p> 
	* <p>Description: </p> 
	* @param transientInstance 
	* @see com.wantdo.dao.impl.IPersonDAO#save(com.wantdo.domain.Person) 
	*/ 
	@Override
	public void save(Person transientInstance) {
		log.debug("saving Person instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Person persistentInstance) {
		log.debug("deleting Person instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	public boolean checkLogin(Person person){
		log.debug("finding Person instance by example");
		try {
			String queryString="from Person as model where " +
					"model.username=? and model.password=?";
			return getHibernateTemplate().find(queryString,
					new Object[]{person.getUsername(),person.getPassword()}).size()>0;
		} catch (RuntimeException re) {
			log.error("find by person failed", re);
			throw re;
		}
	}

	
	/* (非 Javadoc) 
	* <p>Title: findById</p> 
	* <p>Description: </p> 
	* @param id
	* @return 
	* @see com.wantdo.dao.impl.IPersonDAO#findById(java.lang.Integer) 
	*/ 
	@Override
	public Person findById(java.lang.Integer id) {
		log.debug("getting Person instance with id: " + id);
		try {
			Person instance = (Person) getHibernateTemplate().get(
					"com.wantdo.cost.model.Person", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Person instance) {
		log.debug("finding Person instance by example");
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
		log.debug("finding Person instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Person as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	
	/* (非 Javadoc) 
	* <p>Title: findByUsername</p> 
	* <p>Description: </p> 
	* @param username
	* @return 
	* @see com.wantdo.dao.impl.IPersonDAO#findByUsername(java.lang.Object) 
	*/ 
	@Override
	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	
	/* (非 Javadoc) 
	* <p>Title: findAll</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.wantdo.dao.impl.IPersonDAO#findAll() 
	*/ 
	@Override
	public List findAll() {
		log.debug("finding all Person instances");
		try {
			String queryString = "from Person";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Person merge(Person detachedInstance) {
		log.debug("merging Person instance");
		try {
			Person result = (Person) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Person instance) {
		log.debug("attaching dirty Person instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Person instance) {
		log.debug("attaching clean Person instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IPersonDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IPersonDAO) ctx.getBean("PersonDAO");
	}
}