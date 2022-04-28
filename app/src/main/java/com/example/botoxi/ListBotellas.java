package com.example.botoxi;

import java.util.Date;

public class ListBotellas {

    String codigo;
    String tamaño;
    String estado;
    Date fechaRecarga;

    public ListBotellas(String codigo, String tamaño, String estado, Date fechaRecarga) {
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.estado = estado;
        this.fechaRecarga = fechaRecarga;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(Date fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }
}
