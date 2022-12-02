package com.demo.itx.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "\"ventas\"")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "fecha", nullable = false, unique = false)
    private Date fecha;

    @Column(name = "tipo_venta", nullable = false, unique = false)
    private String tipo_venta;


    @OneToMany(mappedBy="venta",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id", nullable = true)
    private List<DetalleVenta> detalleventa;



    public Venta() {
    }

    public Venta(long id, Date fecha, String tipo_venta) {
        this.id = id;
        this.fecha = fecha;
        this.tipo_venta = tipo_venta;
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
     * @return Date return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return String return the tipo_venta
     */
    public String getTipo_venta() {
        return tipo_venta;
    }

    /**
     * @param tipo_venta the tipo_venta to set
     */
    public void setTipo_venta(String tipo_venta) {
        this.tipo_venta = tipo_venta;
    }

	public List<DetalleVenta> getDetalleventa() {
		return detalleventa;
	}

	public void setDetalleventa(List<DetalleVenta> detalleventa) {
		this.detalleventa = detalleventa;
	}





}
