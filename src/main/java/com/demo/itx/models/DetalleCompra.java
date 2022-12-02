package com.demo.itx.models;

import java.util.Date;
import java.util.List;

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
@Table(name = "\"detallecompras\"")
public class DetalleCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_pedido", nullable = false)
    private Date fecha_pedido;

    @Column(name = "valor_total", nullable = false)
    private double valor_total;

    @Column(name = "estado", nullable = false)
	private String estado;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "detalleCompra_id")
    private List<Compra> compras;

    @ManyToOne
    private Empresa empresa;


    public DetalleCompra(long id, Date fecha_pedido, double valor_total, String estado, List<Compra> compras,
            Empresa empresa) {
        this.id = id;
        this.fecha_pedido = fecha_pedido;
        this.valor_total = valor_total;
        this.estado = estado;
        this.compras = compras;
        this.empresa = empresa;

    }

    public DetalleCompra() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}