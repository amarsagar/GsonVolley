package com.example.amar.webapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by amar on 9/7/2016.
 */
public class ContactWrapper {
    @SerializedName("contacts")
    ArrayList<Contacts> contact;

    public ArrayList<Contacts> getContactlist() {
        return contact;
    }

    public void setContactlist(ArrayList<Contacts> contact) {
        this.contact = contact;
    }
}

