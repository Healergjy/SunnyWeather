package com.example.sunnyweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {


    public static  final String TOKEN = "CI9pOdF0sF8BjDPj";
    @SuppressLint("StaticFieldLeak")
    static public Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context =getApplicationContext();
    }
}
