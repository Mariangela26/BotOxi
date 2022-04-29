 package com.example.botoxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.List;

 public class InfoActivity extends AppCompatActivity {

    List<ListBotellas> listBotellas;
    List<ListClientes> listClientes;
    List<ListMantenimientos> listMantenimientos;
    FloatingActionButton btnAdd;
    TextView txTitulo;
    String text;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Bundle bundle = this.getIntent().getExtras();

        txTitulo = findViewById(R.id.txTitulo);
        btnAdd = findViewById(R.id.btnAdd);
        text=bundle.getString("text");
        String titulo = "Agregar "+text;
        btnAdd.setTitle(titulo);
        txTitulo.setText(text+"s");
    }

     public void onClick(View view) {

        Bundle bund = new Bundle();
        bund.putString("text",text);

         Intent intent = new Intent(InfoActivity.this, AgregarActivity.class);
         intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
         intent.putExtras(bund);
         startActivity(intent);

     }
}