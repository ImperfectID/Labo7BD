package com.a.labo7bd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.a.labo7bd.Datos.Persona;
import com.a.labo7bd.entidades.DBHelper;

public class activity_modificar extends AppCompatActivity {


    private EditText id,nombre;
    private Button btnBuscar, btnEliminar, btnLimpiar, btnActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);

        inicializarControles();





        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona p = DBHelper.myDB.findUser(id.getText().toString());
                if(p==null){
                    Toast.makeText(getApplicationContext(),"El usuario no fue encontrado",Toast.LENGTH_LONG).show();
                    limpiar();

                }else {
                    nombre.setText(p.getNombre());

                }
            }
        });

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();
            }
        });
        btnEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpiar();
            }
        });
    }




    private void limpiar(){
        nombre.setText("");
        id.setText("");

    }

    private void inicializarControles() {
        id=findViewById(R.id.txtIdM);
        nombre=findViewById(R.id.txtNombreM);
        btnBuscar=findViewById(R.id.btnBuscarM);
        btnActualizar=findViewById(R.id.btnActualizarM);
        btnLimpiar=findViewById(R.id.btnLimpiarM);
        btnEliminar=findViewById(R.id.btnEliminarM);

    }
}
