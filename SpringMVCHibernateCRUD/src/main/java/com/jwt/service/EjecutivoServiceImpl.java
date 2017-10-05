package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EjecutivoDAO;
import com.jwt.model.Ejecutivo;

@Service
@Transactional
public class EjecutivoServiceImpl implements EjecutivoService {

	@Autowired
	private EjecutivoDAO ejecutivoDAO;

	@Override
	@Transactional
	public void addEjecutivo(Ejecutivo ejecutivo) {
		ejecutivoDAO.addEjecutivo(ejecutivo);
	}

	@Override
	@Transactional
	public List<Ejecutivo> getAllEjecutivo() {
		return ejecutivoDAO.getAllEjecutivo();
	}

	@Override
	@Transactional
	public void deleteEjecutivo(Integer ejecutivoId) {
		ejecutivoDAO.deleteEjecutivo(ejecutivoId);
	}

	public Ejecutivo getEjecutivo(int ejeid) {
		return ejecutivoDAO.getEjecutivo(ejeid);
	}

	public Ejecutivo updateEjecutivo(Ejecutivo ejecutivo) {
		// TODO Auto-generated method stub
		return ejecutivoDAO.updateEjecutivo(ejecutivo);
	}

	public void setEjecutivoDAO(EjecutivoDAO ejecutivoDAO) {
		this.ejecutivoDAO = ejecutivoDAO;
	}

}
