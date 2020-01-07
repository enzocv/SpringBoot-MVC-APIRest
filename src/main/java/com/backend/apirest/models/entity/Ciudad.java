package com.backend.apirest.models.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Ciudad {
    private int idCiudad;
    private String nombreCiudad;

    @Id
    @Column(name = "id_ciudad", nullable = false)
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Basic
    @Column(name = "nombre_ciudad", nullable = false, length = 50)
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudad ciudad = (Ciudad) o;
        return idCiudad == ciudad.idCiudad &&
                Objects.equals(nombreCiudad, ciudad.nombreCiudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCiudad, nombreCiudad);
    }
}
