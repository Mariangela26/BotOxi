package com.example.botoxi.clases;

public class Botella {
    String cod_botella, ced_cliente_botella,id_estado_botella,id_tamanno_botella,fecha_vencimiento;

    public Botella(String cod_botella, String ced_cliente_botella, String id_estado_botella, String id_tamanno_botella, String fecha_vencimiento) {
        this.cod_botella = cod_botella;
        this.ced_cliente_botella = ced_cliente_botella;
        this.id_estado_botella = id_estado_botella;
        this.id_tamanno_botella = id_tamanno_botella;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Botella() {
    }

    public String getCod_botella() {
        return cod_botella;
    }

    public void setCod_botella(String cod_botella) {
        this.cod_botella = cod_botella;
    }

    public String getCed_cliente_botella() {
        return ced_cliente_botella;
    }

    public void setCed_cliente_botella(String ced_cliente_botella) {
        this.ced_cliente_botella = ced_cliente_botella;
    }

    public String getId_estado_botella() {
        return id_estado_botella;
    }

    public void setId_estado_botella(String id_estado_botella) {
        this.id_estado_botella = id_estado_botella;
    }

    public String getId_tamanno_botella() {
        return id_tamanno_botella;
    }

    public void setId_tamanno_botella(String id_tamanno_botella) {
        this.id_tamanno_botella = id_tamanno_botella;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

}
