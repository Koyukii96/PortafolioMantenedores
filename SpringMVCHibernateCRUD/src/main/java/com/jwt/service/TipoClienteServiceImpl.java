package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TipoClienteDAO;
import com.jwt.model.TipoCliente;

@Service
@Transactional
public class TipoClienteServiceImpl implements TipoClienteService {

	@Autowired
	private TipoClienteDAO tipoDAO;

	@Override
	@Transactional
	public void addTipoCliente(TipoCliente tipo) {
		tipoDAO.addTipoCliente(tipo);
	}

	@Override
	@Transactional
	public List<TipoCliente> getAllTipoCliente() {
		return tipoDAO.getAllTipoCliente();
	}

	@Override
	@Transactional
	public void deleteTipoCliente(Integer tipoId) {
		tipoDAO.deleteTipoCliente(tipoId);
	}

	public TipoCliente getTipoCliente(int tipoId) {
		return tipoDAO.getTipoCliente(tipoId);
	}

	public TipoCliente updateTipoCliente(TipoCliente tipo) {
		// TODO Auto-generated method stub
		return tipoDAO.updateTipoCliente(tipo);
	}

	public void setTipoClienteDAO(TipoClienteDAO tipoDAO) {
		this.tipoDAO = tipoDAO;
	}

}