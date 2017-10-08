package com.jwt.dao;

import java.util.List;
import com.jwt.model.TipoContrato;

public interface TipoContratoDAO {

	public void addTipoContrato(TipoContrato tipo);

	public List<TipoContrato> getAllTipoContrato();

	public void deleteTipoContrato(Integer tipoId);

	public TipoContrato updateTipoContrato(TipoContrato tipo);

	public TipoContrato getTipoContrato(int tipoId);
}