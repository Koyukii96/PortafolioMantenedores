package com.jwt.dao;

import java.util.List;
import com.jwt.model.TipoServicio;

public interface TipoServicioDAO {

	public void addTipoServicio(TipoServicio tipo);

	public List<TipoServicio> getAllTipoServicio();

	public void deleteTipoServicio(Integer tipoId);

	public TipoServicio updateTipoServicio(TipoServicio tipo);

	public TipoServicio getTipoServicio(int tipoId);
}