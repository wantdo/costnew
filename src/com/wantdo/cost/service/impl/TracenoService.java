package com.wantdo.cost.service.impl;

import com.wantdo.cost.dao.ITracenoDAO;
import com.wantdo.cost.model.Traceno;
import com.wantdo.cost.service.ITracenoService;

public class TracenoService implements ITracenoService {
	private ITracenoDAO tracenoDAO;

	public ITracenoDAO getTracenoDAO() {
		return tracenoDAO;
	}

	public void setTracenoDAO(ITracenoDAO tracenoDAO) {
		this.tracenoDAO = tracenoDAO;
	}

	@Override
	public void save(Traceno transientInstance) {
		tracenoDAO.save(transientInstance);
	}

	@Override
	public Traceno findById(Integer id) {
		return tracenoDAO.findById(id);
	}

	@Override
	public void delete(Traceno persistentInstance) {
		tracenoDAO.delete(persistentInstance);
	}

	@Override
	public void saveTracenos(String[] tracenos) {
		tracenoDAO.saveTracenos(tracenos);
	}

	@Override
	public void deleteTableData() {
		tracenoDAO.deleteTableData();
	}
	
}
