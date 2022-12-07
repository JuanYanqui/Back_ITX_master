package com.demo.itx.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ItemPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idItemPedido;

	private int cantidad;
	private double precio;
	private double subtotal;
	
	@Column(nullable = true)
	private String tipoUnidad;
	@Column(nullable = true)
	private int valUnidad;
	@Column(nullable = true)
	private String tipoPrecio;
	
	@Column(nullable = true)
	private int unidadTotal;

	@OneToOne
	private Producto producto;

	@ManyToOne
	private Pedido pedido;

	public ItemPedido() {

	}

	public ItemPedido(Long idItemPedido, int cantidad, double precio, double subtotal, String tipoUnidad, int valUnidad, String tipoPrecio, int unidadTotal, Producto producto,
			Pedido pedido) {
		this.idItemPedido = idItemPedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
		this.tipoUnidad = tipoUnidad;
		this.tipoUnidad = tipoUnidad;
		this.tipoPrecio = tipoPrecio;
		this.producto = producto;
		this.pedido = pedido;
	}

	public Long getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(Long idItemPedido) {
		this.idItemPedido= idItemPedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public int getValUnidad() {
		return valUnidad;
	}

	public void setValUnidad(int valUnidad) {
		this.valUnidad = valUnidad;
	}

	public String getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(String tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public int getUnidadTotal() {
		return unidadTotal;
	}

	public void setUnidadTotal(int unidadTotal) {
		this.unidadTotal = unidadTotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
