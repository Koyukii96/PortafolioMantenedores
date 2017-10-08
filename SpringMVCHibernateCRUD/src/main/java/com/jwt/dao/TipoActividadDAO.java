package com.jwt.dao;

import java.util.List;
import com.jwt.model.TipoActividad;

public interface TipoActividadDAO {

	public void addTipoActividad(TipoActividad tipoActividad);

	public List<TipoActividad> getAllTipoActividad();

	public void deleteTipoActividad(Integer tipoActividadId);

	public TipoActividad updateTipoActividad(TipoActividad tipoActividad);

	public TipoActividad getTipoActividad(int tipoActividadId);
}
