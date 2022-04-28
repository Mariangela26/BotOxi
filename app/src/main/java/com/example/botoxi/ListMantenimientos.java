package com.example.botoxi;

import java.util.Date;

public class ListMantenimientos {

    String codigo;
    Date fecha;

    public ListMantenimientos(String codigo, Date fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

