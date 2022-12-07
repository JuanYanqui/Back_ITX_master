package com.demo.itx.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"compras\"")
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "unidad", nullable = false)
    private String unidad;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "cantidad_unitarias", nullable = true)
    private float cantidad_unitarias;

	@Column(name = "valor_total", nullable = false)
	private double valor_total;

    @OneToOne()
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    private Proveedor proveedor;

    public Compra(long id, String unidad, int cantidad, float cantidad_unitarias, double valor_total, Producto producto,
            Proveedor proveedor) {
        this.id = id;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.cantidad_unitarias = cantidad_unitarias;
        this.valor_total = valor_total;
        this.producto = producto;
        this.proveedor = proveedor;
    }

    public Compra() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidad_unitarias() {
        return cantidad_unitarias;
    }

    public void setCantidad_unitarias(float cantidad_unitarias) {
        this.cantidad_unitarias = cantidad_unitarias;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }


}
