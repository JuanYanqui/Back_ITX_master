package com.demo.itx.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersona;

	private String cedula;
	private String nombres;
	private String apellidos;
	private Date fechaNacimmiento;
	private String genero;
	private String direccion;
	private String correo;
	private String telefono;
	private String celular;

	private String foto;

	public Persona() {

	}
	//////cambios
	public Persona(Long idPersona, String cedula, String nombres, String apellidos, Date fechaNacimmiento,
			String genero, String direccion, String correo, String telefono, String celular, String foto) {

		this.idPersona = idPersona;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimmiento = fechaNacimmiento;
		this.genero = genero;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.celular = celular;
		this.foto = foto;
	}

	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaNacimmiento() {
		return fechaNacimmiento;
	}
	public void setFechaNacimmiento(Date fechaNacimmiento) {
		this.fechaNacimmiento = fechaNacimmiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
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
