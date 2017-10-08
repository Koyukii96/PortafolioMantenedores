package com.jwt.dao;

import java.util.List;
import com.jwt.model.TipoCliente;

public interface TipoClienteDAO {

	public void addTipoCliente(TipoCliente tipo);

	public List<TipoCliente> getAllTipoCliente();

	public void deleteTipoCliente(Integer tipoId);

	public TipoCliente updateTipoCliente(TipoCliente tipo);

	public TipoCliente getTipoCliente(int tipoId);
}