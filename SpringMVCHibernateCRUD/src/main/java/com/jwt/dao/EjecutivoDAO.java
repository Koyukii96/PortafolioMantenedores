package com.jwt.dao;

import java.util.List;
import com.jwt.model.Ejecutivo;

public interface EjecutivoDAO {

	public void addEjecutivo(Ejecutivo ejecutivo);

	public List<Ejecutivo> getAllEjecutivo();

	public void deleteEjecutivo(Integer ejecutivoId);

	public Ejecutivo updateEjecutivo(Ejecutivo ejecutivo);

	public Ejecutivo getEjecutivo(int ejecutivoid);
}
