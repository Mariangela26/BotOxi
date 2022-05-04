package com.example.botoxi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.botoxi.webservices.Consultas;
import com.example.botoxi.webservices.Nuevosregistros;

public class MainActivity extends AppCompatActivity {
    Bundle bundle = new Bundle();
//TODO: hacerlo con fragmenst

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnBotellas:
                bundle.putString("text", "Botella");
                break;
            case R.id.btnClientes:
                bundle.putString("text", "Cliente");

                break;
            case R.id.btnMant:
                bundle.putString("text", "Mantenimiento");

                break;
            default: break;
        }
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}