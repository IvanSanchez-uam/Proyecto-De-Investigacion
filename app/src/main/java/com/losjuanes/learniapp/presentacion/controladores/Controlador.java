package com.losjuanes.learniapp.presentacion.controladores;

import android.app.Activity;

public interface Controlador {

    void pedirPermiso(Activity activity);
    void iniciaActivity(Activity activityInicio, Class activityDestino);
}

