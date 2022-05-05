package com.example.botoxi.webservices;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Updates {
    /**
     * Actualiza una botella.
     * Botella a actualizar = cod_botella
     * La fecha se guarda en formato (yyyy-mm-dd)
     */
    public static void actualizarBotella(String cod_botella, String id_estado_botella, String fecha_vencimiento, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.PUT, Urls.URLupdateBotella + "?cod_botella=" + cod_botella + "&id_estado_botella="+id_estado_botella + "&fecha_vencimiento="+fecha_vencimiento, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Botella actualizada");
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
     * Actualiza un cliente.
     * Cliente a actualizar = cedula
     */
    public static void actualizarCliente(String cedula, String apellido, String direccion, String telefono, String correo, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.PUT, Urls.URLupdateCliente + "?cedula=" + cedula + "&apellido="+apellido + "&direccion="+direccion + "&telefono="+telefono + "&correo="+correo, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Cliente actualizado");
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


    private static void mostrarToast(Context context,String mensaje){
        Toast.makeText(context,mensaje,Toast.LENGTH_SHORT).show();
    }
}
