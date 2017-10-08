package com.jwt.service;

import java.util.List;

import com.jwt.model.TipoActividad;

public interface TipoActividadService {
	
	public void addTipoActividad(TipoActividad tipo);

	public List<TipoActividad> getAllTipoActividad();

	public void deleteTipoActividad(Integer tipoId);

	public TipoActividad getTipoActividad(int tipoId);

	public TipoActividad updateTipoActividad(TipoActividad tipo);
}
