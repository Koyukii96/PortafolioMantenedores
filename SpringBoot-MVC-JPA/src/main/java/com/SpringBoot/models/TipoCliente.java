package com.SpringBoot.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="TipoCliente")
public class TipoCliente implements Serializable{

	private static final long serialVersionUID=1L;
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_tipoCliente")
	private int id_tipoCliente;
	@Column(name="descripcion")
	private String descripcion;
	
	public int getId_tipoCliente() {
		return id_tipoCliente;
	}
	public void setId_tipoCliente(int id_tipoCliente) {
		this.id_tipoCliente = id_tipoCliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}