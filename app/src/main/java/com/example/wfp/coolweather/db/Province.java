package com.example.wfp.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String name) {
        this.provinceName = name;
    }

    public void setProvinceCode(int code) {
        this.provinceCode = code;
    }

    public int getId() {
        return this.id;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public int getProvinceCode() {
        return this.provinceCode;
    }
}
