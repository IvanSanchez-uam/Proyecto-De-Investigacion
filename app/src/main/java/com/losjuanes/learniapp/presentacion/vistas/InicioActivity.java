package com.losjuanes.learniapp.presentacion.vistas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.losjuanes.learniapp.R;
import com.losjuanes.learniapp.presentacion.controladores.ControladorInicioActivity;

public class InicioActivity extends AppCompatActivity {
    private ControladorInicioActivity controladorInicioActivity;
    private Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        controladorInicioActivity = new ControladorInicioActivity();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        controladorInicioActivity.pedirPermiso(activity);
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
