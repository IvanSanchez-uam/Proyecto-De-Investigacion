package com.losjuanes.learniapp.presentacion.controladores;

import android.app.Activity;
import android.content.Intent;

import com.losjuanes.learniapp.negocio.Negocio;
import com.losjuanes.learniapp.negocio.servicios.ServicioObtenerPermiso;

public class ImplementacionControlador implements Controlador {
    private Negocio negocio= new ServicioObtenerPermiso();

    /**
     * Solicita el locationPermission a la capa de servicios.
     *
     * @param activity, es la que solicita el permiso.
     */
    @Override
    public void pedirPermiso(Activity activity) {
        negocio.obtenerPermiso(activity);
    }

    /**
     * Inicia la transicion de activityInicio a activityDestino.
     *
     * @param activityInicio, activity que inicia la transicion.
     * @param activityDestino, activity destino de la transicion.
     */
    @Override
    public void iniciaActivity(Activity activityInicio, Class activityDestino) {
        activityInicio.startActivity(new Intent(activityInicio,activityDestino));
    }
}
