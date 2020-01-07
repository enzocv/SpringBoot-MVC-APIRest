package com.backend.apirest.models.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Categoriaempresa {
    private int idCategoriaEmpresa;
    private String descripcionCategoriaEmpresa;
    private String imagenCategoriaEmpresa;

    @Id
    @Column(name = "id_categoria_empresa", nullable = false)
    public int getIdCategoriaEmpresa() {
        return idCategoriaEmpresa;
    }

    public void setIdCategoriaEmpresa(int idCategoriaEmpresa) {
        this.idCategoriaEmpresa = idCategoriaEmpresa;
    }

    @Basic
    @Column(name = "descripcion_categoria_empresa", nullable = false, length = 50)
    public String getDescripcionCategoriaEmpresa() {
        return descripcionCategoriaEmpresa;
    }

    public void setDescripcionCategoriaEmpresa(String descripcionCategoriaEmpresa) {
        this.descripcionCategoriaEmpresa = descripcionCategoriaEmpresa;
    }

    @Basic
    @Column(name = "imagen_categoria_empresa", nullable = false, length = -1)
    public String getImagenCategoriaEmpresa() {
        return imagenCategoriaEmpresa;
    }

    public void setImagenCategoriaEmpresa(String imagenCategoriaEmpresa) {
        this.imagenCategoriaEmpresa = imagenCategoriaEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoriaempresa that = (Categoriaempresa) o;
        return idCategoriaEmpresa == that.idCategoriaEmpresa &&
                Objects.equals(descripcionCategoriaEmpresa, that.descripcionCategoriaEmpresa) &&
                Objects.equals(imagenCategoriaEmpresa, that.imagenCategoriaEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoriaEmpresa, descripcionCategoriaEmpresa, imagenCategoriaEmpresa);
    }
}
