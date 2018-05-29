package com.example.wfp.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;  // 外键

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String name) {
        this.cityName = name;
    }

    public void setCityCode(int code) {
        this.cityCode = code;
    }

    public int getId() {
        return this.id;
    }

    public String getCityName() {
        return this.cityName;
    }

    public int getCityCode() {
        return this.cityCode;
    }

    public int getProvinceId() {
        return this.provinceId;
    }

    public void setProvinceId(int id) {
        this.provinceId = id;
    }
}
