package com.demo.itx.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Personal implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPersonal;

	private String horario;
	private double salario;
	private boolean estado;
	private Date fechaRegistro;
	private String lugarTrabajo;

	@Column(length = 5000000)
	private String fotoPerfil;

	@ManyToOne
	private Usuario usuario;

	public Personal() {
	}


	public String getLugarTrabajo() {
		return lugarTrabajo;
	}


	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}


	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public boolean isEstdo() {
		return estado;
	}

	public void setEstdo(boolean estado) {
		this.estado = estado;
	}

	public Personal(Long idPersonal, String horario, double salario,boolean estado ,Date fechaRegistro,
			String fotoPerfil, Usuario usuario) {
		this.idPersonal = idPersonal;
		this.horario = horario;
		this.salario = salario;
		this.fechaRegistro = fechaRegistro;
		this.fotoPerfil = fotoPerfil;
		this.estado = estado;
		this.usuario = usuario;
	}

	public Long getIdPersonal() {
		return idPersonal;
	}

	public void setIdPersonal(Long idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
