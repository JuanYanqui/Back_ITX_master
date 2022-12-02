package com.demo.itx.models;


import java.util.Date;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "\"controlmercaderias\"")
public class ControlMercaderia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "stock_min", nullable = false)
    private int stock_min;
    @Column(name = "stock_max", nullable = false)
    private int stock_max;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_elaboracion", nullable = false)
    private Date fecha_elaboracion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_caducidad", nullable = false)
	private Date fecha_caducidad;

    @ManyToOne
    private DetalleCompra detalleCompras;

    @ManyToOne
    private Bodega bodega;

    @ManyToOne
    private Empresa empresa;

    public ControlMercaderia(long id, int stock_min, int stock_max, Date fecha_elaboracion, Date fecha_caducidad,
            DetalleCompra detalleCompras, Bodega bodega, Empresa empresa) {
        this.id = id;
        this.stock_min = stock_min;
        this.stock_max = stock_max;
        this.fecha_elaboracion = fecha_elaboracion;
        this.fecha_caducidad = fecha_caducidad;
        this.detalleCompras = detalleCompras;
        this.bodega = bodega;
        this.empresa = empresa;
    }

    public ControlMercaderia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }

    public int getStock_max() {
        return stock_max;
    }

    public void setStock_max(int stock_max) {
        this.stock_max = stock_max;
    }

    public Date getFecha_elaboracion() {
        return fecha_elaboracion;
    }

    public void setFecha_elaboracion(Date fecha_elaboracion) {
        this.fecha_elaboracion = fecha_elaboracion;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public DetalleCompra getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(DetalleCompra detalleCompras) {
        this.detalleCompras = detalleCompras;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }




}
