package com.jwt.service;

import java.util.List;

import com.jwt.model.TipoServicio;

public interface TipoServicioService {
	
	public void addTipoServicio(TipoServicio tipo);

	public List<TipoServicio> getAllTipoServicio();

	public void deleteTipoServicio(Integer tipoId);

	public TipoServicio getTipoServicio(int tipoId);

	public TipoServicio updateTipoServicio(TipoServicio tipo);
}
