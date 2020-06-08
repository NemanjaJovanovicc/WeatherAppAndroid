package com.example.weatherapp.Common;

import androidx.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "c7d4c1482040247c5d1a67bfe0a7d758";
    public static String API_LINK = "https://samples.openweathermap.org/data/2.5/weather";

    @NonNull
    public static String apiRequest(String lat, String lng) {
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=c7d4c1482040247c5d1a67bfe0a7d758",lat,lng,API_KEY));
        return sb.toString();
    }
    //=c%s&units=metric

    public static String unixTimeStampToDateTime(double unixTimeStamp) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) unixTimeStamp*1000);
        return dateFormat.format(date);
    }

    public static String getImage(String icon) {
        return String.format("https://openweathermap.org/img/w/%s.png",icon);
    }

    public static String getDateNow() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyyy HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
