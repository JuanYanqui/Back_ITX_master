package com.demo.itx.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "\"bodegas\"")
public class Bodega implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "tipobodega", nullable = false)
    private String tipobodega;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "localidad", nullable = true)
    private String localidad;
    @Column(name = "capacidad_max", nullable = false)
    private int capacidad_max;

    @Column(name = "inventario_disponible", nullable = true)
    private int inventario_disponible;

    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "descripcion", nullable = true)
    private String descripcion;
    @Column(name = "estado", nullable = true)
    private boolean estado;

    @ManyToOne
    private Empresa empresa;

    @ManyToMany
    private List<PersonalCargo> personalCargos;
    // @OneToMany(mappedBy = "bodega")
    // private List<PersonalCargo> personalCargos;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "controlMercaderia_id")
    private List<ControlMercaderia> controlMercaderia;

    public Bodega() {
    }

    public Bodega(long id, String nombre, String tipobodega, String direccion, String localidad, int capacidad_max,
            int inventario_disponible, String telefono, String descripcion, boolean estado, Empresa empresa,
            List<PersonalCargo> personalCargos, List<ControlMercaderia> controlMercaderia) {
        this.id = id;
        this.nombre = nombre;
        this.tipobodega = tipobodega;
        this.direccion = direccion;
        this.localidad = localidad;
        this.capacidad_max = capacidad_max;
        this.inventario_disponible = inventario_disponible;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.estado = estado;
        this.empresa = empresa;
        this.personalCargos = personalCargos;
        this.controlMercaderia = controlMercaderia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipobodega() {
        return tipobodega;
    }

    public void setTipobodega(String tipobodega) {
        this.tipobodega = tipobodega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCapacidad_max() {
        return capacidad_max;
    }

    public void setCapacidad_max(int capacidad_max) {
        this.capacidad_max = capacidad_max;
    }

    public int getInventario_disponible() {
        return inventario_disponible;
    }

    public void setInventario_disponible(int inventario_disponible) {
        this.inventario_disponible = inventario_disponible;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<PersonalCargo> getPersonalCargos() {
        return personalCargos;
    }

    public void setPersonalCargos(List<PersonalCargo> personalCargos) {
        this.personalCargos = personalCargos;
    }

    public List<ControlMercaderia> getControlMercaderia() {
        return controlMercaderia;
    }

    public void setControlMercaderia(List<ControlMercaderia> controlMercaderia) {
        this.controlMercaderia = controlMercaderia;
    }

}
