package com.demo.itx.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cargo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCargo;

	private String nombre;
	private String descripcion;

	public Cargo() {

	}

	public Cargo(Long idCargo, String nombre, String descripcion) {

		this.idCargo = idCargo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


	public Long getIdCargo() {
		return idCargo;
	}



	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
