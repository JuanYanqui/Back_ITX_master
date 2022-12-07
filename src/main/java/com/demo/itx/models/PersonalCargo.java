package com.demo.itx.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class PersonalCargo implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonalCargo;

	private boolean estado;

	@ManyToOne
	private Personal personal;

	@ManyToMany
	private List<Bodega> bodegas;

	@ManyToOne
	private Cargo cargo;

	public PersonalCargo(Long idPersonalCargo, boolean estado, Personal personal, List<Bodega> bodegas,Cargo cargo) {
		this.idPersonalCargo = idPersonalCargo;
		this.estado = estado;
		this.personal = personal;
		this.cargo = cargo;
		this.bodegas = bodegas;

	}

	public PersonalCargo() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdPersonalCargo() {
		return idPersonalCargo;
	}

	public void setIdPersonalCargo(Long idPersonalCargo) {
		this.idPersonalCargo = idPersonalCargo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Bodega> getBodegas() {
		return bodegas;
	}

	public void setBodegas(List<Bodega> bodegas) {
		this.bodegas = bodegas;
	}



}
