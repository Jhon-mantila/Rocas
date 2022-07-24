package com.example.rocas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tercer paso registrar el toolbar
        toolbar = (Toolbar) findViewById(R.id.tool_bar);

        setSupportActionBar(toolbar);

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

    //Activar el Menu de  tres puntos
    //sobre escribir metodos de activity
    @Override public boolean onCreateOptionsMenu(Menu mimenu){

        getMenuInflater().inflate(R.menu.menu_in_activity, mimenu);

        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){

        int id = opcion_menu.getItemId();

        if (id == R.id.configuracion){

            return true;

        }else if(id == R.id.info){
            //no le paso vista
            ejecutar_info(null);
            return true;

        }else if(id == R.id.salir){

            salir_app(null);
            return true;

        }else{

            return super.onOptionsItemSelected(opcion_menu);
        }
    }

    //Aca termina el menu de tres puntos....
}