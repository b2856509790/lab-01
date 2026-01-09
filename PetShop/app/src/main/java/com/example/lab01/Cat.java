package com.example.lab01;

public class Cat extends Pet implements Pettable{
    public Cat(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public Void pet(){
        return null;
    }

}
