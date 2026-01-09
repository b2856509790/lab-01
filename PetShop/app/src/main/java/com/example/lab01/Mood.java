package com.example.lab01;

import android.provider.ContactsContract;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public abstract String PetMood();

}
