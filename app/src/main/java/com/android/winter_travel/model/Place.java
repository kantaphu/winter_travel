package com.android.winter_travel.model;

public class Place {

    public String name;
    public String district;
    public int imageRes;
    public int imageRes2;
    public String text;


    public Place(String name, String district, int imageRes, int imageRes2, String text) {
        this.name = name;
        this.district = district;
        this.imageRes = imageRes;
        this.imageRes2 = imageRes2;
        this.text = text;
    }
}

