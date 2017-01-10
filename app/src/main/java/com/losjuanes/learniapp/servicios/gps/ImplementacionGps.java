package com.losjuanes.learniapp.servicios.gps;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

public class ImplementacionGps implements Gps {

    /**
     * Verifica si el permiso ACCESS_FINE_LOCATION feu dado
     *
     * @return true si el permiso fue dado, false en otro caso.
     */
    public boolean locationPermission(Context context) {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }

    /**
     * Obtendra la version de android del dispositivo ya que apartir de la version 23 Marshmallow
     * los permisos tienen que ser dados en tiempo de ejecucion.
     *
     * @return la version de android del dispositivo.
     */
    public int versionAndroidDispositivo(){
        return Build.VERSION.SDK_INT;
    }
}
