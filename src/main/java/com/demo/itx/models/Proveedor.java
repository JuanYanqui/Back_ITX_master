package com.demo.itx.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "proveedor")
public class Proveedor {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProveedor;

    private String ruc;
    private String nombreProveedor;
    private boolean estado;
    private Date fechaRegistro;
    private String[] cuentasBancarias;
    private String giroProveedor;
    private String observaciones;
    private String emailProveedor;
    private String celularProveedor;
    private String telefonoProveedor;
    private String paginaWeb;

	@ManyToOne
	private Empresa empresa;

    public Proveedor() {
    }

    public Proveedor(Long idProveedor, String ruc, String nombreProveedor, boolean estado, Date fechaRegistro,
            String[] cuentasBancarias, String giroProveedor, String observaciones, String emailProveedor,
            String celularProveedor, String telefonoProveedor, String paginaWeb,
            Empresa empresa) {
        this.idProveedor = idProveedor;
        this.ruc = ruc;
        this.nombreProveedor = nombreProveedor;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.cuentasBancarias = cuentasBancarias;
        this.giroProveedor = giroProveedor;
        this.observaciones = observaciones;
        this.emailProveedor = emailProveedor;
        this.celularProveedor = celularProveedor;
        this.telefonoProveedor = telefonoProveedor;
        this.paginaWeb = paginaWeb;
        this.empresa = empresa;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(String[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public String getGiroProveedor() {
        return giroProveedor;
    }

    public void setGiroProveedor(String giroProveedor) {
        this.giroProveedor = giroProveedor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEmailProveedor() {
        return emailProveedor;
    }

    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }

    public String getCelularProveedor() {
        return celularProveedor;
    }

    public void setCelularProveedor(String celularProveedor) {
        this.celularProveedor = celularProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


}
