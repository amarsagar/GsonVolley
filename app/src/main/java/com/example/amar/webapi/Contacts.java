package com.example.amar.webapi;

import com.google.gson.annotations.SerializedName;

/**
 * Created by amar on 9/7/2016.
 */
public class Contacts {
   @SerializedName("id")
    String id;

    @SerializedName("name")
    String name;
    @SerializedName("address")
    String address;
    @SerializedName("email")
    String email;
    @SerializedName("gender")
    String gender;
    @SerializedName("phonenumber")
    Phonenumber phonenumbers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Phonenumber getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(Phonenumber phonenumbers) {
        this.phonenumbers = phonenumbers;
    }
}
