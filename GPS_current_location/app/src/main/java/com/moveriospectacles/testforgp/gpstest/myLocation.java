package com.moveriospectacles.testforgp.gpstest;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class myLocation implements LocationListener {
    public static Location location;
    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
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
}
