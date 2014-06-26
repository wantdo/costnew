package com.wantdo.cost.service.impl;

import java.util.List;

import com.wantdo.cost.dao.IPersonDAO;
import com.wantdo.cost.model.Person;
import com.wantdo.cost.service.IPersonService;


public class PersonService implements IPersonService{
	
	private IPersonDAO personDAO;

	@Override
	public void save(Person transientInstance) {
		// TODO Auto-generated method stub
		personDAO.save(transientInstance);
	}

	@Override
	public Person getById(Integer id) {
		// TODO Auto-generated method stub
		return personDAO.findById(id);
	}

	@Override
	public List getByUsername(Object username) {
		// TODO Auto-generated method stub
		return personDAO.findByUsername(username);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return personDAO.findAll();
	}

	@Override
	public boolean checkLogin(Person person){
		// TODO Auto-generated method stub
		return personDAO.checkLogin(person);
	}

	public IPersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(IPersonDAO personDAO) {
		this.personDAO = personDAO;
	}

}
