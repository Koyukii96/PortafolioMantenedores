package com.SpringBoot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="TipoContrato")
public class TipoContrato implements Serializable{

	private static final long serialVersionUID=1L;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_tipoContrato")
	private int id_tipoContrato;
	@Column(name="descripcion")
	private String descripcion;
	
	public int getId_tipoCliente() {
		return id_tipoContrato;
	}
	public void setId_tipoCliente(int id_tipoContrato) {
		this.id_tipoContrato = id_tipoContrato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}