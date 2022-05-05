package com.example.botoxi.webservices;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.botoxi.clases.Botella;
import com.example.botoxi.clases.Cliente;
import com.example.botoxi.clases.Historial;
import com.example.botoxi.clases.Venta;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Consultas {
    /**
     * Consulta todas las botellas de la base de datos y los guarda en un Arraylist.
     */
    public static void consultarBotellas(Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarBotellas, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Datos.botellas.clear();
                JSONObject json =null;
                for(int c=0;c<response.length();c++){
                    try{
                        json=response.getJSONObject(c);
                        Botella b = new Botella();
                        b.setCod_botella(json.getString("cod_botella"));
                        b.setCed_cliente_botella(json.getString("ced_cliente_botella"));
                        b.setId_estado_botella(json.getString("id_estado_botella"));
                        b.setId_tamanno_botella(json.getString("id_tamanno_botella"));
                        b.setFecha_vencimiento(json.getString("fecha_vencimiento"));
                        Datos.botellas.add(b);
                        mostrarToast(context,"Actualizado");
                    }catch (JSONException e){
                        mostrarToast(context,"Error en Json");
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context,"Error de comunicación: "+error);
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta si existe una botella.
     */
    public static void consultarBotellaporId(int cod_botella, Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarBotellas+"?cod_botella="+cod_botella, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //EXISTE

                //CODE//
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //NO EXISTE

                //CODE//
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta todos los clientes de la base de datos y los guarda en un Arraylist.
     */
    public static void consultarClientes(Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarClientes, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Datos.clientes.clear();
                JSONObject json =null;
                for(int c=0;c<response.length();c++){
                    try{
                        json=response.getJSONObject(c);
                        Cliente x = new Cliente();
                        x.setCedula(json.getString("cedula"));
                        x.setNombre(json.getString("nombre"));
                        x.setApellido(json.getString("apellido"));
                        x.setDireccion(json.getString("direccion"));
                        x.setTelefono(json.getString("telefono"));
                        x.setCorreo(json.getString("correo"));
                        Datos.clientes.add(x);
                        mostrarToast(context,"Actualizado");
                    }catch (JSONException e){
                        mostrarToast(context,"Error en Json");
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context,"Error de comunicación: "+error);
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta si existe un cliente.
     */
    public static void consultarClienteporId(int cedula, Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarClientes+"?cedula="+cedula, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //EXISTE

                //CODE//
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //NO EXISTE

                //CODE//
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta el historial de la base de datos y los guarda en un Arraylist.
     */
    public static void consultarHistorial(Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultaHistorial, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Datos.historial.clear();
                JSONObject json =null;
                for(int c=0;c<response.length();c++){
                    try{
                        json=response.getJSONObject(c);
                        Historial h = new Historial();
                        h.setId_historial(json.getString("id_historial"));
                        h.setCod_botella_historial(json.getString("cod_botella_historial"));
                        h.setId_servicio_historial(json.getString("id_servicio_historial"));
                        h.setFecha_servicio(json.getString("fecha_servicio"));
                        Datos.historial.add(h);
                        mostrarToast(context,"Actualizado");
                    }catch (JSONException e){
                        mostrarToast(context,"Error en Json");
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context,"Error de comunicación: "+error);
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta si existe un registro por id.
     */
    public static void consultarHistorialporId(int id_historial, Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultaHistorial+"?id_historial="+id_historial, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //EXISTE

                //CODE//
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //NO EXISTE

                //CODE//
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta ventas de la base de datos y los guarda en un Arraylist.
     */
    public static void consultarVentas(Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarVentas, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Datos.ventas.clear();
                JSONObject json =null;
                for(int c=0;c<response.length();c++){
                    try{
                        json=response.getJSONObject(c);
                        Venta v = new Venta();
                        v.setId_venta(json.getString("id_venta"));
                        v.setFecha_venta(json.getString("fecha_venta"));
                        v.setCod_botella_venta(json.getString("cod_botella_venta"));
                        Datos.ventas.add(v);
                        mostrarToast(context,"Actualizado");
                    }catch (JSONException e){
                        mostrarToast(context,"Error en Json");
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mostrarToast(context,"Error de comunicación: "+error);
            }
        });
        servicio.add(jsonRequest);
    }
    /**
     * Consulta si existe un registro por id.
     */
    public static void consultarVentasporId(int id_venta, Context context){
        RequestQueue servicio = Volley.newRequestQueue(context);
        JsonArrayRequest jsonRequest = new JsonArrayRequest(Urls.URLconsultarVentas+"?id_venta="+id_venta, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                //EXISTE

                //CODE//
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //NO EXISTE

                //CODE//
            }
        });
        servicio.add(jsonRequest);
    }

    private static void mostrarToast(Context context,String mensaje){
        Toast.makeText(context,mensaje,Toast.LENGTH_SHORT).show();
    }
}
