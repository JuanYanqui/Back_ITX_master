package com.demo.itx.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPedido;

	private Date fechaPedido;
	private boolean revicion;
	private boolean aceptacion;	
	private Date fechaRevicion;	

	@OneToOne
	private Cliente cliente;

	public Pedido() {

	}

	public Pedido(Long idPedido, Date fechaPedido, boolean revicion, boolean aceptacion, Date fechaRevicion, Cliente cliente) {

		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.revicion = revicion;
		this.aceptacion = aceptacion;
		this.fechaRevicion = fechaRevicion;
		this.cliente = cliente;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public boolean isRevicion() {
		return revicion;
	}

	public void setRevicion(boolean revicion) {
		this.revicion = revicion;
	}

	public boolean isAceptacion() {
		return aceptacion;
	}

	public void setAceptacion(boolean aceptacion) {
		this.aceptacion = aceptacion;
	}

	public Date getFechaRevicion() {
		return fechaRevicion;
	}

	public void setFechaRevicion(Date fechaRevicion) {
		this.fechaRevicion = fechaRevicion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
