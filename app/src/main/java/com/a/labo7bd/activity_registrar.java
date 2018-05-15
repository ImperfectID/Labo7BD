package com.a.labo7bd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.a.labo7bd.Datos.Persona;
import com.a.labo7bd.entidades.DBHelper;

public class activity_registrar extends AppCompatActivity {

    private EditText txtId, txtNombre;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        inicializarControles();



        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = DBHelper.myDB.add(new Persona(
                        txtId.getText().toString(),txtNombre.getText().toString()

                ));
                if (flag){
                    Log.d("Edit",txtNombre.getText().toString());

                }
            }
        });
    }

    private void inicializarControles() {
        btnEnviar = findViewById(R.id.btnRegistrar);
        txtId =findViewById(R.id.txtid);
        txtNombre=findViewById(R.id.txtNombre);

    }
}
