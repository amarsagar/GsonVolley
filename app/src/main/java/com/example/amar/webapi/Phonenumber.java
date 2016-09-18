package com.example.amar.webapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amar on 9/7/2016.
 */
public class Phonenumber {
    @SerializedName("mobile")
    int mobile;
    @SerializedName("home")
    int home;
    @SerializedName("office")
    int office;

    public Phonenumber(int mobile, int office, int home) {
        this.mobile = mobile;
        this.office = office;
        this.home = home;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }
}

