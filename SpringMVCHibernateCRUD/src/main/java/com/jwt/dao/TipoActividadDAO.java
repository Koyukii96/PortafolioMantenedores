package com.jwt.dao;

import java.util.List;
import com.jwt.model.TipoActividad;

public interface TipoActividadDAO {

	public void addTipoActividad(TipoActividad tipo);

	public List<TipoActividad> getAllTipoActividad();

	public void deleteTipoActividad(Integer tipoId);

	public TipoActividad updateTipoActividad(TipoActividad tipo);

	public TipoActividad getTipoActividad(int tipoId);
}