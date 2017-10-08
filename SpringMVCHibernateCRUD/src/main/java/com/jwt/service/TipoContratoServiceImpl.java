package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TipoContratoDAO;
import com.jwt.model.TipoContrato;

@Service
@Transactional
public class TipoContratoServiceImpl implements TipoContratoService {

	@Autowired
	private TipoContratoDAO tipoDAO;

	@Override
	@Transactional
	public void addTipoContrato(TipoContrato tipo) {
		tipoDAO.addTipoContrato(tipo);
	}

	@Override
	@Transactional
	public List<TipoContrato> getAllTipoContrato() {
		return tipoDAO.getAllTipoContrato();
	}

	@Override
	@Transactional
	public void deleteTipoContrato(Integer tipoId) {
		tipoDAO.deleteTipoContrato(tipoId);
	}

	public TipoContrato getTipoContrato(int tipoId) {
		return tipoDAO.getTipoContrato(tipoId);
	}

	public TipoContrato updateTipoContrato(TipoContrato tipo) {
		// TODO Auto-generated method stub
		return tipoDAO.updateTipoContrato(tipo);
	}

	public void setTipoContratoDAO(TipoContratoDAO tipoDAO) {
		this.tipoDAO = tipoDAO;
	}

}
