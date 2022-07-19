package com.example.rocas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //para ejecutar la actividad
    public void ejecutar_info(View vista){

        Intent i = new Intent(this, info_clase.class);
        //iniciar la actividad
        startActivity(i);
    }

    //salir de la app
    public void salir_app(View vista){
        finish();
    }
}