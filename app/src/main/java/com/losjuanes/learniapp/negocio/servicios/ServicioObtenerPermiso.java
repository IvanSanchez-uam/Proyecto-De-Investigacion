package com.losjuanes.learniapp.negocio.servicios;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;

import com.losjuanes.learniapp.presentacion.vistas.CuadrosDeDialogo;
import com.losjuanes.learniapp.servicios.gps.Gps;
import com.losjuanes.learniapp.servicios.gps.ImplementacionGps;

public class ServicioObtenerPermiso implements ActivityCompat.OnRequestPermissionsResultCallback{
    Gps gps = new ImplementacionGps();

    //Identificador para la solicitud del permiso ACCESS_FINE_LOCATION
    // usado en obtenerPermiso(Activity activity) y
    //onRequestPermissionsResult().
    private final static int CODIGO_PERMISO = 1;

    private static Activity activityInvocadora;

    /**
     *Obtiene el permiso en caso de que la version de android del dispositivo sea Marshmallow o superior.
     */
    public void obtenerPermiso(Activity activity) {
        activityInvocadora = activity;
        if (gps.versionAndroidDispositivo() >= Build.VERSION_CODES.M) { //Se verifica la version de android del dispositivo.
            if (!gps.locationPermission(activity.getApplicationContext())){ //Se verifica si los permisos aun no han sido dados.
                ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        CODIGO_PERMISO);
            }
        }
    }

    /**
     * Metodo de la interfaz ActivityCompat.OnRequestPermissionsResultCallback
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case CODIGO_PERMISO: {
                // Cuando el usuario rechaza el permiso.
                if (grantResults.length > 0
                        && grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                        new CuadrosDeDialogo().cdPedirPermiso(activityInvocadora, CODIGO_PERMISO);
                }
                //else{
                //    El usuario acepto el permiso
                //}

                break;
            }
        }
    }
}
