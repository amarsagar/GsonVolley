package com.example.amar.webapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amar on 9/7/2016.
 */
public class Phonenumber {
    @SerializedName("mobile")
    String mobile;
    @SerializedName("home")
    String home;
    @SerializedName("office")
    String office;

    public Phonenumber(String mobile, String office, String home) {
        this.mobile = mobile;
        this.office = office;
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}

