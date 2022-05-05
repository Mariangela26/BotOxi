package com.example.botoxi.webservices;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Nuevosregistros {
    /**
     * Guarda nueva botella.
     * La fecha se guarda en formato (yyyy-mm-dd)
     */
    public static void nuevaBotella(String ced_cliente_botella, String id_estado_botella, String id_tamanno_botella, String fecha_vencimiento, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.POST, Urls.URLnuevaBotella + "?ced_cliente_botella=" + ced_cliente_botella + "&id_estado_botella=" + id_estado_botella + "&id_tamanno_botella=" + id_tamanno_botella + "&fecha_vencimiento=" + fecha_vencimiento, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Botella agregada");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context, "Error de comunicacion: " + error);
                Log.e("", "Error: " + error);
            }
        });
        servicio.add(request);
    }
    /**
     * Guarda nuevo cliente.
     */
    public static void nuevoCliente(String cedula, String nombre, String apellido, String telefono, String correo, String direccion, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.POST, Urls.URLnuevoCliente + "?cedula=" + cedula + "&nombre=" + nombre + "&apellido=" + apellido + "&telefono=" + telefono+ "&correo=" + correo+ "&direccion=" + direccion, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Cliente registrado");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context, "Error de comunicacion: " + error);
                Log.e("", "Error: " + error);
            }
        });
        servicio.add(request);
    }
    /**
     * Guarda nuevo registro en historial de mantenimientos.
     * La fecha se guarda en formato (yyyy-mm-dd)
     */
    public static void nuevoHistorial(String cod_botella_historial, String id_servicio_historial, String fecha_servicio, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.POST, Urls.URLnuevoHistorial + "?cod_botella_historial=" + cod_botella_historial + "&id_servicio_historial=" + id_servicio_historial + "&fecha_servicio=" + fecha_servicio, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Datos actualizados");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context, "Error de comunicacion: " + error);
                Log.e("", "Error: " + error);
            }
        });
        servicio.add(request);
    }
    /**
     * Nueva venta.
     */
    public static void nuevaVenta(String fecha_venta, String cod_botella_venta, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.POST, Urls.URLnuevaVenta + "?fecha_venta=" + fecha_venta + "&cod_botella_venta=" + cod_botella_venta, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Venta exitosa");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context, "Error de comunicacion: " + error);
                Log.e("", "Error: " + error);
            }
        });
        servicio.add(request);
    }

    private static void mostrarToast(Context context, String mensaje) {
        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
    }
}
