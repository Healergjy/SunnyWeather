package com.example.sunnyweather.logic.dao;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.sunnyweather.SunnyWeatherApplication;
import com.example.sunnyweather.logic.model.Place;
import com.google.gson.Gson;

public class PlaceDao {
    public static void savePlace(Place place){
     sharedPreferences().edit().putString("place",new Gson().toJson(place)).commit();
    }
    public static Place getSavedPlace(){
       String placeJson=sharedPreferences().getString("place","");
       return new Gson().fromJson(placeJson,Place.class);
    }
    public static boolean isPlaceSaved(){
        return sharedPreferences().contains("place");
    }
    private static SharedPreferences sharedPreferences(){
        return SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE);
    }
}
