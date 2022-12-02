package com.demo.itx.models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class VentaPedido implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVentaPedido;
	
	private String metodoPago;
	private boolean estadoVenta;
	private Date fechaVenta;
	private boolean estadoEntrega;
	private Date fechaEntrega;
	private double valorPagar;
	private double valorCaja;
	private double vuelto;
	
	@Column(nullable = true)
	private boolean isOnline;
	
	@Column(nullable = true)
	private double valorIva;
	
	@Column(nullable = true)
	private double valorSinIva;
	private String numeroCheque;
	private String numeroTarjeta;
	
	@OneToOne
	private Pedido pedido;
	
	@ManyToOne
	private Persona persona;
	
	@ManyToOne
	private Empresa empresa;
	
	public VentaPedido() {
		
	}


	public VentaPedido(Long idVentaPedido, String metodoPago, boolean estadoVenta, Date fechaVenta,
			boolean estadoEntrega, Date fechaEntrega, double valorPagar, double valorCaja, double vuelto, boolean isOnline,
			double valorIva, double valorSinIva, String numeroCheque, String numeroTarjeta, Pedido pedido,
			Persona persona, Empresa empresa) {
		this.idVentaPedido = idVentaPedido;
		this.metodoPago = metodoPago;
		this.estadoVenta = estadoVenta;
		this.fechaVenta = fechaVenta;
		this.estadoEntrega = estadoEntrega;
		this.fechaEntrega = fechaEntrega;
		this.valorPagar = valorPagar;
		this.valorCaja = valorCaja;
		this.vuelto = vuelto;
		this.isOnline = isOnline;
		this.valorIva = valorIva;
		this.valorSinIva = valorSinIva;
		this.numeroCheque = numeroCheque;
		this.numeroTarjeta = numeroTarjeta;
		this.pedido = pedido;
		this.persona = persona;
		this.empresa = empresa;
	}





	public double getValorIva() {
		return valorIva;
	}





	public void setValorIva(double valorIva) {
		this.valorIva = valorIva;
	}





	public double getValorSinIva() {
		return valorSinIva;
	}





	public void setValorSinIva(double valorSinIva) {
		this.valorSinIva = valorSinIva;
	}





	public String getNumeroCheque() {
		return numeroCheque;
	}





	public void setNumeroCheque(String numeroCheque) {
		this.numeroCheque = numeroCheque;
	}





	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}





	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}





	public Long getIdVentaPedido() {
		return idVentaPedido;
	}



	public void setIdVentaPedido(Long idVentaPedido) {
		this.idVentaPedido = idVentaPedido;
	}



	public String getMetodoPago() {
		return metodoPago;
	}



	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}



	public boolean isEstadoVenta() {
		return estadoVenta;
	}



	public void setEstadoVenta(boolean estadoVenta) {
		this.estadoVenta = estadoVenta;
	}



	public Date getFechaVenta() {
		return fechaVenta;
	}



	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}



	public boolean isEstadoEntrega() {
		return estadoEntrega;
	}



	public void setEstadoEntrega(boolean estadoEntrega) {
		this.estadoEntrega = estadoEntrega;
	}



	public Date getFechaEntrega() {
		return fechaEntrega;
	}



	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}



	public double getValorPagar() {
		return valorPagar;
	}



	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}



	public double getValorCaja() {
		return valorCaja;
	}



	public void setValorCaja(double valorCaja) {
		this.valorCaja = valorCaja;
	}



	public double getVuelto() {
		return vuelto;
	}



	public void setVuelto(double vuelto) {
		this.vuelto = vuelto;
	}	
	
	

	public boolean isOnline() {
		return isOnline;
	}


	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}


	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	
	
}
