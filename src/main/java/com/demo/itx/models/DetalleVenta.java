package com.demo.itx.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"detalleventas\"")
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "cantidad", nullable = false)
	private int cantidad;
	@Column(name = "iva", nullable = false)
	private int iva;
	@Column(name = "sub_total", nullable = false)
	private double sub_total;
	@Column(name = "total", nullable = false)
	private double total;

	// @JoinColumn(name = "id", nullable = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "venta_id", nullable = true)
	private Venta venta;

	// @OneToMany(mappedBy = "detalleventa", fetch = FetchType.LAZY, cascade =
	// CascadeType.ALL)
	// private List<Producto> producto;

	public DetalleVenta(long id, int cantidad, int iva, double sub_total, double total) {
		this.id = id;
		this.cantidad = cantidad;
		this.iva = iva;
		this.sub_total = sub_total;
		this.total = total;
	}

	public DetalleVenta() {
	}

	/**
	 * @return long return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return int return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return int return the iva
	 */
	public int getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(int iva) {
		this.iva = iva;
	}

	/**
	 * @return double return the sub_total
	 */
	public double getSub_total() {
		return sub_total;
	}

	/**
	 * @param sub_total the sub_total to set
	 */
	public void setSub_total(double sub_total) {
		this.sub_total = sub_total;
	}

	/**
	 * @return double return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

}
