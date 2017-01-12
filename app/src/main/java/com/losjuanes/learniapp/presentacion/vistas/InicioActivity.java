package com.losjuanes.learniapp.presentacion.vistas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.losjuanes.learniapp.R;
import com.losjuanes.learniapp.presentacion.controladores.Controlador;
import com.losjuanes.learniapp.presentacion.controladores.ImplementacionControlador;

public class InicioActivity extends AppCompatActivity {
    private Controlador controlador;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        controlador = new ImplementacionControlador();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        //Se solicita el permiso.
        controlador.pedirPermiso(activity);
        Toast.makeText(activity, "Espera la respuesta del usuario acerca del permiso", Toast.LENGTH_LONG).show();

        //Se cambia a la actividad MapaActivity.
        controlador.iniciaActivity(activity, MapaActivity.class);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
