package com.demo.itx.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Producto")
@Table(name = "\"productos\"")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //s

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "codigo", nullable = true)
    private String codigo;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "comentario", nullable = true)
    private String comentario;

    @Column(name = "peso", nullable = true)
    private float peso;

    @Column(name = "oferta_descuento", nullable = false)
    private float oferta_descuento;

    @Column(name = "precio_compra", nullable = false)
    private float precio_compra;

    @Column(name = "precio_compra_no_iva", nullable = true)
    private float precio_compra_no_iva;

    @Column(name = "valor_iva", nullable = true)
    private float valor_iva;

    @Column(name = "precio_venta", nullable = false)
    private float precio_venta;

    @Column(name = "precio_ventas", nullable = true)
    private ArrayList<Object> precio_ventas;

    @Column(name = "unidades_medida", nullable = true)
    private ArrayList<Object> unidades_medida;

    @Column(name = "estado", nullable = false)
    private boolean estado;

    @Column(name = "iva", nullable = true)
    private boolean iva = true;

    @Column(name = "cantidad", nullable = true)
    private int cantidad;

    @Column(name = "cantidad_reserva", nullable = true)
    private int cantidad_reserva;

    @Column(name = "imagen", nullable = false)
    private String imagen;

    @ManyToMany
    private List<Categoria> categorias;

    @ManyToMany
    private List<Proveedor> proveedores;

    @ManyToOne
    private Empresa empresa;

    public Producto() {
    }

    public Producto(long id, String nombre, String codigo, String descripcion, String comentario, float peso,
            float oferta_descuento, float precio_compra, float precio_compra_no_iva, float valor_iva,
            float precio_venta, ArrayList<Object> precio_ventas, ArrayList<Object> unidades_medida, boolean estado,
            boolean iva, int cantidad, int cantidad_reserva, String imagen, List<Categoria> categorias,
            List<Proveedor> proveedores, ControlMercaderia controlmercaderia, Empresa empresa) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.peso = peso;
        this.oferta_descuento = oferta_descuento;
        this.precio_compra = precio_compra;
        this.precio_compra_no_iva = precio_compra_no_iva;
        this.valor_iva = valor_iva;
        this.precio_venta = precio_venta;
        this.precio_ventas = precio_ventas;
        this.unidades_medida = unidades_medida;
        this.estado = estado;
        this.iva = iva;
        this.cantidad = cantidad;
        this.cantidad_reserva = cantidad_reserva;
        this.imagen = imagen;
        this.categorias = categorias;
        this.proveedores = proveedores;

        this.empresa = empresa;
    }

    public int getCantidad_reserva() {
        return cantidad_reserva;
    }

    public void setCantidad_reserva(int cantidad_reserva) {
        this.cantidad_reserva = cantidad_reserva;
    }

    public ArrayList<Object> getPrecio_ventas() {
        return precio_ventas;
    }

    public void setPrecio_ventas(ArrayList<Object> precio_ventas) {
        this.precio_ventas = precio_ventas;
    }

    public ArrayList<Object> getUnidades_medida() {
        return unidades_medida;
    }

    public void setUnidades_medida(ArrayList<Object> unidades_medida) {
        this.unidades_medida = unidades_medida;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getOferta_descuento() {
        return oferta_descuento;
    }

    public void setOferta_descuento(float oferta_descuento) {
        this.oferta_descuento = oferta_descuento;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_compra_no_iva()
    {

        return precio_compra_no_iva;
    }

    public void setPrecio_compra_no_iva(float precio_compra_no_iva) {
        if (this.getEmpresa() != null) {
            if (!isIva()) {
                this.precio_compra_no_iva = this.precio_compra;
                System.out.println("esto es si no tiene iva");
            } else {
                float val_iva = 100f + this.empresa.getIva();
                float totaliva = val_iva / 100f;
                System.out.println("esto es con el iva de la empresa: " + precio_compra / totaliva);
                // BigDecimal bd = new BigDecimal(precio_compra / totaliva).setScale(2,
                // RoundingMode.FLOOR);
                // return bd.floatValue();
                this.precio_compra_no_iva = precio_compra / totaliva;
                System.out.println(this.precio_compra_no_iva);
            }
        }
        else {
             this.precio_compra_no_iva = this.precio_compra;
        }
    }

    public float getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(float valor_iva) {
        this.valor_iva = precio_compra - precio_compra_no_iva;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }


    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    // public float getPrecioIvaCalc() {
    //     if (!isIva()) {
    //         return precio_compra_no_iva;

    //     } else {
    //         return this.precio_compra;
    //     }
    // }





}
