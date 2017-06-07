package com.trustlook.elemenzhang.iphelper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by elemenzhang on 2017/6/7.
 */

public class WebAPIBean  {
    /**
     * status : 1
     * info : OK
     * infocode : 10000
     * province : []
     * city : []
     * adcode : []
     * rectangle : []
     */
    @SerializedName("status")
    private String status;

    private String info;
    private String infocode;
    private List<?> province;
    private List<?> city;
    private List<?> adcode;
    private List<?> rectangle;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    public List<?> getProvince() {
        return province;
    }

    public void setProvince(List<?> province) {
        this.province = province;
    }

    public List<?> getCity() {
        return city;
    }

    public void setCity(List<?> city) {
        this.city = city;
    }

    public List<?> getAdcode() {
        return adcode;
    }

    public void setAdcode(List<?> adcode) {
        this.adcode = adcode;
    }

    public List<?> getRectangle() {
        return rectangle;
    }

    public void setRectangle(List<?> rectangle) {
        this.rectangle = rectangle;
    }
}
