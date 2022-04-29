package com.example.botoxi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.botoxi.fragments.FragmentBotella;
import com.example.botoxi.fragments.FragmentCliente;
import com.example.botoxi.fragments.FragmentMantenimiento;

public class AgregarActivity extends AppCompatActivity {

    FragmentBotella fragmentBotella;
    FragmentCliente fragmentCliente;
    FragmentMantenimiento fragmentMantenimiento;
    String info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        Bundle bundle = this.getIntent().getExtras();

        fragmentBotella = new FragmentBotella();
        fragmentCliente = new FragmentCliente();
        fragmentMantenimiento = new FragmentMantenimiento();

        info=bundle.getString("text");
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        switch (info){
            case "Botella":
                transaction.add(R.id.contFragmets, fragmentBotella);
                break;
            case "Cliente":
                transaction.add(R.id.contFragmets, fragmentCliente);
                break;
            case "Mantenimiento":
                transaction.add(R.id.contFragmets, fragmentMantenimiento);
                break;
        }

        transaction.commit();
    }
}