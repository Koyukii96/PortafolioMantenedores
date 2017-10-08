package com.jwt.service;

import java.util.List;

import com.jwt.model.TipoContrato;

public interface TipoContratoService {
	
	public void addTipoContrato(TipoContrato tipo);

	public List<TipoContrato> getAllTipoContrato();

	public void deleteTipoContrato(Integer tipoId);

	public TipoContrato getTipoContrato(int tipoId);

	public TipoContrato updateTipoContrato(TipoContrato tipo);
}
