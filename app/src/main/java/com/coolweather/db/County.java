package com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by MRL on 01/03/2018.
 */

public class County extends DataSupport {
    public int id;
    public String countyName;
    public int weatherId;
    public int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}