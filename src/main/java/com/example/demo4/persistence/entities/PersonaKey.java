package com.example.demo4.persistence.entities;

import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

public class PersonaKey implements Serializable {


    private Integer dni;

    private Integer numTramite;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getNumTramite() {
        return numTramite;
    }

    public void setNumTramite(Integer numTramite) {
        this.numTramite = numTramite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonaKey that = (PersonaKey) o;

        if (!Objects.equals(dni, that.dni)) return false;
        return Objects.equals(numTramite, that.numTramite);
    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (numTramite != null ? numTramite.hashCode() : 0);
        return result;
    }
}
