package com.timbuchalka;

public class WeatherProvider {
    private static WeatherProvider weatherProvider = new WeatherProvider();
    private String [] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider(){
    }

    public static WeatherProvider getProvider(){
    }

    public String getCurrentWeather(Coordinates coordinates){

}
