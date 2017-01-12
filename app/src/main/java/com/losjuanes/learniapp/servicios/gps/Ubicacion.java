package com.losjuanes.learniapp.servicios.gps;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

public class Ubicacion implements LocationListener {
    private Double latitud;
    private Double longitud;

    public Ubicacion() {
        latitud = 0.0;
        longitud = 0.0;
    }

    @Override
    public void onLocationChanged(Location location) {
        latitud = location.getLatitude();
        longitud = location.getLongitude();
        Log.d("Latitud", String.valueOf(latitud));
        Log.d("Longitud", String.valueOf(longitud));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    /*if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
        LocationManager locationManager = (LocationManager) activity.getSystemService(activity.getApplicationContext()
                .LOCATION_SERVICE);


        Ubicacion ubicacion = new Ubicacion();

        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 0, ubicacion);
    }*/
}
