package com.example.botoxi.clases;

public class Historial {
    String id_historial,cod_botella_historial,id_servicio_historial,fecha_servicio;

    public Historial() {
    }

    public String getId_historial() {
        return id_historial;
    }

    public void setId_historial(String id_historial) {
        this.id_historial = id_historial;
    }

    public String getCod_botella_historial() {
        return cod_botella_historial;
    }

    public void setCod_botella_historial(String cod_botella_historial) {
        this.cod_botella_historial = cod_botella_historial;
    }

    public String getId_servicio_historial() {
        return id_servicio_historial;
    }

    public void setId_servicio_historial(String id_servicio_historial) {
        this.id_servicio_historial = id_servicio_historial;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }
}
