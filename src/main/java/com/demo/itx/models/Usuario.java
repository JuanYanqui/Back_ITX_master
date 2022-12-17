package com.demo.itx.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;

	private String username;
	private String password;
	private boolean estado;

	private String foto;

	public Usuario() {
	}

//	public Usuario(String username, String password, boolean estado, String foto) {
//		this.username = username;
//		this.password = password;
//		this.estado = estado;
//		this.foto = foto;
//
//	}

	@ManyToOne
	private Persona persona;

	@ManyToOne
	private Empresa empresa;

	@ManyToOne
	private Roles rol;

	public Usuario(String username, String password, boolean estado, String foto, Persona persona, Empresa empresa, Roles rol) {
		this.username = username;
		this.password = password;
		this.estado = estado;
		this.foto = foto;
		this.persona = persona;
		this.empresa = empresa;
		this.rol = rol;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
