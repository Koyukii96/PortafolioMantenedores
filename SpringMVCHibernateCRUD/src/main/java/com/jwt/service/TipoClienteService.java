package com.jwt.service;

import java.util.List;

import com.jwt.model.TipoCliente;

public interface TipoClienteService {
	
	public void addTipoCliente(TipoCliente tipo);

	public List<TipoCliente> getAllTipoCliente();

	public void deleteTipoCliente(Integer tipoId);

	public TipoCliente getTipoCliente(int tipoId);

	public TipoCliente updateTipoCliente(TipoCliente tipo);
}