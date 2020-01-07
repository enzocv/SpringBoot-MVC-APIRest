package com.backend.apirest.models.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Empaque {
    private int idEmpaque;
    private String descripcionEmpaque;
    private BigDecimal precioEmpaque;
    private int cantidadProductoEmpaque;
    private Collection<Producto> productosByIdEmpaque;

    @Id
    @Column(name = "id_empaque", nullable = false)
    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    @Basic
    @Column(name = "descripcion_empaque", nullable = false, length = -1)
    public String getDescripcionEmpaque() {
        return descripcionEmpaque;
    }

    public void setDescripcionEmpaque(String descripcionEmpaque) {
        this.descripcionEmpaque = descripcionEmpaque;
    }

    @Basic
    @Column(name = "precio_empaque", nullable = false, precision = 2)
    public BigDecimal getPrecioEmpaque() {
        return precioEmpaque;
    }

    public void setPrecioEmpaque(BigDecimal precioEmpaque) {
        this.precioEmpaque = precioEmpaque;
    }

    @Basic
    @Column(name = "cantidad_producto_empaque", nullable = false)
    public int getCantidadProductoEmpaque() {
        return cantidadProductoEmpaque;
    }

    public void setCantidadProductoEmpaque(int cantidadProductoEmpaque) {
        this.cantidadProductoEmpaque = cantidadProductoEmpaque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empaque empaque = (Empaque) o;
        return idEmpaque == empaque.idEmpaque &&
                cantidadProductoEmpaque == empaque.cantidadProductoEmpaque &&
                Objects.equals(descripcionEmpaque, empaque.descripcionEmpaque) &&
                Objects.equals(precioEmpaque, empaque.precioEmpaque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpaque, descripcionEmpaque, precioEmpaque, cantidadProductoEmpaque);
    }

    @OneToMany(mappedBy = "empaqueByIdEmpaque")
    public Collection<Producto> getProductosByIdEmpaque() {
        return productosByIdEmpaque;
    }

    public void setProductosByIdEmpaque(Collection<Producto> productosByIdEmpaque) {
        this.productosByIdEmpaque = productosByIdEmpaque;
    }
}
