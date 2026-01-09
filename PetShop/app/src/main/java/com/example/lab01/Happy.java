package com.example.lab01;


import java.util.Date;

public class Happy extends Mood {
    public Happy() {
        super();
    }
    public Happy(Date date){
        super(date);
    }
    @Override
    public String PetMood() {
        return "happy";
    }
}
