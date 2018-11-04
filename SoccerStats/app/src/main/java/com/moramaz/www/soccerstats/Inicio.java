package com.moramaz.www.soccerstats;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    private Conexion conexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
        conexion = new Conexion();
        Button inicio = (Button) findViewById(R.id.button);
        inicio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nombre, contra;
                nombre = (String) ((EditText) findViewById(R.id.txtuser)).getText().toString();
                contra = (String) ((EditText) findViewById(R.id.txtpass)).getText().toString();
                if(conexion.iniciarSesion(nombre, contra)){
                    Intent i = new Intent(getApplicationContext(), Principal.class);
                    startActivity(i);
                }else{
                    Snackbar.make(v, "Error al intentar iniciar sesión.", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            }
        });
    }
}
