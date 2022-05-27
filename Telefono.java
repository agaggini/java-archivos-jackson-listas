package com.company;

import java.io.Serializable;

public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;

    private String numero;
    private String codArea;
    private transient String codPais;

    public Telefono() {
    }

    public Telefono(String numero, String codArea, String codPais) {
        this.numero = numero;
        this.codArea = codArea;
        this.codPais = codPais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "numero='" + numero + '\'' +
                ", codArea='" + codArea + '\'' +
                ", codPais='" + codPais + '\'' +
                '}';
    }
}
