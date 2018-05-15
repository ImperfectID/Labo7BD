package com.a.labo7bd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.a.labo7bd.entidades.DBHelper;

public class MainActivity extends AppCompatActivity {

    private Button btn_registrar,btn_consultar,btn_consultarS, getBtn_consultarLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarControles();
        DBHelper.getInstance(this);

btn_registrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),activity_registrar.class);
        startActivity(intent);
    }
});

btn_consultar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),activity_modificar.class);
        startActivity(intent);
    }
});
    }

    private void inicializarControles() {
            btn_registrar = findViewById(R.id.mostrarRegistro);
            btn_consultar = findViewById(R.id.consultar_usuario);
    }
}