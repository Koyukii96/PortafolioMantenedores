package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TipoServicioDAO;
import com.jwt.model.TipoServicio;

@Service
@Transactional
public class TipoServicioServiceImpl implements TipoServicioService {

	@Autowired
	private TipoServicioDAO tipoDAO;

	@Override
	@Transactional
	public void addTipoServicio(TipoServicio tipo) {
		tipoDAO.addTipoServicio(tipo);
	}

	@Override
	@Transactional
	public List<TipoServicio> getAllTipoServicio() {
		return tipoDAO.getAllTipoServicio();
	}

	@Override
	@Transactional
	public void deleteTipoServicio(Integer tipoId) {
		tipoDAO.deleteTipoServicio(tipoId);
	}

	public TipoServicio getTipoServicio(int tipoId) {
		return tipoDAO.getTipoServicio(tipoId);
	}

	public TipoServicio updateTipoServicio(TipoServicio tipo) {
		// TODO Auto-generated method stub
		return tipoDAO.updateTipoServicio(tipo);
	}

	public void setTipoServicioDAO(TipoServicioDAO tipoDAO) {
		this.tipoDAO = tipoDAO;
	}

}