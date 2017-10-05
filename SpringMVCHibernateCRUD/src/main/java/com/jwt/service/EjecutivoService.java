package com.jwt.service;

import java.util.List;

import com.jwt.model.Ejecutivo;

public interface EjecutivoService {
	
	public void addEjecutivo(Ejecutivo ejecutivo);

	public List<Ejecutivo> getAllEjecutivo();

	public void deleteEjecutivo(Integer ejecutivoId);

	public Ejecutivo getEjecutivo(int ejecutivoid);

	public Ejecutivo updateEjecutivo(Ejecutivo ejecutivo);
}
