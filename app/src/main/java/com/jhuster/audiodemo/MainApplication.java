package com.jhuster.audiodemo;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {

    private static MainApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        Log.d("MainApplication", " getExternalFilesDir test file = " + getExternalFilesDir(null).getAbsolutePath() +
                "/test.wav");
    }

    public static MainApplication getInstance() {
        return context;
    }

}
