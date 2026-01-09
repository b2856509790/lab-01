package com.example.lab01;

import java.util.Date;

public class Sad extends Mood{
    public Sad() {
        super();
    }
    public Sad(Date date) {
        super(date);
    }

    @Override
    public String PetMood() {
        return "sad";
    }
}
