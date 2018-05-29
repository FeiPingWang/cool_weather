package com.example.wfp.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;     // 外键

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String name) {
        this.countyName = name;
    }

    public void setWeatherId(int code) {
        this.weatherId = code;
    }

    public int getId() {
        return this.id;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public int getWeatherId() {
        return this.weatherId;
    }

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int id) {
        this.cityId = id;
    }
}
