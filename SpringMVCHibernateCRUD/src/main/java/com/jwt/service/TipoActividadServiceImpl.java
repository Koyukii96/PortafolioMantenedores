package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TipoActividadDAO;
import com.jwt.model.TipoActividad;

@Service
@Transactional
public class TipoActividadServiceImpl implements TipoActividadService {

	@Autowired
	private TipoActividadDAO tipoDAO;

	@Override
	@Transactional
	public void addTipoActividad(TipoActividad tipo) {
		tipoDAO.addTipoActividad(tipo);
	}

	@Override
	@Transactional
	public List<TipoActividad> getAllTipoActividad() {
		return tipoDAO.getAllTipoActividad();
	}

	@Override
	@Transactional
	public void deleteTipoActividad(Integer tipoId) {
		tipoDAO.deleteTipoActividad(tipoId);
	}

	public TipoActividad getTipoActividad(int tipoId) {
		return tipoDAO.getTipoActividad(tipoId);
	}

	public TipoActividad updateTipoActividad(TipoActividad tipo) {
		// TODO Auto-generated method stub
		return tipoDAO.updateTipoActividad(tipo);
	}

	public void setEjecutivoDAO(TipoActividadDAO tipoDAO) {
		this.tipoDAO = tipoDAO;
	}

}