package com.losjuanes.learniapp.servicios.gps;

import android.content.Context;

public interface Gps {
    boolean locationPermission(Context context);
    int versionAndroidDispositivo();
}
