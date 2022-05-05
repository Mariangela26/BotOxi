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

public class Deletes {
    /**
     * Nueva venta.
     */
    public static void eliminarVenta(String id_venta, Context context) {
        RequestQueue servicio = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.DELETE, Urls.URLeliminarVenta + "?id_venta=" + id_venta, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                mostrarToast(context, "Eliminado");
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
