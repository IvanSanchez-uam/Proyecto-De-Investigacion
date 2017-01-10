package com.losjuanes.learniapp.presentacion.vistas;

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;

import com.losjuanes.learniapp.R;

public class CuadrosDeDialogo {

    /**
     * Muestra un cuadro de dialogo para pedir nuevamente el permiso al usuario.
     * @param activity, donde sera mostrado el cuadro de dialogo.
     * @param CODIGO_PERMISO, codigo del permiso ACCESS_FINE_LOCATION.
     */
    public void cdPedirPermiso(final Activity activity, final int CODIGO_PERMISO){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        alertDialogBuilder.setMessage(activity.getResources().getString(R.string.msjSolicitarPermiso))
                .setCancelable(false)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                                CODIGO_PERMISO);
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        cdSinPermiso(activity);
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Muestra un cuadro de dialogo para informar al usaurio que debe hacer cuando no se tiene el permiso.
     * @param activity, donde sera mostrado el cuadro de dialogo.
     */
    public void cdSinPermiso(final Activity activity){
        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        alertDialogBuilder.setMessage(activity.getResources().getString(R.string.msjInfoPermiso))
                .setCancelable(false)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
