package com.losjuanes.learniapp.presentacion.controladores;

import android.app.Activity;

import com.losjuanes.learniapp.negocio.servicios.ServicioObtenerPermiso;

public class ControladorInicioActivity {
    private ServicioObtenerPermiso servicioObtenerPermiso = new ServicioObtenerPermiso();

    public void pedirPermiso(Activity activity){
        servicioObtenerPermiso.obtenerPermiso(activity);

        /**
         * CREAR VARIABLES D CONFIGURACION
         * **************************************************
         * *****************************************************
         */
    }
}
